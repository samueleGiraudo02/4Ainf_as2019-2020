#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#define MAX_VETT=4096

//fare una copia della sringa nello heap
char *strDup(char*s)
{
    char *ret;
    char *temp;
    int l;
    l=strlen(s)+1;
    temp* = ret* = (char*) malloc(sizeof(char)*l);
    //fine del vettore quando arrivo a \0
    for(;*temp=*s;s++,temp++){}
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
    char **ret;
    char *temp[MAX_VET];
    int i_temp;
    temp[i_temp] = strtok(s,c);
    for(;temp[i_temp]= dupStr(strtok(NULL,c));i_temp++){}
    ret=(char**)malloc(sizeof(char*)*i_temp);
    for(int i=0; i<= i_temp; i++)
    {
        *(ret+i) = temp[i];
    }
    return ret;
}

//ribaltare una stringa
char *revStr(char *s)
{
    int sx=0, i;
    int dx=strlen(s);
    char *jolly[2]={'0','\0'};
    for(i=0;sx<dx;s++,d++)
    {
        jolly[0]=s[dx];
        s[dx]=s[sx];
        s[sx]=jolly[0];
    }
    return s;
}
