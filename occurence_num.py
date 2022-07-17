import re
from collections import Counter
def most_occr_element(word):
  arr = re.findall(r'[0-9]+', word)	
	maxm = 0
  max_elem = 0
	c = Counter(arr)
	for x in list(c.keys()):
		if c[x]>= maxm:
			maxm = c[x]
			max_elem = int(x)
	return max_elem
if __name__ == "__main__":
	word = input("Enter the sentence ")
	print(most_occr_element(word))
