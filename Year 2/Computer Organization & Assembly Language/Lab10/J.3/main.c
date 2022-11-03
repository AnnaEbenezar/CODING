#include <stdio.h>
#include <stdlib.h>
#include <wiringPi.h>
#include <time.h>

int main(void)
{
    int pin = 7;
    clock_t start, end;
    double cpu_time_used;

    printf("LED blinking by wiring Pi\n");

    if (wiringPiSetup() == -1) {
    printf("Setting up problem ... Abort!");
    exit (1);
    }

    pinMode(pin, OUTPUT); /* set pin 7 to output mode */
    int i;

    start = clock();

    for ( i = 0; i < 10; i++ )  {
    digitalWrite(pin, 1); /* LED On */
    delay(500);

    digitalWrite(pin, 0);   /* LED Off */
    delay(500);
    }

    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf(cpu_time_used);

    return 0;
}
