#include <stdio.h>
#include <errno.h>
#include <wiringPi.h>
#define BUTTON_PIN 0 // Use Gpio Pin 17 = Pin 0 of wiring Pi library

volatile int eventCount = 0;
//int eventCount = 0;
void myInterrupt(void) { // called every time an event occurs
    eventCount++; //the event counter
}

int main (void){
    if (wiringPiSetup() < 0) {  // check the existence of the wiringPi library
    printf("Cannot setup wiringPi: %s\n", strerror (errno));
    return 1;   // error code = 1
    }

    //set wiringPi pin 0 to generate an interrupt from 1-0 transition
    //myInterrupt() = my interrupt service routine

    if (wiringPiISR(BUTTON_PIN, INT_EDGE_FALLING, &myInterrupt) < 0) {
    printf("Cannot setup ISR: %s\n", strerror (errno));
    return 2;   // error code = 2
    }

    // display counter value every second
    while (1) {
    printf("%d\n", eventCount);
    eventCount = 0;
    delay(1000);    // wait 1000ms = 1s
    }

    return 0;   // error code = 0 (No Error)
}
