#include "include/mutex.h"
#include <stdio.h>


#define MAX_DELAY 5
#define IPC_KEY 2034

int main (int argc, char *argv[])
{
    int mutex;
    int n, i, pid;

    if (argc!=2) {
        printf ("USAGE:%s NUM_PROCESSI\n", argv[0]);
        return (-1);
    }

    n = atoi (argv[1]);
    printf("Creazione del semaforo...\n");
    mutex = mutexCreate (IPC_KEY, 0);

    printf("Creazione dei %d processi in gara...\n", n);
    pid = getpid();
    for (i = 0; (i < n) && (pid) ; i++)
    {
        pid = fork();
    }

    if(pid) {
        /* questo e' il processo padre */
        printf ("Premi ENTER per sbloccare il semaforo...\n");
        getchar();
        mutexUnlock(mutex);
        for (i = 0; i < n; i++)
            waitpid(-1, NULL,0);
        printf ("Distruggo il semaforo...\n");
        mutexRemove(mutex);
    }
    else {
        /* questo e' un processo figlio */
        printf ("[%d] Pronto alla griglia di partenza\n", getpid());
        mutexLock(mutex);
        mutexUnlock(mutex);
        srand(getpid()+time(NULL));
        sleep(rand()%MAX_DELAY);
        printf ("[%d] Taglia il traguardo\n", getpid());
    }
    return 0;
}
