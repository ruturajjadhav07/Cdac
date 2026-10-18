# 16. Write a program to calculate the sum of even and odd numbers of the first n natural numbers
# where n is read from the keyboard

nums = int(input("Enter number: "))
evenSum = 0
oddSum = 0

for i in range(1, nums + 1):
    if i % 2 == 0:
        evenSum += i
    else:
        oddSum += i

print(f"The even sum and odd sum of first {nums} natural number is {evenSum} and {oddSum}")
