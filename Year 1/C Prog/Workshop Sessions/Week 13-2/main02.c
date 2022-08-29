#include <stdio.h>
#include <stdlib.h>

int compare_ints(const void* a, const void* b)
{
    int a1 = *(const int*)a;
    int a2 = *(const int*)b;

    if (a1 < a2)
        return -1;
    if (a1 > a2)
        return 1;
    return 0;
}

int main()
{
    int arr[] = {30, 4, 5, 1, 2};
    size_t n = sizeof(arr) / sizeof(*arr);
    // *(arr + 1) == arr[1];
    // *arr == arr[0];

    qsort(arr, n, sizeof(int), compare_ints);
    
    for (size_t i = 0; i < n; ++i) 
    {
        printf("%d\n", arr[i]);
    }
    
    return 0;
}

void sort2(int* a, int* b)
{
    if (*a > *b) {
        int tmp = *a;
        *a = *b;
        *b = tmp;
    }
}

int main1()
{
    int a, b;
    scanf("%d", &a);
    scanf("%d", &b);

    sort2(&a, &b);
    printf("%d, %d", a, b);
    
    return 0;
}

int all_zero2(int a, int b)
{
    if (a != 0) 
    {
        return 0;
    }

    return b == 0;
}


int all_zero3(int a, int b, int c)
{
    if (a != 0)
    {
        return 0;
    }

    if (b != 0)
    {
        return 0;
    }

    return c == 0;
}

void func(int a, int b)
{
    // 1st call: a == 2, b == 2
    // 2nd call: a == 1, b == 3
    a = 10;
    b = 20;
}

int main0(void)
{
    int a = 1;
    int b = 2;
    int c = 3;
    int cond = all_zero3(a, b, c);
    printf("%d\n", cond);

    func(b, c); // func.a = b, func.b = c
    func(a, c);

    int d = 30;
    {
        int d = 50; // shadows the outer scope
        printf("%d\n", d);
    }

    printf("%d\n", d);
    return 0;
}


/*
int main()
{
    int a = 0;
    int b = 0;
    int c = 0;
    int cond = all_zero3(a, b, c);
    printf("%d\n", cond);

    return 0;

}
*/