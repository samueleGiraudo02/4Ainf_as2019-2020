#include <stdio.h>
#include <stdlib.h>

typedef enum{
    MIXED,
    INFANTRY,
    CAVARLY,
    ARMORED,
    MOUNTAIN,
    AIRBORNE,
    ARTILLERY
}Division_type;

typedef struct{
    Division_type type;
    int nr_of_soldiers;
    int attack;
    int defense;
}Division;

void show_type(Division_type show);
Division* create(int type, int soldiers, int attack, int defense);
Division* delate(Division*);
void show_division(Division);
int battle(Division a, Division b);

void show_type(Division_type show){
    printf("type: ");
    switch(show){
        case MIXED:
            printf("MIXED");
            break;
        case INFANTRY:
            printf("INFANTRY");
            break;
        case CAVARLY:
            printf("CAVARLY");
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

Division* delate(Division* del){

    free(del);

    return del;
}

void show_division(Division){
    printf("La divisione è: %d,%d,%d,%d", Division.type, Division.soldiers,Division.attack, Division.defense);
}

int battle(Division a, Division b)
{
    int valore, valore2, perdite1, perdite2;
    valore=a.attack%100;
    valore2=b.defense%100;
    perdite1=(valore - valore2) * b.nr_of_soldiers / 100;
    valore=b.attack%100;
    valore2=a.defense%100;
    perdite1=(valore - valore2) * a.nr_of_soldiers / 100;
    if(perdite1<perdite2)
    {
        return perdite1;
    }
    else
    {
        return perdite2;
    }

}
