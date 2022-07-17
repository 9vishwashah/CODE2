import re
regex = r'^[a-z]$|^([a-z]).*\1$'
def check(string):
	if(re.search(regex, string)):
		print("Starts and ends with same char ")
	else:
		print("Does not ends or starts with same char ")
if __name__ == '__main__' :
	sample1 = input("Enter the string ")
	check(sample1)
