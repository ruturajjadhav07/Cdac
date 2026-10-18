# 5. Write a program to take 2 numbers and print if the first number is
# fully divisible by the second number or not.

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))

if b == 0:
    print("Division by zero is not allowed.")
elif a % b == 0:
    print(f"{a} is fully divisible by {b}")
else:
    print(f"{a} is not fully divisible by {b}")
