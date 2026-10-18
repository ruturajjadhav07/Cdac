# 11. Write a program to find the greatest of 3 numbers using nested if

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))
c = int(input("Enter num3: "))

if a > b:
    if a > c:
        print(f"{a} is greatest")
    else:
        print(f"{c} is greatest")
else:
    if b > c:
        print(f"{b} is greatest")
    else:
        print(f"{c} is greatest")
