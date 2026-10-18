# 21. Write a program to print the multiplication table of a number.
# The number has to be entered by the user

num = int(input("Enter num: "))

for i in range(1, num + 1):
    print(f"{num} * {i} = {num * i}")
