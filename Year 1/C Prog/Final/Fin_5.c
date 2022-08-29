#include <stdio.h>
#include <stdlib.h>

/*
5. (8 points total) Given the following declaration:
    const double data[] = {
        1.2, 3.1, 2.2, 1.3, 3.4, 1.6,
        2.1, 3.2, 2.4, 1.1, 3.4, 1.4,
        1.7
    };

5.1) (4 points) Write a program to dynamically allocate a 
2D array with 3 columns and copy all data from data array 
and print the data as a table using loop. You must free the 
memory before the program exit.

Expected output:
1.20 3.10 2.20
1.30 3.40 1.60
2.10 3.20 2.40
1.10 3.40 1.40
1.70 0.00 0.00

5.2) (4 points) Extend 5.1 by adding the code to swap the data 
in column 1 and column 3 for each row and print the data as a table.

Expected output:
Step 1:
1.20 3.10 2.20
1.30 3.40 1.60
2.10 3.20 2.40
1.10 3.40 1.40
1.70 0.00 0.00

Step 2:
2.20 3.10 1.20
1.60 3.40 1.30
2.40 3.20 2.10
1.40 3.40 1.10
0.00 0.00 1.70
*/

const double data[] = 
{
    1.2, 3.1, 2.2, 1.3, 3.4, 1.6,
    2.1, 3.2, 2.4, 1.1, 3.4, 1.4,
    1.7
};
/*
int main()
{
    int r = 5, c = 5, i, j, count;
    //const int r = 5;

    int* arr[r];
    for (i = 0; i < r; i++)
        arr[i] = (int*)malloc(c * sizeof(int));

    count = 0;
    for (i = 0; i < r; i++)
        for(j = 0; j < c; j++)
            arr[i][j] = ++count;

    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
            printf("%d ", arr[i][j]);
            printf("\n");

    for (int i = 0; i < r; i++)
        free(arr[i]);

    return 0;
}*/

void main()
{
    int r = 5, c = 3; //Taking number of Rows and Columns
    int *data, *ptr, count = 0, i;
    ptr = (int *)malloc((r * c) * sizeof(*data)); 
    //Dynamically Allocating Memory
    
    for (i = 0; i < r * c; i++)
    {
        ptr[*data] = *data + 1; 
        //Giving value to the pointer and simultaneously printing it.
        
        printf("%d ", ptr[*data]);
        if ((*data + 1) % c == 0)
        {
            printf("\n");
        }
    }
    free(*data);
}