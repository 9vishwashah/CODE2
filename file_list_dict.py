import pickle
try:
	v_file = open('vishwa.txt', 'r')
	dictionary_list = pickle.load(geeky_file)	
	for d in dictionary_list:
		print(d)
	v_file.close()
except:
	print("Something unexpected occurred!")
