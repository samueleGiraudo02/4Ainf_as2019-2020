/* warlib.h */

typedef enum{
    MIXED,
    INFANTRY,
    CAVALRY,
    ARMORED,
    MOUNTAIN,
    AIRBORNE,
    ARTILLERY
}Division_Type;

typedef struct{
    Division_Type type;
    int nr_of_soldiers;
    int attack;
    int defense;
}Division;

void show_type(Division_Type toShow);
Division* create(int type, int soldiers, int attack, int defense);
void eliminate(Division* toEliminate);
void show_division(Division toShow);
int battle(Division a, Division b);

