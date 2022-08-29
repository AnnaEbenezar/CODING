#include <stdio.h>

double quadratic_formula(double x)
{
    return ((2 * (x * x)) + (3 * x) + 4);
}




int all_zero(int* a, int n)
{
    for (int i = 0; i < n; ++i)
        if (a[i] != 0)
            return 0;
        else
            return 1;
}

int main()
{
    printf("%f\n", quadratic_formula(2));

    int a[] = {0};
    printf("%d\n", all_zero(a,1));

    int b[] = {8, 9, 2};
    printf("%d\n", all_zero(b,3));

    return 0;

}