#include <iostream>
#include <regex>
using namespace std;
void run(string a)
{
    regex sc("[@_!#$%^&*()<>?/|}{~:]");
        if(regex_search(a, sc) == 0)
	    cout << "String is accepted";
	else
            cout << "String is not accepted.";
}
int main()
{
    string a;
    cout << "Enter the string: ";
    cin >> a; 
    run(a);
return 0;
}
