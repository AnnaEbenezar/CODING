#include <stdio.h>

//Simplify the following code:
int colours(int i)
{
    if (i > 0) 
    {
        ++i;
        printf("red, ");
        printf("green\n");
    }
    else 
    {
        ++i;
        printf("red, ");
        printf("blue\n");
    }
}

int colours1(int i)
{
    ++i;
    printf("red, ");
    if (i > 0) 
    {
        printf("green\n");
    }
    else
    {
        printf("blue\n");
    }
}

int main()
{
    colours(6);
    colours(-5);
    colours1(6);
    colours1(-5);
}