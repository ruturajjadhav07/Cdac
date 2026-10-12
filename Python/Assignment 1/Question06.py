# 6. Write a program to input 3 numbers and swap them as: first number becomes the second,
# second becomes the third, third becomes the first number

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))
c = int(input("Enter num3: "))

print(f'a is {a} b is {b} c is {c}')

a, b, c = b, c, a

print(f'a is {a} b is {b} c is {c}')