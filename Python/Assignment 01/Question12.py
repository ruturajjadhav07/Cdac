# 12. Write a program to input a number and print its first five multiples
a = int(input("Enter num: "))
print("Multiples of {a} are")
for i in range(1, 6):
    print(a * i)
