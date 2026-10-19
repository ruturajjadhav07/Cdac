# 6. Write a program that inputs a line of text and then capitalizes the first letter of each word
# and forms a new string out of it

text = input("Enter text: ")
capText = text.title()
print(capText)

print(f"Normal text:", text)
print(f"After capitalizing each letter of word: ", capText)
