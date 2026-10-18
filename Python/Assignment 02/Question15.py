# 15. Write a program to read m and n and find m raised to
# n(Do not use exponentiation operator or math module)

m = int(input("Enter m: "))
n = int(input("Enter n: "))

result = 1
for i in range(abs(n)):
    result *= m

if n < 0:
    result = 1 / result

print(result)