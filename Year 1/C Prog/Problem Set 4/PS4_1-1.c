#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX_LIMIT 20

int main() 
{
    FILE  * fpointer = fopen("input.txt", "r");
    char line = getc(fpointer);
    int tracker[10] = {0,0,0,0,0,0,0,0,0,0};
    while (line != EOF) 
    {
        int temp = atoi(&line);
        tracker[temp] += 1;
        putchar(line);
        line = getc(fpointer);
    }
    fclose(fpointer);
    printf("\n");
    for(int j=0; j < 10; j++)
    {
        if (tracker[j] > 1)
        printf("Num %d is repeated %d\n", j, tracker[j]);
    }
    

    return 0;
}