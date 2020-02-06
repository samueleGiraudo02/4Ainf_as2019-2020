#include<stdlib.h>
#include<stdio.h>
#include<string.h>

//fare una copia della sringa nello heap
char *strDup(char*s)
{
    char *ret;
    char *temp;
    int l;
    l=strlen(s)+1;
    temp* = ret* = (char*) malloc(sizeof(char)*l);
    //fine del vettore quando arrivo a \0
    for(;*temp=*s;s++,temp++)
    {

    }
    return ret;
}

//comparare stringhe
int cmpStr(char *s1, char *s2)
{
    if(*s1>*s2)
    {
        return -1;
    }
    if(*s1<*s2)
    {
        return 1;
    }
    if(*s1)
    {
        return cmpStr(++s1,++s2);
    }
    return 0;
}

//input di una stringa
char *inputStr()
{
    char temp*;
    int i;
    for(i=0;((temp[i] = getChar(i)) != '\n'; i++){}
    temp[i]='\n';
    return dupStr;
}

//se un caratere funge da separatore

char **split(char *s, char c)
{

}
