#include <iostream>
#include <string>
#include <vector>
#include <fstream>

using namespace std;

#include <C:\Users\HP\OneDrive\Desktop\Coding Projects\Year 1\C++\PracticalExam2\Resource.h>

class Catalogue 
{
private:
    vector<Resource *> catalogue_sheet;

public: 
    /** Catalogue � default constructor ** Create an empty Catalogue**/
    Catalogue(){};

    /** Add a new Resource to the Catalogue** /param r Resource a valid Resource to be added
    ** /return true if addition successful**/
    bool addResource( Resource *r )
    {
        catalogue_sheet.push_back(r);
        return true;
    }

    /**Find String Method**/
    string find(string test)
    {
        string answer;
        for(size_t j=0;j<catalogue_sheet.size();j++)
        {
            //Resource *r = catalogue_sheet[j];
            answer = catalogue_sheet[j]->search(test);
            if(answer != "?") return answer;
        }
        return "?";
    }
    
    /** Print the Catalogue Sheet ***/
    void printCS() 
    {
        cout<<endl << "Catalogue Sheet"<<endl;
        
        for(size_t j=0;j<catalogue_sheet.size();j++) 
        {
            cout << j << ": ";
            Resource *r = catalogue_sheet[j];
            r->print();
            cout << endl;
        }
    }
};