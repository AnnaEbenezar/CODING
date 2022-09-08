#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=0;
    while (i>-1) {
        i += 1;
        if (i<0) {
            printf("i was %d before\n", i-1);
            printf("i is %d now \n", i);
        }
    }
    return 0;
}

