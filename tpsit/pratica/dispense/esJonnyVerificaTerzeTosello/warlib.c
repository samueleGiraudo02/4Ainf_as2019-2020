/* warlib.c */

#include "warlib.h"

void show_type(Division_Type toShow){
    printf("type: ");
    switch(toShow){
        case MIXED:
            printf("MIXED");
            break;
        case INFANTRY:
            printf("INFANTRY");
            break;
        case CAVALRY:
            printf("CAVALRY");
            break;
        case ARMORED:
            printf("ARMORED");
            break;
        case MOUNTAIN:
            printf("MOUNTAIN");
            break;
        case AIRBORNE:
            printf("AIRBORNE");
            break;
        case ARTILLERY:
            printf("ARTILLERY");
            break;
    }
}

Division* create(int type, int soldiers, int attack, int defense){
    Division* ret = (Division*) malloc(sizeof(Division));

    ret->type = type;
    ret->nr_of_soldiers = soldiers;
    ret->attack = attack;
    ret->defense = defense;

    return ret;
}

void eliminate(Division* toEliminate){
    free(toEliminate);
}

void show_division(Division toShow){
    show_type(toShow.type);
    printf(" soldiers: %d", toShow.nr_of_soldiers);
    printf(" attack: %d", toShow.attack);
    printf(" defense: %d", toShow.defense);
    printf("\n");
}

int battle(Division a, Division b){
    int perditeA = (b.attack - a.defense) * a.nr_of_soldiers / 100;
    int perditeB = (a.attack - b.defense) * b.nr_of_soldiers / 100;

    if(perditeA > a.nr_of_soldiers){ perditeA = a.nr_of_soldiers; }
    if(perditeB > b.nr_of_soldiers){ perditeB = b.nr_of_soldiers; }

    if(perditeB > perditeA){ return -1; }
    if(perditeB == perditeA){ return 0; }
    if(perditeB < perditeA){ return 1; }
}
