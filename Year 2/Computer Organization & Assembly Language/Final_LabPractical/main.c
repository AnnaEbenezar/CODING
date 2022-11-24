#include <stdio.h>
extern int power3_l(int n);

int main()  {

    int ID = 64011393;
    int i;
    int n;
    int res;

    for (i = 1; res < ID; i++)
    {
        n = power3_l(i);
        res = n;

        if (res < ID) {
            printf("%d, %d\n", i, res);
        }

    }

}
