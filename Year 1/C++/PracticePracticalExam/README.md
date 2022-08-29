Practice for the Practical Exam

Scenario

After you graduate from this course as an expert software engineer, you team up a large team of other professional engineers and develop the most amazing app! It is so amazing that your company is making millions !

Because it uses a Marxist (or communist) economic philosophy, it shares all the company assets with all the employees on an equal basis. Because of its success, it now owns a large fleet of vehicles ranging from the company jet, several yachts, several trucks for shipping products, several buses for taking the team to company picnics and not to mention many cars of various types, motorcycles for the adventurous and even bicycles for the health conscious environmentalists.

Now it needs an asset register to keep track of all these vehicles, maintain them as necessary (they are all considered communal property of the company) and dispose of them when appropriate.

Firstly, you should create a vehicle class. Here a vehicle is anything that can move goods or people. Obviously the different types of vehicles have different properties and needs, so you should create several child classes. Some vehicles (the plane, all the cars, etc) need to be registered with the government (which is very capital minded and taxes everything ), but it did not think it worthwhile to register bicycles. So you probably should make a class for RegisteredVehicles too.

Your task: DESIGN the set of classes needed. Here design means:  
(a) specify the name of the class, 
(b) list its attributes and 
(c) specify the methods needed. 

At this stage, you do not need to implement any classes – just specify the attributes and methods, i.e. fill in the a specification (.h or .hpp) file. You might implement a simple print method for each class so that you can run a simple test that your design is complete and compiles and links to form a working executable.

To keep this exercise simple, for attributes, just assume that every vehicle has a name or label and a purchase price. Registered vehicles will need a registration number and other vehicles will have one or two attributes specific to the vehicle, e.g. trucks will have a load capacity and most vehicles will have a maximum passengers allowed. Even bicycles may have a flag – headlight installed or not.

Do not go overboard with detail: this is a design exercise – show that you know how to make a reasonable class hierarchy and add a few appropriate methods. One of the advantages of OO design is that class capabilities can be expanded easily, so we just want to see a skeleton of the design here.

Since even communists have not found a way to eliminate money, the company accountants will want to be able to calculate the purchase prices (including required additional costs, like registration) for the whole fleet and print a register showing sensible characteristics of every type of vehicle. So there will be a fleet class

#include <Vehicle.h>

class Fleet {

private: vector<Vehicle> asset_reg;

public: /** Fleet – default constructor ** Create an empty fleet

**/

Fleet();

/** Add a new vehicle to the fleet

** /param v Vehicle a valid vehicle to be added

** /return true if addition successful

**/

bool addVehicle( Vehicle v );

/** Calculate fleet capital cost * /return double total capital cost

**/ ..double calcCapitalCost() {

double sum;

for(int j=0;j<asset_reg.size(); j++) {

sum += asset_reg[j].getCost();

}

fprintf(stderr,”Total cost: %10.2f\n”, sum); }

/** Print the asset register *

**/

void print() {

fprintf(stdout,”Asset Register\n”);

for(int j=0;j<asset_reg.size();j++) {

asset_reg[j].print();

}

};

Since there may be a few classes in your design, to make viewing and checking your design easier, you may (today only) put all the class specifications in one vehicle.h file. You can separate them later. Show this file .. and your running program and its output to the TA for evaluation, if he passes it today, you should pass the practical exam easily . If errors or anything missing, you should follow his guidance and work on it until you can pass.

Note: For the practical exam, you will have more time and will be expected to add some of the implementations too – which will obviously need to include some asserts or exceptions (your choice depending on your view of the application) as well as some documentation. For the practical exam, a couple of robust, properly documented methods will earn a pass: we will assume that you can add more in the same style when you have more time.

Implied political, social or economic commentary in this assignment may be ignored!