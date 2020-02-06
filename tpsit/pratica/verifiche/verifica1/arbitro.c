#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "mutex.h"
#include "shared.h"

#define NUMBER_TEAM_MEMBERS 5
#define SHM_KEY 4242
#define MTX_KEY 4243

int main(int argc, char *argv[])
{
	printf("Creazione dell'ambiente per l'esecuzione...\n");
	int* shm = (int*) sharedCreate(SHM_KEY, sizeof(int), &shmId);
	int mtxId = mutexCreate(MTX_KEY, 0);

	*shm = 0;

	int pid = getpid();

	char* teamA[]= {"giocatore", "A"};
	for(int i=0; i<NUMBER_TEAM_MEMBERS && pid; i++)
    {
       pid = fork();
    }

	if (!pid)
	{
	    execvp(*teamA, teamA);
	}

	printf("Squadra A: creati %d giocatori.\n", NUMBER_TEAM_MEMBERS);

	//quando esce

	char* teamB = {"giocatore", "B"};
	for(int i=0; i<NUMBER_TEAM_MEMBERS && pid; i++)
    {
        pid = fork();
    }

	if (!pid)
    {
       execvp(*teamB, teamB);
    }

	printf("Squadra B: creati %d giocatori.\n", NUMBER_TEAM_MEMBERS);

	printf("Inizia la gara...\n");
	mutexUnlock(mtxId);

	printf("Attesa della fine dei %d processi giocatore...\n", NUMBER_TEAM_MEMBERS *2);
	for(i=0; i<(NUMBER_TEAM_MEMBERS*2); i++)
    {
        waitpid(null);
    }

	printf("Posizione al termine: %d\n", *shm);
	if (*shm)//se diverso da 0
    {
        printf("Ha vinto la squadra %s\n", (*shm>0)? "B":"A");
    }

	else printf("Pareggio.\n");

	mutexRemove(mtxId);
	sharedRemove(shmId);

	return 0;
}
