import re
def removeDuplicateWords(input):
	regex = r'\b(\w+)(?:\W+\1\b)+'
	return re.sub(regex, r'\1', input, flags=re.IGNORECASE)
str1 = input("Enter a sentence ")
print(removeDuplicateWords(str1))
