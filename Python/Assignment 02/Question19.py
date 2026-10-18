# 19. Write a program to check whether a number is perfect or not.

number = int(input("Enter a number: "))
divisor_sum = sum(divisor for divisor in range(1, number) if number % divisor == 0)

if number > 0 and divisor_sum == number:
    print(number, "is a perfect number")
else:
    print(number, "is not a perfect number")

    # Not done by me
