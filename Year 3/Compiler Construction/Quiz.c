#include <stdio.h>
#include <stdlib.h>

int main() {
    int n = 5; // size of arrays
    int *q = (int *)malloc(n * sizeof(int)); // allocate memory for q
    char *m = (char *)malloc(n * sizeof(char)); // allocate memory for m

    // Initialize array m with values
    m[0] = '1';
    m[1] = '5';
    m[2] = '7';
    m[3] = '9';
    m[4] = '0';

    // Variable i for loop control
    int i = 0;

    // Loop through m and assign values to q
    while (i < n) {
        switch (m[i]) {
            case '1':
            case '2':
            case '3': 
                q[i] = 1;
                break;
            case '4':
            case '5':
            case '6':
                q[i] = 2;
                break;
            case '7':
            case '8':
            case '9':
                q[i] = 3;
                break;
            default:
                q[i] = 4;
                break;
        }
        i++;
    }

    // Print the values of array q
    printf("Values of array q: ");
    for (int j = 0; j < n; j++) {
        printf("%d ", q[j]);
    }
    printf("\n");

    // Free the allocated memory
    free(q);
    free(m);

    return 0;
}