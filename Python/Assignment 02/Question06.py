# 6. Write a program to input a number and print the reversed number
num = int(input("Enter number: "))
reverse = 0
print(f"Original number is: {num}")
while num != 0:
    rem = num % 10
    reverse = reverse * 10 + rem
    num = num // 10
print(f"Reverse number is: {reverse}")
