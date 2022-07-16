# import library
import re

# list of different types of file
filenames = ["vishwa.html", "vs.xml",
			"v23.txt", "v.jpg"]

for file in filenames:
	# search given pattern in the line
	match = re.search("\.jpg$", file)

	# if match is found
	if match:
		print("The file ending with .xml is:",
			file)
