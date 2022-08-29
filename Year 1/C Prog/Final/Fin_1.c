#include <stdio.h>

// Rewrite the following function so that it contains only one statement with no if/else:

int test_range(int i)
{
    if (0 < i)
        if (i < 10)
            return 1;
    return 0;
}

int test_range2(int i)
{  
    while(i < 10)
    {
        return 1;
    }
    
    return 0;
}

int main()
{
    printf("%d\n", test_range(8));
    printf("%d\n", test_range(12));
    printf("%d\n", test_range2(8));
    printf("%d\n", test_range2(12));
}