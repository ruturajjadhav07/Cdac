# 3. Write a program to check whether a string is a palindrome or not using string slice

text = input("Enter string: ")


def isPalindrome(text):
    return text == text[::-1]


if isPalindrome(text):
    print("Palindrome")
else:
    print("Not palindrome")
