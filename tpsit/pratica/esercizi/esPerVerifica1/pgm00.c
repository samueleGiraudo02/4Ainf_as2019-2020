#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#include "shm.h"
#include "mutex.h"

#define PATH_SHM_KEY 4242
#define PATH_MTX_KEY 4243

typedef enum {CLEAN, DIRTY} Stone;

void errore(char*s, int n);

int main(int argc, char **argv) {
	if (argc != 2) {
		printf("USAGE:%s #STONES\n", *argv);
		return -1;
	}

	//prende il numero di pietre
	int num_stone = atoi(*(argv+1));

	//dichiara un mutex
	int mtx;
	//quando è a zero posso entrare (0 processi dentro)
	//creo mutex con valore 0 vuol dire che è bloccato
	mtx = mutexCreate(PATH_MTX_KEY,0);
    if(mtx == 0)
    {
        printf("mtx_error");
        return -2;
    }

	//va a creare in shared memory
	Stone* stones;
	int shm;
	//sizeof misura cìquanto pesa
	stones = (Stone*) shm_create(PATH_SHM_KEY, sizeof(Stone)* num_stone, &shm);
	if (stones == NULL)
    {
        printf("shm_error");
        return -3;
    }

	//inizializziamo vettore
	for(int i=0; i<num_stone; i++)
    {
        *(stones+i) = CLEAN;
    }

	*(stones + num_stone /2) = DIRTY;

	//argv+1 sta andando avanti
	//creo una linea di comando
	//è come sostituire il code segment
	char* pet = {"pet", *(argv+1), NULL};
	char* master = {"master", *(argv+1), NULL};

	if (fork())
    {
        //va a sostituire il codice nel code segment(stesso del padre)
        //esegue quello che c'è nel parametro
        //primo mandiamo il comando che vogliamo lanciare
		execvp(*pet, pet);
		errore("execvp(pet)", -1);
    }

	if (fork())
    {
		execvp(*master, master);
		errore("execvp(master)", -1);
	}
    //sblocco semaforo
	mutexUnlock(mtx);

	//è come fare join con due processi da aspettare
	//non so il pid quindi passo null
	waitpid(NULL);
	waitpid(NULL);

	mutexRemove(mtx);
	shmRemove(shm);

	return 0;
}

void errore(char*s, int n) {
	printf("ERRORE su %s\n", s);
	printf("ERRNO:%d %s\n",
		errno, strerror(errno));
	printf("exit with return code %d\n", n);
	exit(n);
}
