#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void find_two_largest(const int *a, int n, int *largest, int *second_largest)
{
     int *tempo = a;
     int i = 0;
     while (i < n)
     //for (int i = 0; i < n; i++)
     {
         int tempn = n;
         int j = 0;
         while (tempn > j)
         //for (int j = 0; j < n; j++)
         {
             if (*(tempo + j) < *(tempo + i))
             {
                 int tmp = *(tempo + i);
                 *(tempo + i) = *(tempo + j);
                 *(tempo + j) = tmp;
             }
             j++;
         }
         i++;
     }
     *largest = *tempo;
     *second_largest = *(tempo + 1);
}


int main() 
{

    int a[5] = {1,2,3,4,5};
    for(int j=0; j < 5; j++)
    {
        printf("%d %d\n", j, a[j]);
    }

    int largest = 0;
    int second_largest = 0;
    find_two_largest(a, 5, &largest, &second_largest);
    printf("%d %d", largest, second_largest);

}








//https://en.wikiversity.org/wiki/C_Source_Code/Sorting_array_in_ascending_and_descending_order