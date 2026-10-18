# 18.  Write a program to generate the divisors of a number
num = int(input("Enter num: "))
for i in range(1, num + 1):
    if num % i == 0:
        print(f"{i}")
