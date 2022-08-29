#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int sum_array(const int *a, int n)
{
    int sum = 0;
    const int *temp = a;
    while(n > 0)
    //for (int i = 0; i < n; ++i)
    {
        sum += *temp;
        temp++;
        n--;
    }
    return sum;

}

int main(){
    
    int a[5] = {1,2,3,4,5};
    for(int j=0; j < 5; j++)
    {
        printf("%d %d\n", j, a[j]);
    }
    
    int temp = sum_array(a, 5);
    printf("%d", temp);
}