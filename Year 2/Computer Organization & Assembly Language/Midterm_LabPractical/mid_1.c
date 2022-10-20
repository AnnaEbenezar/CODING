#include <stdio.h>
//#include <limits.h>

//Declare your ID number as an integer and keep adding to itself.
//Print out the last positive number and the first negative number.

int main()
{
    int i = 64011393;
    int idNum = 64011393;

    while (i > 0) {
        i += idNum;

        if (i < 0) {
            printf("i was %d before \n", i-idNum);
            printf("i is %d now \n", i);
        }
    }
    return 0;
}

//https://www.scaler.com/topics/c/overflow-and-underflow-in-c/
//{
//    /* INT_MAX is the maximum representable integer. */
//    int a = INT_MAX;
//    printf("a = %d\n", a);
//    printf("Adding 1 to a...\n");
//
//    a = a + 1;
//    printf("a = %d\n", a);
//
//    return 0;
//
//}
