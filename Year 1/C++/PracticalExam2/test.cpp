#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <assert.h>

using namespace std;

class Resource
{
    protected:
        string title;
        string purchase_date; 

    public:
        Resource()
        {
            title = "No Title";
            purchase_date = "No Date of Purchase";
        }
        
        Resource(string ttl, string purd)
        {
            title = ttl;
            //assert(strlen());
            purchase_date = purd;
        }

        string getResTitle(){return title;}
        string getResPurchDate(){return purchase_date;}

        virtual void print()
        {
            cout << "Resource: " << title << " Date of Purchase: " << purchase_date << endl;
        }
        virtual string search(string test);
};

class Book: public Resource
{
    private:
        string author; //Author of the Book
        string subj_code; //Book's Subject Code

    public:
        Book()
        {
            author = "No Author Input";
            subj_code = "No Subject Code";
        }

        Book(string ttl, string purd, string au, string sc) : Resource(ttl, purd) 
        {
            author = au;
            subj_code = sc;
        }

        string search(string test)
        {
            size_t pos = author.find(test);
            
            if(pos != string::npos)
            {
                return author;
            }
            else
            {
                pos = subj_code.find(test);
                if(pos != string::npos)
                {
                    return author;
                }
                return "?";
            }
        }

        void print() override
        {
            cout << "Book: " << title << ", " << purchase_date << ", " << author << ", " << subj_code << endl;
        }
};

class Magazine: public Resource
{
    private:
        string vol_num; //Volume Number
        int iss_num; //Issue Number
        string pub_date; //Date of Publication

    public:
        Magazine()
        {
            vol_num = "No Volume Number Input";
            iss_num = -1;
            pub_date = "No Publication Date Input";
        }

        Magazine(string ttl, string purd, string pubd, string vn, int issn) : Resource(ttl, purd) 
        {
            vol_num = vn;
            iss_num = issn;
            pub_date = pubd;
        }

        string search(string test)
        {
            size_t pos = vol_num.find(test);
            
            if(pos != string::npos)
            {
                return vol_num;
            }
            else
            {
                pos = pub_date.find(test);
                if(pos != string::npos)
                {
                    return pub_date;
                }
                return "?";
            }
        }

        void print() override
        {
            cout << "Magazine: " << title << ", " << purchase_date << ", " << pub_date << ", " << vol_num << ": " << iss_num << endl;
        }
};

class Video: public Resource
{
    private:
        string run_time; //Video length
        string format; //Is VHS still a thing?

    public:
        Video()
        {
            run_time = "No Run Time Input";
            format = "No Format Input";
        }

        Video(string ttl, string purd, string rt, string fmt) : Resource(ttl, purd) 
        {
            run_time = rt;
            format = fmt;
        }

        string search(string test)
        {
            size_t pos = run_time.find(test);
            
            if(pos != string::npos)
            {
                return run_time;
            }
            else
            {
                pos = format.find(test);
                if(pos != string::npos)
                {
                    return format;
                }
                return "?";
            }
        }

        void print() override
        {
            cout << "Video: " << title << ", " << purchase_date << ", " << run_time << ", " << format << endl;
        }
};

class Game: public Resource
{
    private:
        string company; //Company which published the game
        string edu_aim; //Educational Aim

    public:
        Game()
        {
            company = "No Company Input";
            edu_aim = "No Educational Aim Input";
        }

        Game(string ttl, string purd, string comp, string ea) : Resource(ttl, purd) 
        {
            company = comp;
            edu_aim = ea;
        }

        string search(string test)
        {
            size_t pos = company.find(test);
            
            if(pos != string::npos)
            {
                return company;
            }
            else
            {
                pos = edu_aim.find(test);
                if(pos != string::npos)
                {
                    return edu_aim;
                }
                return "?";
            }
        }
        
        void print() override
        {
            cout << "Game: " << title << ", " << purchase_date << ", " << company << ", " << edu_aim << endl;
        }
};


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
            Resource *r = catalogue_sheet[j];
            answer = r->search(test);
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

        cr.find("Lauren");

        if(ok) cout<<"ok"<<endl;
}