outputFile = open('C:/Users/user/Desktop/Lorem_output.txt', "w")
inputFile = open('C:/Users/user/Desktop/Lorem_input.txt', "r")
lines_seen_so_far = set()
for line in inputFile:
	if line not in lines_seen_so_far:
		outputFile.write(line)
		lines_seen_so_far.add(line)	
inputFile.close()
outputFile.close()
