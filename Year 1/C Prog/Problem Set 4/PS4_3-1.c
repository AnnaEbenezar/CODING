#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX_LIMIT 20

int main()
{
    int matrixNumbers[8][5] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    char matrix[5][5];
    for(int i = 0; i < 5; i++) 
    {
        char str[MAX_LIMIT];
        fgets(str, MAX_LIMIT, stdin);
        char * numbers = strtok(str, "");
        int j = 0;
        while(numbers != NULL) 
        {
            //printf("%s\n", numbers);
            int temp = atoi(numbers);
            matrixNumbers[i][j] = temp;
            j += 1;
            numbers = strtok(NULL, "");
        }
    }

    int rowTotals[8] = {0,0,0,0,0,0,0,0};
    int colTotals[5] = {0,0,0,0,0};
    
    for(int i=0; i < 8; i++)
    {
        rowTotals[i] = matrixNumbers[i][0] + matrixNumbers[i][1] + matrixNumbers[i][2] + matrixNumbers[i][3] + matrixNumbers[i][4] + matrixNumbers[i][5] + matrixNumbers[i][6] + matrixNumbers[i][7];
    }

    for(int i=0; i < 5; i++)
    {
        colTotals[i] = matrixNumbers[0][i] + matrixNumbers[1][i] + matrixNumbers[2][i] + matrixNumbers[3][i] + matrixNumbers[4][i];
    }

    printf("Row additions: %d %d %d %d %d %d %d %d\n", rowTotals[0], rowTotals[1], rowTotals[2], rowTotals[3], rowTotals[4], rowTotals[5], rowTotals[6], rowTotals[7]);
    printf("Col additions: %d %d %d %d %d\n", colTotals[0], colTotals[1], colTotals[2], colTotals[3], colTotals[4]);

    return 0;
}