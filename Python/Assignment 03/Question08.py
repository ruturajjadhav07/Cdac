# 8. Write a program to read a line of text and print the lowercase letters to uppercase letters and
# viceversa

text = input("Enter text in capital and small letter: ")
print("Text:", text)

newString = ""

for character in text:
    if character.isupper():
        newString += character.lower()
    else:
        newString += character.upper()

print("New text:", newString)
