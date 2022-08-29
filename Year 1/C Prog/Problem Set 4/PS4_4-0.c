#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void fill_zeros(int *a, int n)
{
    int *temp = a;
    while (n > 0)
    {
        *temp = 0;
        temp++;
        n--;
    }
}

int main() 
{
    int a[5] = {1,2,3,4,5};
    for(int j=0; j < 5; j++)
    {
        printf("%d %d\n", j, a[j]);
    }

    fill_zeros(a, 5);
    for(int j=0; j < 5; j++)
    {
        printf("%d %d\n", j, a[j]);
    }  
}