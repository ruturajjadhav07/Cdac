# 11.  Write the program that inputs a string and creates a new string that doubles each character of
# the original string(For eg. if the user enters cdac, the output should be ccddaacc)

text = input("Enter string: ")
new_text = ""
for character in text:
    new_text += character * 2

print(new_text)
