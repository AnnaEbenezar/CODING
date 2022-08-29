#include <iostream>

using namespace std;

#include <C:\Users\HP\OneDrive\Desktop\Coding Projects\Year 1\C++\PracticalExam2\Catalogue.h>

int main()
{
    Catalogue cr;
        
        Book bxxxa("The Fine Print", "04/08/2020", "Lauren Asher", "Romance");
        Book bxxxb("Terms & Conditions", "04/08/2021", "Lauren Asher", "Romance");
        Magazine mxxxa("Vogue", "09/02/2021", "25/01/2021", "01", 25);
        Magazine mxxxb("Vogue", "09/03/2021", "25/02/2021", "01", 26);
        Video vxxxa("The Life of Pi", "15/06/2020", "01:58:26", "DVD");
        Video vxxxb("Spiderman: No Way Home", "15/01/2022", "02:34:26", "DVD");
        Game gxxxa("Among Us", "31/08/2021", "Riot Games", "Math");
        Game gxxxb("SpyFall", "31/09/2021", "Nintendo", "English");
        
        
        bxxxa.print();
        bxxxb.print();
        mxxxa.print();
        mxxxb.print();
        vxxxa.print();
        vxxxb.print();
        gxxxa.print();
        gxxxb.print();

        cr = Catalogue();
        bool ok;
        ok = cr.addResource(&bxxxa);
        ok = cr.addResource(&bxxxb);
        ok = cr.addResource(&mxxxa);
        ok = cr.addResource(&mxxxb);
        ok = cr.addResource(&vxxxa);
        ok = cr.addResource(&vxxxb);
        ok = cr.addResource(&gxxxa);
        ok = cr.addResource(&gxxxb);
        

        cr.printCS();

        cout << cr.find("Lauren Asher")<< endl;

        if(ok) cout<<"ok"<<endl;
}