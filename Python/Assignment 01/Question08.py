# 8. Write a program to calculate in how many days a work will be completed by 3 persons A, B and
# C together. A, B and C takes x, y and z days respectively to do the job alone. The formula to
# calculate the number of days if they work together is xyz(xy+yz+zx) days where x, y and z are
# given as input to the program

x = float(input("Enter the days taken by A : "))
y = float(input("Enter the days taken by B : "))
z = float(input("Enter the days taken by C : "))

total_days = (x * y * z) / ((x * y) + (y * z) + (z * x))

print(f"\nThey will finish the work together in: {total_days} days")