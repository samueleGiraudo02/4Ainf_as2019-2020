#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <stdlib.h>

typedef struct{
    pthread_mutex_t mtx_id;
    int data;
    int cicli;
} Param;

typedef struct{
    int somma;
    int num;
} VarRitorno;

void* prod(void *);
void* cons(void *);

int main(int argc, char **argv)
{
    if (argc != 2){
        printf("USAGE: %s CICLI:", argv[0]);
        return -1;
    }
    
    pthread_t cons_id1, cons_id2, cons_id3, prod_id;
    Param param;
    param.cicli = atoi(argv[1]);
    param.data = 0;

    srand(time(NULL));

    //creazione del mutex
    int rc = pthread_mutex_init(&param.mtx_id, NULL);
    if (rc != 0){
        printf("Errore creazione muutex...\n");
        return -2;
    }

    //creazione del thread produttore
    rc = pthread_create(&prod_id, NULL, prod, (void*)&param);
    if (rc != 0){
        printf("Errore creazione produttore...\n");
        return -3;
    }

    //creazione del consumatore 1
    rc = pthread_create(&cons_id1, NULL, cons, (void*)&param);
    if (rc != 0){
       printf("Errore creazione 1o consumatori...\n");
       return -4;
    }

    //creazione del consumatore 2
    rc = pthread_create(&cons_id2, NULL, cons, (void*)&param);
    if (rc != 0){
        printf("Errore creazione 2o consumatori...\n");
        return -5;
    }

    //creazione del consumatore 3
    rc = pthread_create(&cons_id3, NULL, cons, (void*)&param);
    if (rc != 0){
        printf("Errore creazione 3o consumatori...\n");
       return -6;
    }

    VarRitorno *varCons1;
    VarRitorno *varCons2;
    VarRitorno *varCons3;
    VarRitorno *varProd;

    //aspettiamo i thread
    pthread_join(prod_id, (void**) &varProd);
    pthread_join(cons_id1, (void**) &varCons1);
    pthread_join(cons_id2, (void**) &varCons2);
    pthread_join(cons_id3, (void**) &varCons3);

    //cerco tra i thread chi ha la somma maggiore
    if (varCons1->somma > varCons2->somma && (varCons1->somma > varCons3->somma))
    {
        printf("\nIl thread che ha la somma maggiore è il primo \n");
    }
    
    if (varCons2->somma > varCons1->somma && (varCons2->somma > varCons3->somma))
    {
        printf("\nIl thread che ha la somma maggiore è il secondo \n");
    }else{
        printf("\nIl thread che ha la somma maggiore è il terzo \n");
    }

    //cerco il thread che ha avuto accesso a più numeri
    if (varCons1->num > varCons2->num && (varCons1->num > varCons3->num))
    {
        printf("\nIl thread che ha avuto accesso a più numeri è il primo \n");
    }
   
    if (varCons2->num > varCons1->num && (varCons2->num > varCons3->num))
    {
        printf("\nIl thread che ha avuto accesso a più numeri è il secondo \n");
    }else{
        printf("\nIl thread che ha avuto accesso a più numeri è il terzo \n");
    }

    //controllo se somma totale produttore = somma totale consumatori
    int somCons = varCons1->somma + varCons2->somma + varCons3->somma;
    if(somCons == varProd->somma){
        printf("\n\nLa somma dei numeri consumati e prodotti è uguale\n");
    }else{
        printf("\n\nLa somma dei numeri consumati e prodotti non è uguale, ERRORE!\n");
    }

    //controllo se i numeri prodotti da produttore = somma conteggi consumatori
    int numCons= varCons1->num + varCons2->num + varCons3->num;
    if(numCons == varProd->num){
	   printf("conteggio dei numeri prodotti è uguale alla somma dei conteggi dei consumatori\n\n");
    }else{
        printf("conteggio dei numeri prodotti non è uguale alla somma dei conteggi dei consumatori, ERRORE!\n\n");
    }

    free(varCons1);
    free(varCons2);
    free(varCons3);

    return 0;
}

void* prod(void* p)
{
    Param *param = (Param *) p;
    VarRitorno *ret = (VarRitorno *)malloc(sizeof(VarRitorno));

    for (int i=0; i <= param->cicli;)
    {
        if (param->data == 0){
            pthread_mutex_lock(&param->mtx_id);
            if (i < param->cicli){
                param->data = rand() % 20 + 1;
                ret->somma = param->data;
	            ret->num = ret->num + 1;
                i++;
            }else if (i == param->cicli){
                param->data = -1;
                i++;
            }
            pthread_mutex_unlock(&param->mtx_id);
        }
    }
    pthread_exit(ret);
}

void* cons(void* p)
{
    Param *param = (Param *) p;
    VarRitorno *ret = (VarRitorno *)malloc(sizeof(VarRitorno));

    do
    {
        pthread_mutex_lock(&param->mtx_id);
        if (param->data > 0){
            ret->somma += param->data;
            ret->num += 1;
            param->data = 0;
        }
	    pthread_mutex_unlock(&param->mtx_id);

    }while(param->data != -1);

    pthread_exit(ret);
}
