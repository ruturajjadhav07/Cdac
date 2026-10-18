# 3. Write a program to obtain the height and weight of a person and calculate BMI (BMI = kg / m2
# where kg is the weight and m is the height in metres)

weight = float(input("Enter your weight in kilograms :"))
height = float(input("Enter your height in meters :"))

bmi = weight / (height ** 2)

print(f"Your Body Mass Index is: {bmi:.2f}")
