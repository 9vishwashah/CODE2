import re
def match(text):
		pattern = '[A-Z]+[a-z]+$'
		if re.search(pattern, text):
				return("Lowercase after an uppercase Present ")
		else:
				return("No Lowercase after an uppercase Present or no lowercase present at the end of string  ")
text=input("Enter the string ")
print(match(text))
