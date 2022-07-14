#include<stdio.h>
#include<string.h>

struct employee{
    int code;
    float salary;
    char name[20];
};

int main(){
    struct employee vishwa = {100, 34.23, "vishwa"};

    printf("Code is: %d \n", vishwa.code);
    printf("Salary is: %f \n", vishwa.salary);
    printf("Name is: %s \n", vishwa.name);
 

    return 0;
}
