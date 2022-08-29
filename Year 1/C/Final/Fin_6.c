#include <stdio.h>
/*
6. (12 points total) You are assigned to design and implement a module 
for representing a square for a graphic system. In an early prototype, 
the task is broken down to the following steps:

6.1) (4 points) Define the structure Square with the following data:

name: the name of the square object (79 chars max excluding '\0')
x: the square's center-point x-axis value (-inf, inf)
y: the square's center-point y-axis value (-inf, inf)
length: the square's side length (0.0-inf)
and write a function square_init(...) for initializing data with 
name="Object", x=0.0, y=0.0, and length=1.0 as a default value.

6.2) (4 points) Write a function square_move(...) 
for moving the square by values of dx and dy given to the function.

6.3) (4 points)

Write a function square_create(...) for dynamically allocate memory 
for storing the Square structure and set the default value as in 6.1). 
The function must return a pointer to the Square structure.
Write a function square_delete(...) to free memory requested from 
square_create(...).
*/

