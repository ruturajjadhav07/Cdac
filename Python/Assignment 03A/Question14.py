# 14.  Write a program that does the following
# a. prompt the user for a string
# b. extract all the digits from the string and sum the collected digits
# c. print the original string, the sum of the digits. If there are no digits print the original string
# and a message “ has no digits”

text = input("Enter text: ")
digit_sum = 0
found_digit = False

for character in text:
    if character.isdigit():
        digit_sum += int(character)
        found_digit = True

print("Original string:", text)
if found_digit:
    print("Sum of digits:", digit_sum)
else:
    print("has no digits")
