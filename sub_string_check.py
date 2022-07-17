import re
def find(string, sample) :
  if (sample in string):
	  y = "^" + sample
	  x = re.search(y, string)
	  if x :
		  print("string starts with the given substring")
	  else :
		  print("string doesn't start with the given substring")
  else :
	  print("entered string isn't a substring")
string = input("Enter the Sentence ")
sample = input("Enter the word ")
find(string, sample)
