# 7. Write a program to take inputs for day and month and then calculate which day of the year the
# given date is. (Take 30 days for all months) For eg.If input is day 3 and month 2 , then it should
# print” Day of the year 33”.

day = int(input("Enter day: "))
month = int(input("Enter month: "))

if 1 <= day <= 30 and 1 <= month <= 12:
    print("Day of the year", (month - 1) * 30 + day)
else:
    print("Invalid day or month")
