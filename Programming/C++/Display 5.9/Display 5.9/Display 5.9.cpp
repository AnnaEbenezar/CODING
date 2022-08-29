#include <iostream>

const double LOW_MARKUP = 0.05; //5%
const double HIGH_MARKUP = 010; //10%
const int THRESHOLD = 7; //Use HIGH_MARKUP if not expected to sell in 7 days or less

void introduction();
void get_input(double& cost, int& turnover);
double price(double cost, int turnover);
void give_output(double cost, int turnover, double price);

int main()
{
	double wholesale_cost, retail_price;
	int shelf_time;
	introduction();
	get_input(wholesale_cost, shelf_time);
	retail_price = price(wholesale_cost, shelf_time);
	give_output(wholesale_cost, shelf_time, retail_price);
	return 0;
}

//Uses iostream:
void introduction()
{
	using namespace std;
	cout << "This program determines the retail price for\n"
		 << "an item at a Quick-Shop supermarket store.\n";
}

//Uses iostream:
void get_input(double& cost, int& turnover, double price)
{
	using namespace std;
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);
	cout.precision(2);
	cout << "Wholesale cost = $" << cost << endl
		<< "Expected time until sold = "
		<< turnover << " days" << endl
		<< "Retail price = $" << price << endl;
}

double price(double cost, int turnover)
{
	if (turnover <= THRESHOLD)
		return (cost + (LOW_MARKUP * cost));
	else
		return (cost + (HIGH_MARKUP * cost));
}

