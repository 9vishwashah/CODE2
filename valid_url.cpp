// C++ program to validate URL
// using Regular Expression
#include <iostream>
#include <regex>
using namespace std;

// Function to validate URL
// using regular expression
bool isValidURL(string url)
{

// Regex to check valid URL
const regex pattern("((http|https)://)(www.)?[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)");

// If the URL
// is empty return false
if (url.empty())
{
	return false;
}

// Return true if the URL
// matched the ReGex
if(regex_match(url, pattern))
{
	return true;
}
else
{
	return false;
}
}

// Driver Code
int main()
{
string url;
cout<<"Paste the URL\n";
cin>>url;


if (isValidURL(url))
{
	cout << "YES";
}
else
{
	cout << "NO";
}
return 0;
}

// This code is contributed by yuvraj_chandra
