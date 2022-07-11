#include<iostream>  
using namespace std;    
int main()  
{  
  int fact(int);  
  int f,v;  
  cout<<"Enter any number: ";  
  cin>>v;  
  f=fact(v);  
  cout<<"Factorial of " << v << " is: "<<f<<endl;  
return 0;  
}  
int fact(int n)  
{  
  if(n<0)  
      return(-1);     
  if(n==0)  
      return(1);  
  else  
    {  
      return(n*fact(n-1));      
    }  
}  
