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
        virtual string search(string test)=0;
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

        void print()
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

        void print() 
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

        void print() 
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
        
        void print() 
        {
            cout << "Game: " << title << ", " << purchase_date << ", " << company << ", " << edu_aim << endl;
        }
};