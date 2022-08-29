#include <iostream>
#include <string>
#include <vector>
#include <fstream>

using namespace std;

#include <C:\Users\HP\OneDrive\Desktop\Coding Projects\Year 1\C++\PracticalExam1\Employee.h>

class Payroll 
{
private:
    vector<Employee *> payroll_sheet;

public: 
    /** Payroll � default constructor ** Create an empty Payroll**/
    Payroll(){};

    /** Add a new vehicle to the Payroll** /param e Employee a valid Employee to be added
    ** /return true if addition successful**/
    bool addEmployee( Employee *e )
    {
        payroll_sheet.push_back(e);
        return true;
    }

    /** Calculate Payroll capital cost * /return double total capital cost**/
    double calcTotalWages() 
    {
        double sum  = 0.0;
        
        for(size_t j=0;j<payroll_sheet.size(); j++) 
        {
        sum += payroll_sheet[j]->getSalary();
        }
        
        cout<<"Total Wages:"<<sum<<endl;
        return sum;
    }
    
    /** Print the asset register ***/
    void printPS() 
    {
        cout<<endl << "Payroll Sheet"<<endl;
        
        for(size_t j=0;j<payroll_sheet.size();j++) 
        {
            cout << j << ": ";
            Employee *e = payroll_sheet[j];
            e->print();
            cout << endl;
        }
    }
};