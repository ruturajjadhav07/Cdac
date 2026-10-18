# 20.  Write a program to check whether a number is palindrome or not
num = int(input("Enter number: "))
original = num
reverse = 0
while num != 0:
    rem = num % 10
    reverse = reverse * 10 + rem
    num = num // 10

if original == reverse:
    print(f"The given number {original} is palindrome!")
else:
    print(f"The given number {original} is not palindrome!")
