# 7. Write a program to input 2 numbers and perform all arithmetic operations on them
# Program to input 2 numbers and perform all arithmetic operations
a = int(input("Enter num1: "))
b = int(input("Enter num2: "))

print("\n--- Arithmetic Operations ---")

addition = a + b
subtraction = a - b
multiplication = a * b
division = a / b
modulus = a % b
floor_division = a // b
exponentiation = a**b

print("Addition :", addition)
print("Subtraction :", subtraction)
print("Multiplication :", multiplication)
print("Division :", division)
print("Modulus :", modulus)
print("Floor Division :", floor_division)
print("Exponentiation :", exponentiation)