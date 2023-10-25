//File Name: The Importance of Braces
//Author: Hannah Ebenezar
//Email Address: angellinabelle@gmail.com
//Assignment: Display 3.4
//Description: Illustrates the importance of using braces in if-else statements.
//Last Changed: 03/11/2020

#include <iostream>
using namespace std;

int main()
{
	double fuel_gauge_reading;

	cout << "Enter fuel gauge reading ";
	cin >> fuel_gauge_reading;

	cout << "First with braces:\n";
	if (fuel_gauge_reading < 0.75)
	{
		if (fuel_gauge_reading < 0.25)
			cout << "Fuel very low. CAUTION!\n";
	}
	else
	{
		cout << "Fuel over 3/4. Don't stop now!\n";
	}

	cout << "Now without braces:\n";
	if (fuel_gauge_reading < 0.75)
		if (fuel_gauge_reading < 0.25)
			cout << "Fuel very low. CAUTION!\n";
	else
		cout << "Fuel over 3/4. Don't stop now!\n";

	return 0;
}

