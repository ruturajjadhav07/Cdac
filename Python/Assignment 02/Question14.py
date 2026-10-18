# 14. Write a program to input a number and find the factorial of a number
num = int(input("Enter num: "))
fact =1
for i in range (1, num+1):
    fact *= i

print(f"The factorial of {num} is {fact}")