import re
regex = '[a-zA-z0-9]$'
def check(string):
 if(re.search(regex, string)):
		print("Accepted, Ends with a alphanumeric character")
 else:
		print("Not allowed, Does not ends with alphanumeric character  ")
if __name__ == '__main__' :
	string = input("Enter the string ")
	check(string)
