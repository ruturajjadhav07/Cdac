# 1. A triangle has 3 sides a,b,c as 17,23,30. Calculate and display the area using the formula
# s=(a+b+c)/2 and area =squareroot(s(s-a)(s-b)(s-c)) using the math module
import math

a = 17
b = 23
c = 30

s = (a + b + c) / 2
area = math.sqrt(s * (s - a) * (s - b) * (s - c))
print("Area of the triangle:", area)