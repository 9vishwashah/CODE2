with open('file.txt') as f:
	while True:
		c = f.read(5)
		if not c:
			break
		print(c)
