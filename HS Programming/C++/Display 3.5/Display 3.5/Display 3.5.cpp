//Program to compute State Income Tax.
#include <iostream>
using namespace std;

int main()
{
	int net_income;
	double tax_bill;
	double five_percent_tax, ten_percent_tax;

	
	cout << "Enter net income (rounded to whole Dollars) $";
	cin >> net_income;

		if (net_income <= 15000)
			tax_bill = 0;
		
		else if ((net_income > 15000) && (net_income <= 25000))
			//5% of amount over $15000
			tax_bill = (0.05 * (net_income - 15000));
		
		else //net_income > $25,000
		{
			//five_percet_taxt= = 5% of icomce from $15000 to $25000.
			five_percent_tax = 0.05 * 10000;
			
			//ten_percent_tax = 10% of income over $25000
			ten_percent_tax = 0.10 * (net_income - 25000);
			
			tax_bill = (five_percent_tax + ten_percent_tax);
		}

	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);
	cout.precision(2);
	cout << "Net Income = $" << net_income << endl
		<< "Tax Bill = $" << tax_bill << endl;

	return 0;
}