# 10. Write a program to emulate the working of a calculator using if-elif

num1 = int(input("Enter num1: "))
num2 = int(input("Enter num2: "))

ops = ["+", "-", "*", "/"]
print("Operatios", ops)
getOps = input("Enter operations: ")

if getOps == "+":
    print(num1 + num2)
elif getOps == "-":
    print(num1 - num2)
elif getOps == "*":
    print(num1 * num2)
elif getOps == "/":
    if num2 == 0:
        print("Cannot divide by zero")
    else:
        print(num1 / num2)
else:
    print("Invalid operation")
