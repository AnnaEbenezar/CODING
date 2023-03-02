/*
 * Blinking Example
 *
 * To compile with GCC
 * gcc -o blink blink-pigpio.c -lpigpio
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <pigpio.h>

#define GPIO_LED 23
#define GPIO_X 24
#define GPIO_Y 25

int run=1;

void stop(int signum)
{
   run = 0;
}

int main()
{
   /*
    * Initialize GPIO
    *
    */
   if (gpioInitialise() < 0) return -1;
   gpioSetSignalFunc(SIGINT, stop);
   gpioSetMode(GPIO_LED, PI_OUTPUT); // Set GPIO as output.
   gpioSetMode(GPIO_X, PI_INPUT);
   gpioSetMode(GPIO_Y, PI_INPUT);
   
   int joy_x = 1;
   int joy_y = 0;

   /*
    * Blinking forever until interrupt from SIGINT
    *
    */
   
   while(run)
   {
      joy_x = gpioRead(GPIO_X);
      if(!joy_x){
         gpioWrite(GPIO_LED, 1); // Turn on LED.
         time_sleep(1);
         gpioWrite(GPIO_LED, 0); // Turn off LED.
         time_sleep(1);
      }
      
      joy_y = gpioRead(GPIO_Y);
      if(!joy_y){
         gpioWrite(GPIO_LED, 1); // Turn on LED.
         time_sleep(0.5);
         gpioWrite(GPIO_LED, 0); // Turn off LED.
         time_sleep(0.2);
      }
      
      //time_sleep(1);
   }

   /*
    * De-initialize
    * turn off LED before exit
    *
    */
   gpioWrite(GPIO_LED, 0); // Turn off LED.
   gpioTerminate();

   return 0;
}

