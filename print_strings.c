#include<stdio.h>

int main(){
    char str[] = {'v', 'i', 's', 'h', 'w', 'a', '\0'};
    char *ptr = str;
    while(*ptr!='\0'){
        printf("%c", *ptr);
        ptr++;
    }
    return 0;
}
