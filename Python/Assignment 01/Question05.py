# 5. Write a program to input 2 values and swap them
# a. using an intermediate variable
# b. without intermediate variable

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))
print(f"a is {a} and b is {b}")

c = a
a = b
b = c

print(f"a is {a} and b is {b}")


c = int(input("Enter num1: "))
d = int(input("Enter num2: "))
print(f"c is {c} and d is {d}")

c, d = d, a
print(f"c is {c} and d is {d}")