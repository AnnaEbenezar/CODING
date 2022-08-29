#include <stdio.h>

int func1(char c)
{
    int n = 0;
    int i = 0;
    if (++i && c == '[')
        ++n;
    if (++i && c == ']')
        ++n;
    return i + n;
}
int func2(char c)
{
    int n = 0;
    int i = 0;
    if (++i && c == '[')
        ++n;
    else if (++i && c == ']')
        ++n;
    return i + n;
}

int main(){
    printf("%d\n", func1('['));
    printf("%d\n", func1(']'));
    printf("%d\n\n", func1('+'));
    
    printf("%d\n", func2('['));
    printf("%d\n", func2(']'));
    printf("%d\n", func2('+'));
}