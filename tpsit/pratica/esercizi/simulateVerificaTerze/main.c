#include <stdio.h>
#include <stdlib.h>
#include "warLibrary.h"


int main()
{
    int vincBattaglia;

    Division* regg1 = create(ARMORED, 1200, 42, 80);

    Division* regg2 = create(INFANTRY, 2800, 51, 63);

    vincBattaglia= battle(*regg1,*regg2);

    printf("Simulazione di battaglia tra:\n");
    show_division(*regg1);
    show_division(*regg2);

    eliminate(regg1);
    eliminate(regg2);

    return 0;
}

