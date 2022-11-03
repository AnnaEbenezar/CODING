#include <stdio.h>
#include <stdlib.h>
#include <wiringPi.h>
#include <time.h>

int main(void)
{
    int pin0 = 7;
    int pin1 = 2;
    int pin2 = 21;

    clock_t start, end;
    double cpu_time_used;

    printf("LED blinking by wiring Pi\n");

    if (wiringPiSetup() == -1) {
    printf("Setting up problem ... Abort!");
    exit (1);
    }

    pinMode(pin0, OUTPUT); /* set pin 7 to output mode */
    pinMode(pin1, OUTPUT);
    pinMode(pin2, OUTPUT);
    int i;

    start = clock();

//    for ( i = 0; i <= 7; i++ )  {
//    digitalWrite(pin, 1); /* LED On */
//    delay(500);
//
//    digitalWrite(pin, 0);   /* LED Off */
//    delay(500);
//    }

    for (i = 0; i <= 7; i++) {
    if (i % 2 != 0) {
    digitalWrite(pin0, 1); /* LED On */
    delay(1000);
    }

    if (i == 2 || i == 3 || i == 6 || i == 7) {
    digitalWrite(pin1, 1); /* LED On */
    delay(1000);
    }

    if (i >= 4) {
    digitalWrite(pin2, 1); /* LED On */
    delay(1000);
    }

    digitalWrite(pin0, 0); /* LED On */
    digitalWrite(pin1, 0); /* LED Off */
    digitalWrite(pin2, 0); /* LED On */
    delay(1000);
    }

    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf("%f", cpu_time_used);

    return 0;
}
