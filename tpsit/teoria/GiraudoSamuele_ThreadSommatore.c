#include <pthread.h> 
#include <stdio.h> 
#include <unistd.h> 
#include <string.h> 
#include <stdlib.h>

void* sommatore(void*);
typedef struct {
    int a;
    int b;
} Parametri;

int main(int argc, char const *argv[])
{
    if (argc !=3) {
       printf("USAGE: %s PARAMETRO1 PARAMETRO2\n", argv[0]);
	   return -1;
	}

	Parametri par;

	par.a = atoi(argv[1]); 
	par.b = atoi(argv[2]);

	int pid = getpid();

	pthread_t thread_id;
	int th = pthread_create( &thread_id, NULL, sommatore, (void*)&par); 

	if (th != 0) 
	{
		printf("[%d] Errore nella creazione del thread.\n", pid);
		return -2; 
	}
	
	int * somma;
	pthread_join(thread_id, (void**) &somma);
	printf("[%d] La somma è %d.\n", pid, (int) *somma); 
	free(somma);
	
	return 0; 
}

void* sommatore(void* som) 
{
    Parametri* p = (Parametri*) som;
    
    int* ret = (int*) malloc(sizeof(int));
	*ret = p->a + p->b;
	
	pthread_exit(ret); 
}

