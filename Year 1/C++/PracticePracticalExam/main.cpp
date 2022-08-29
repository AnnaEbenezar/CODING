#include <iostream>
#include <Vehicle.h>

using namespace std;

int main()
{
    Fleet fx;
    Yacht b(2);
    Truck c(4);

    fx = Fleet();
    
    bool ok;
    ok = fx.addVehicle(c);
    ok = fx.addVehicle(b);
    fx.print();

    if(ok);
    cout<<"ok"<<endl;
}
