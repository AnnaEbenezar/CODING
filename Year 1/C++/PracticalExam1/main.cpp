#include <iostream>

using namespace std;

#include <C:\Users\HP\OneDrive\Desktop\Coding Projects\Year 1\C++\PracticalExam1\Payroll.h>

class Old : public runtime_error 
{
public:
	Old()
    : runtime_error("Employee above the retirement age.\n") {
	}
};

int main()
{
    try 
    {    
        Payroll pr;
        
        Engineer exxxa("John Smith", 25, 45000, "KMITL", 1.5);
        Engineer exxxb("John Johnson", 28, 35000, "KMITL", 1.5);
        Mechanic mxxxa("Percy Jackson", 24, 40000, "Ships, Planes", 1.25);
        Mechanic mxxxb("Marc Spector", 26, 37000, "Motorbikes, Cars", 1.25);
        SecurityGuard sxxxa("Arthur Harrow", 58, 30000, 2, 1.02);
        TeaServer txxxa("Steven Grant", 25, 30000, 3, 1.02);
        
        exxxa.print();
        exxxb.print();
        mxxxa.print();
        mxxxb.print();
        sxxxa.print();
        txxxa.print();

        pr = Payroll();
        bool ok;
        ok = pr.addEmployee(&exxxa);
        ok = pr.addEmployee(&exxxb);
        ok = pr.addEmployee(&mxxxa);
        ok = pr.addEmployee(&mxxxb);
        ok = pr.addEmployee(&sxxxa);
        ok = pr.addEmployee(&txxxa);

        pr.printPS();

        pr.calcTotalWages();

        if(ok) cout<<"ok"<<endl;
    }
    
    catch (Old o) {
        cout << o.what();
        }
}

