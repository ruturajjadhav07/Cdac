# 3. Write a program that reads a number of seconds and prints it in minutes and seconds
time = int(input("Enter seconds: "))
minutes = time // 60
seconds = time % 60

print(f"{minutes} minutes {seconds} seconds")
