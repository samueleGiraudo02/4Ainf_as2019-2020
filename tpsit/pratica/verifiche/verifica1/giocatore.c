#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#include "mutex.h"
#include "shared.h"

#define CICLI 50
#define ATTESA_MIN 100
#define ATTESA_MAX 1000
#define CONTRIBUTO 10

int main(int argc, char *argv[])
{
	if(argc!=2)
    {
		printf("USAGE:%s TEAM(A|B)\n", argv[0]);
		return (-1);
	}

	int* shm =(int *) sharedFind(SHM_KEY, &shmId);
	int mtxId = mutexFind(MTX_KEY);

	srand(time(NULL));

	//moltiplicatore
	int team = 1;
	if (*argv[1] == 'A')
    {
        team = -1;
    }

    int flag = 1;

	for (int i=0; i<CICLI && flag; i++)
    {
		mutexLock(mtxId);
		if(*shm >100)
        {
            flag = 0;
        }
		*shm = *shm + team * (rand()*(CONTRIBUTO + 1));
		mutexUnlock(mtxId);
		usleep(rand() % ( (ATTESA_MAX-ATTESA_MIN+1) + ATTESA_MIN) );
		if(flag)
        {
            *shm = *shm;
        }
	}

	return 0;
}
