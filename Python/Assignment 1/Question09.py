# 9. Write a program that asks your height in centimetres and then converts your height to feet and
# inches (1 foot=12 inches, 1 inch=2.54 cm)

height = int(input("Enter height in centimeters: "))

# 1. Convert total centimeters to total inches
total_inches = height / 2.54

# 2. Use integer division (//) to get the whole feet
feet = int(total_inches // 12)

# 3. Use the modulo operator (%) to get the remaining inches
inches = total_inches % 12

# Printing the result rounded to 1 decimal place for inches
print(f"Your height is: {feet} feet and {inches:.1f} inches")