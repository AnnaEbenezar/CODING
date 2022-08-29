#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX_LIMIT 20 


int main()
{
    char str[MAX_LIMIT];
    fgets(str, MAX_LIMIT, stdin);
    printf("%s", str);
    int tracker[10] = {0,0,0,0,0,0,0,0,0,0};

    for(int i=0; i < strlen(str) - 1; i++) 
    {
        char ch = str[i];
        int temp = atoi(&ch);
        //*(num_digits + temp) += 1;
        tracker[temp] += 1;
    }

    for(int j=0; j < 10; j++){
        if (tracker[j] > 1)
        printf("Num %d is repeated %d\n", j, tracker[j]);
    }

    return 0;
}