#include<iostream>  
using namespace std;    
void swap(int *x, int *y)  
{  
 int swap;  
 swap=*x;  
 *x=*y;  
 *y=swap;  
}  
int main()   
{    
 int a,b;
    cout<<"Enter First Number:\n";
    cin>>a;
    cout<<"Enter Second Number:\n";
    cin>>b;
 swap(&a, &b);  
    cout<<"Value of x is: "<<a<<endl;  
    cout<<"Value of y is: "<<b<<endl;  
return 0;  
}    
