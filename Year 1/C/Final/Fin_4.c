#include <stdio.h>

/*
4. (8 points total)

4.1) (2 points) Complete the following declaration of a 2D array 
with 5 columns:

    ________ vec_list ________ = 
    {
        {1.2, 3.1, 2.2, 1.3, 3.4},
        {1.6, 2.1, 3.2, 2.4, 1.1},
        {3.4, 1.4, 1.7}
    };
4.2) (3 points) Write a program to print the table from vec_list 
as declared in 4.1 using loop.

Expected output:
1.20 3.10 2.20 1.30 3.40
1.60 2.10 3.20 2.40 1.10
3.40 1.40 1.70 0.00 0.00

4.3) (3 points) Modify 4.2 by declaring vec_list2 as a 2D array 
with 5 columns that can store all data from vec_list, copy the data 
from vec_list into vec_list2 and print the table from vec_list2 instead.
*/


int main()
{
    float vec_list [3][5] = 
    {
        {1.2, 3.1, 2.2, 1.3, 3.4},
        {1.6, 2.1, 3.2, 2.4, 1.1},
        {3.4, 1.4, 1.7}
    };

    int i, j;

    for(i = 0; i < 3; i++)
    {
        for(j =0; j<5; j++)
        {
            printf("%.2f ", vec_list[i][j]);
            if(j==4)
            {
                printf("\n");
            }
        }
    }

    float vec_list2 [3][5] = //[][5] 
    {
        {1.2, 3.1, 2.2, 1.3, 3.4},
        {1.6, 2.1, 3.2, 2.4, 1.1},
        {3.4, 1.4, 1.7}
    };

    for(i = 0; i < 3; i++)
    {
        for(j =0; j < 5; j++)
        {
            printf("%.2f ", vec_list2[i][j]);
            if(j==4)
            {
                printf("\n");
            }
        }
    }


}