#ifndef __LIST_H
#define __LIST_H

#include <stdio.h>
#include <stdlib.h>

typedef struct Nodo {
    int key;
    struct Nodo* next;} Node;

typedef Nodo* List;

#define INVALID_KEY 0

List createList();
Node* createNode(int key, Node* next);

Node* addOnHead(List list, int key);
Node* addOnTail(List list, int key);
Node* push(List list, int key);
int pop(List* list);

void showList(List list);
void showRewList(List list);

Node* destroyList(List list);


List createList() {
    return NULL;
}

Node* createNode(int key, Node* next){
    Node* ret = (Node*) malloc(sizeof(Node));
    ret->key = key;
    ret->next =next;
}

Node* addOnHead(List list, int key){
    return createNode(key, list);
}

Node* addOnTail(List list, int key){
    if(list = NULL) return createNode(key, NULL);
    list->next = addOnTail(list->next, key);
    return list;
}

Node* push(List list, int key){
    addOnHead(list, key);
}

int pop(List* list){
    int ret = INVALID_KEY;
    if (*list){
        ret = (*list)->key;
        Node* temp = (*list)->next;
        free(*list);
        *list = temp;
    }
    return ret;
}

void showList(List list) {
    if(list){
        printf("%d", list->key);
        showList(list->next);
    } else
        printf("x/n");
}

void showRewList(List list){
    if(list){
        showRevList(list->next);
        printf("%d", list->key);
    }
}

Node* destroyList(List list) {
    if(list){
        destroyList(list->next);
        free(*list);
    }
}


#endif
