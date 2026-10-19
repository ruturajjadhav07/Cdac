# 9. Write a program that reads the email id and ensures that it belongs to domain “gmail.com”

email = input("Enter email: ")
checkdomain = "@gmail.com"

if email.endswith(checkdomain):
    print("It's a valid email!")
else:
    print("Not a valid email!")