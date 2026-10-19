# 2. Write a program that asks for a username and password. Print “Login successful” if the
# password does not contain username and password is “cdac”

username = input("Enter username: ")
password = input("Enter password: ")


def checkusername(username, password):
    return username.lower() not in password.lower()


def checkpassword(password):
    return password == "cdac"


checkuname = checkusername(username, password)
checkpward = checkpassword(password)

if checkuname and checkpward:
    print("Login successful")
else:
    print("Login failed")
