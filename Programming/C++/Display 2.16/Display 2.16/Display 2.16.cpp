//File Name: health
//Author: Hannah Ebenezar
//Email Address: angellinabelle@gmail.com
//Assignment: Display 2.16
//Description: Program to determine if the user is ill.
//Last Changed: 03/11/2020

#include <iostream>
using namespace std;

int main()
{
    const double NORMAL = 98.6; //degrees Fahrenheit
    double temp;
    cout << "Enter your temperature: ";
    cin >> temp;

    if (temp > NORMAL)
    {
        cout << "You have a fever.\n";
        cout << "TAKE REST AND STAY HYDRATED.\n";
    }
    else
    {
        cout << "You don't have a fever.\n";
        cout << "Stop procrastinating, and go study.\n";
    }

    return 0;
}

