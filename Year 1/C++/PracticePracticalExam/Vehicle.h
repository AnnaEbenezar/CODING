#include <iostream>
#include <string>
#include <fstream>
#include <vector> // for vectors

using namespace std;

class Vehicle 
{
    private: 
        string name; 
        double purchaseprice;

    public: 
        Vehicle()
        {
            name = "No Name"; 
            purchaseprice = -1;
        };

        Vehicle(string n, double p)
        {
            name = n;
            purchaseprice = p;
        }
        double getPrice(){return purchaseprice;}
        string getName(){return name;}

    virtual void print()
    {
        cout << "Default vehicle " << name << " " << purchaseprice << endl;
    }    
};

class RegVehicle: public Vehicle 
{
    private: 
        string registration_number;     
    
    public: 
        RegVehicle(){registration_number="";}
        RegVehicle(string n, double p){}       

        string getRegNum(){return registration_number;}

    void print()
    {
        //string s = getName();
        double p = getPrice();

        cout<<getName()<<getPrice()<<getRegNum()<<p;
    }
};

class Truck: public RegVehicle 
{
    private: 
        double load_capacity;     
    
    public: 
        Truck(){load_capacity=-1;} 
        Truck(double num){load_capacity = num;} 
        
    void print()
    {
        //string s = getName();
        //double p = getPrice();

        cout<<getName()<<getPrice()<<getRegNum()<<load_capacity;
    };      
};

class Yacht: public RegVehicle 
{
    private: 
        double max_passengers;     
    
    public: 
        Yacht(){max_passengers=-1;}
        Yacht(double num){max_passengers = num;} 
    
    void print();        
};

class Fleet 
{
    private:
        vector<Vehicle> asset_reg;
    
    public: 
    /** Fleet � default constructor ** Create an empty fleet**/
        Fleet(){};

    /** Add a new vehicle to the fleet** /param v Vehicle a valid vehicle to be added
    ** /return true if addition successful**/
    bool addVehicle( Vehicle v )
    {
        asset_reg.push_back(v);
        return true;
    }

    /** Calculate fleet capital cost * /return double total capital cost**/
    double calcCapitalCost() 
    {
        double sum;
        for(size_t j=0;j<asset_reg.size(); j++) 
        {
            sum += asset_reg[j].getPrice();
        }
    
    cout<<"Total cost:"<<sum<<endl;
    return sum;
    }
    
    /** Print the asset register ***/
    void print() 
    {
        cout<<"Asset Register"<<endl;
        for(size_t j=0;j<asset_reg.size();j++) 
        {
            asset_reg[j].print();
        }
    }
};
