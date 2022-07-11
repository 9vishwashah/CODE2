#include <iostream>  
using namespace std;  
int main()  
{  
  ineligible:    
    cout<<"You are not eligible to vote!\n";    
    cout<<"Enter your age:\n";    
  int a;  
    cin>>a;  
      if (a < 18)
        {    
            goto ineligible;    
        }    
      else    
        {    
            cout<<"You are eligible to vote!";     
        }         
}  
