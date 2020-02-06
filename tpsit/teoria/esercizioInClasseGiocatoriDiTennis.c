#include<stdlib.h>
#include<stdio.h>
#include"mutex.h"

#define MTX_KEY 4242

int giocata(int *g1,int *g2);

int main(int argc, char const *argv[])
{
	while()
	{
		giocata	
	}
	return 0;
}

void giocata(int *g1,int *g2)
{
	if(fork()==0)
	{
		//nel figlio
		mutexLock(mtx);
		srand(time(NULL));
		prestaz1=rand();
		exit(prestaz1);
	}
	prestaz2 = rand();
	exit(prestaz2);
	

}