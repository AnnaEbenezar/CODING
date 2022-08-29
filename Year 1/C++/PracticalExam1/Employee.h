#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <assert.h>

using namespace std;

class Employee
{
    protected:
        string emp_name;
        int emp_age;
        double monthly_baseSalary;

    public:
        Employee()
        {
            emp_name = "No Name";
            emp_age = -1;
            monthly_baseSalary = -1.0;
        }
        
        Employee(string en, int ea, double ms)
        {
            emp_name = en;
            assert(ea >= 18);
            emp_age = ea;
            assert(ms >= 30000.00);
            monthly_baseSalary = ms;
        }

        string getEmployeeName(){return emp_name;}
        int getEmployeeAge(){return emp_age;}
        double getSalary(){return monthly_baseSalary;}

        virtual void print()
        {
            cout << "Employee: " << emp_name << " Age: " << emp_age << " Monthly Salary: " << monthly_baseSalary << endl;
        }
};

class Engineer: public Employee
{
    private:
        string alma_mater; //Uni from which they graduated
        double mul_factor; //multiplicative skill factor

    public:
        Engineer()
        {
            alma_mater = "No Input";
            mul_factor = -1.0;
        }

        Engineer(string en, int ea, double ms, string uni, double comp) : Employee(en, ea, ms) //comp is compensation
        {
            alma_mater = uni;
            assert(comp >= 1);
            mul_factor = comp;
        }

        double getSalary(){return mul_factor * monthly_baseSalary;}

        void print() override
        {
            cout << "Engineer: " << emp_name << ", " << emp_age << ", " << alma_mater << ", " << getSalary() << endl;
        }
};

class Mechanic: public Employee
{
    private:
        string qualifications; //qualified to repair what
        double mul_factor; //multiplicative skill factor

    public:
        Mechanic()
        {
            qualifications = "No Input";
            mul_factor = -1.0;
        }

        Mechanic(string en, int ea, double ms, string qual, double comp) : Employee(en, ea, ms) //comp is compensation
        {
            qualifications = qual;
            assert(comp >= 1);
            mul_factor = comp;
        }

        double getSalary(){return mul_factor * monthly_baseSalary;}

        void print() override
        {
            cout << "Mechanic: " << emp_name << ", " << emp_age << ", [" << qualifications << "], " << getSalary() << endl;
        }
};

class SecurityGuard: public Employee
{
    private:
        int loyalty; //how long they've worked at the company
        double mul_factor; //multiplicative skill factor

    public:
        SecurityGuard()
        {
            loyalty = -1;
            mul_factor = -1.0;
        }

        SecurityGuard(string en, int ea, double ms, int loyloy, double comp) : Employee(en, ea, ms) //comp is compensation
        {
            assert(loyloy >= 1);
            loyalty = loyloy;
            assert(comp >= 1);
            mul_factor = comp;
        }

        double getSalary(){return (mul_factor * monthly_baseSalary + loyalty * 0.02);}

        void print() override
        {
            cout << "Security Guard: " << emp_name << ", " << emp_age << ", " << loyalty << " years, " << getSalary() << endl;
        }
};

class TeaServer: public Employee
{
    private:
        int loyalty; //how long they've worked at the company
        double mul_factor; //multiplicative skill factor

    public:
        TeaServer()
        {
            loyalty = -1;
            mul_factor = -1.0;
        }

        TeaServer(string en, int ea, double ms, int loyloy, double comp) : Employee(en, ea, ms) //comp is compensation
        {
            assert(loyloy >= 1);
            loyalty = loyloy;
            assert(comp >= 1);
            mul_factor = comp;
        }

        double getSalary(){return (mul_factor * monthly_baseSalary + loyalty * 0.025);}

        void print() override
        {
            cout << "Tea Server: " << emp_name << ", " << emp_age << ", " << loyalty << " years, " << getSalary() << endl;
        }
};