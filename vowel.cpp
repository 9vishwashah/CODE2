#include <iostream>
using namespace std;
int main() 
{
    char c;
    bool l, u;
    cout << "Enter an alphabet: ";
    cin >> c;
    l = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    u = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    if (!isalpha(c))
      printf("Error! Non-alphabetic character.");
    else if (l || u)
        cout << c << " is a vowel.";
    else
        cout << c << " is a consonant.";
    return 0;
}
