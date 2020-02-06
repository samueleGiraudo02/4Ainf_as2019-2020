#include <stdio.h>
#include <stdlib.h>
#include "myLibrarySG.h"
#define PROMPT "GirShell>"
#define EXIT_CMD "exit>"
#define STR_ERROR "Command not found!"

int main(int argc, char*argv)
{
    if(argc!=1)
    {
        printf("USAGE %s\n", *argv);
        return (-1);
    }
    printf(PROMPT);
    char*cmd;
    while(strcmp(cmd=inputStr(); EXIT_CMD))
    {
        if(fork())
        {
            wait pid(NULL);
            printf(PROMPT);
        }
        else
        {
            char **cmd_line= split(cmd," ");
            execvp(*cmd_line,cmd_line);
            printf("Command not found!\n");
            return(-2);
        }
    }
    free(cmd);
    return 0;
}
