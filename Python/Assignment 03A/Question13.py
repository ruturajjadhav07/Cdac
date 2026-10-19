# 13.  Write a program which replaces all the vowels in the string with “*”

text = input("Enter text: ")
vowels = ["a", "e", "i", "o", "u"]
new_text = ""

for character in text:
    if character.lower() in vowels:
        new_text += "*"
    else:
        new_text += character

print(new_text)
