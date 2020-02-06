#include <stdio.h>
#include <stdlib.h>
#include "warlib.h"

int main(int argc, char* argv[])
{
    if(argc!=5) {
		printf("USAGE: %s TIPO_DIVISIONE SOLDIERS ATTACK DEFENSE\n", argv[0]);
		return -1;
	}

    Division* kempff_panzer_division = create(ARMORED, 1200, 42, 80);

    Division* reggimento2 = create(atoi(argv[1]), atoi(argv[2]), atoi(argv[3]), atoi(argv[4]));

    int whoWin = battle(*kempff_panzer_division, *reggimento2);

    printf("Simulazione di battaglia tra:\n");
    show_division(*kempff_panzer_division);
    show_division(*reggimento2);
    printf("Vittoria di: ");
    if(whoWin == -1){ printf("predefinita"); }
    if(whoWin == 0){ printf("nessuno"); }
    if(whoWin == 1){ printf("divisione creata"); }

    eliminate(kempff_panzer_division);
    eliminate(reggimento2);
}
