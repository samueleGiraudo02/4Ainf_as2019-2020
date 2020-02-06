#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>
#include <time.h>

#include "shm.h"
#include "mutex.h"

#define PATH_SHM_KEY 4242
#define PATH_MTX_KEY 4243
#define MAX_WAIT 1000

typedef enum {CLEAN, DIRTY} Stone;

int isDirty(Stone *, int);

int main(int argc, char **argv)
{
	if (argc != 2) {
		printf("USAGE:%s #STONES\n", *argv);
		return -1;
	}

	int num_stone = atoi(*(argv+1));

	//cerca il mutex gia creato
	//cercare semaforo per bloccarlo
	int mtx;
	mtx = mutexFind(PATH_MTX_KEY);

	if(mtx == 0)
		errore("mtxFind()", -2);

	Stone* stones;
	//dentro shared memory posso prendere il vettore
	int shm;
	stones = (Stone*) shm_find(PATH_SHM_KEY, &shm);
	if (stones == NULL)
		errore("shmFind()", -3);

	srand(time(NULL));
	int position = num_stone /2;

	//zona critica, non puo' entrare nessuno
	while(isDirty(stones, num_stone)) {
            //qua codice si blocca
		mutexLock(mtx);
		*(stones+position) = DIRTY;
		mutexUnlock(mtx);
		position = (position +1) % num_stone;
		sleep (rand() % MAX_WAIT);
	}

	return 0;
}
//se riesce a pulire tutte le pietre finiamo tutto
//von quesat funzione finiscono i processi
int isDirty(Stone * stone, int len) {
	for (int i= 0; i<len; i++)
		if (*(stone+i) == DIRTY)
			return 1;
	return 0;
}

