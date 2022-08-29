#include <stdio.h>

double func(double x, double y) 
{ 
    return x * x + y * y; 
}

int main()
{
    char c = 'a';
    int i = 3;
    int j = 5;
    int k = 25;
    double x = 2.1;
    double y = 3.7;
    
    int a1[] = {5, 2, 1, 4,  3, 13, 7, 9};
    int a2[] = {7, 1, 9, 2, 11,  6, 0, 3};

    printf("%f", i / k * x + j * y + c);
    printf("%f", x / (k * i + j) * (y + c));

    //printf("%g", func(func(x, y), i));
    //printf("%d", a1[i++] = a2[j++]);

    return 0;
}