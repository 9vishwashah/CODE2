import re
ini_string = input("Enter The string ")
print ("initial string : ", ini_string)
result = re.sub('[\W_]+', '', ini_string)
print ("final string", result)
