import re
regex = '^[aeiouAEIOU][A-Za-z0-9_]*'
def check(string):
	if(re.search(regex, string)):
		print("It starts with a Vowel")	
	else:
		print("It does not start with a vowel")
if __name__ == '__main__' :
	string = input("Enter the String ")
	check(string)
