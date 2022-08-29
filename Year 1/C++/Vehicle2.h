#pragma once

#include <iostream>
#include <string>
#include <vector>
#include <fstream>

using namespace std;

class Vehicle{
    private:
        string name;
        double price;
    public:
        Vehicle(){
            name = "No name";
            price = -20.0;
        }
        Vehicle(string n, double p) {
            name = n;
            price = p ;
        }
        ~Vehicle() { }
        double getPrice(){ return price; }
        string getName(){ return name; }

        virtual void print() {
            cout << "Default vehicle " << name << " " << price << endl;
        }
};

class RegVehicle : public Vehicle {
    private:
        string regID;

    public:
        RegVehicle(){regID = "";
        }
        RegVehicle(string n, double p) : Vehicle(n, p) {
        }
        ~RegVehicle(){
        }
        string getID(){return regID;}

    void printrv(){
        //string s = getName();
        double p = getPrice();
        cout<<getName()<<getPrice()<<getID()<<p;
    }
};

class Car : public RegVehicle {
    private:
        int pnum;
    public:
        Car(){ pnum = -1;
        }
        Car(string n, double p, int num): RegVehicle(n, p) {
            pnum = num;
            }
        ~Car() { }

        void print() override {
            cout<<getName()<< " " << getPrice()<<pnum;
        }
};

class Bike : public Vehicle {
    private:
        int bnum;
    public:
        Bike() { bnum = -1; }
        Bike(int num) : Vehicle("Bike",123.0) { bnum = num;
        }
        ~Bike(){}
        void print() override {
            cout << "Bicycle " << bnum << " " << getPrice() << endl;
        }
};

class Fleet {
private:
    vector<Vehicle *> asset_reg;
public: 
    /** Fleet – default constructor ** Create an empty fleet**/
    Fleet(){};

    /** Add a new vehicle to the fleet** /param v Vehicle a valid vehicle to be added
    ** /return true if addition successful**/
    bool addVehicle( Vehicle *v ){
        asset_reg.push_back(v);
        return true;
    }

    /** Calculate fleet capital cost * /return double total capital cost**/
    double calcCapitalCost() {
        double sum  = 0.0;
        for(size_t j=0;j<asset_reg.size(); j++) {
        sum += asset_reg[j]->getPrice();}
        cout<<"Total cost:"<<sum<<endl;
        return sum;
    }
    
    /** Print the asset register ***/
    void printAR() {
        cout<<endl << "Asset Register"<<endl;
        for(size_t j=0;j<asset_reg.size();j++) {
            cout << j << ": ";
            Vehicle *v = asset_reg[j];
            v->print();
            cout << endl;
        }
    }
};

