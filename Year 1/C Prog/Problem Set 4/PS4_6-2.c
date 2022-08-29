#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void avg_sum(double *a, int n, double *avg, double *sum)
{
    *sum = 0.0;
    double *temp = a;
    int ntemp = n;
    while(n > 0)
    //for (int i = 0; i < n; ++i)
    {
        *sum += *temp;
        temp++;
        n--;
    }
    *avg = *sum / ntemp;
}

int main() {
    double a[5] = {1,2,3,4,5};
    for(int j=0; j < 5; j++)
    {
        printf("%d %d\n", j, a[j]);
    }

    double avg = 0.0;
    double sum = 0.0;

    avg_sum(a, 5, &avg, &sum);
    printf("%f, %f", avg, sum);
}