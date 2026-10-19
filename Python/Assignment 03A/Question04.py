# 4. Write a program that reads a line and prints the number of uppercase letters, lowercase letters,
# digits and spaces

text = input("Enter text: ")
upper = 0
lower = 0
digits = 0
spaces = 0

for t in text:
    if t.isupper():
        upper += 1
    elif t.islower():
        lower += 1
    elif t.isdigit():
        digits += 1
    elif t.isspace():
        spaces += 1

print("Uppercase letters:", upper)
print("Lowercase letters:", lower)
print("Digits:", digits)
print("Spaces:", spaces)
