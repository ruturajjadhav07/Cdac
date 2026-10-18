# 11. Write a program to compute simple interest and compound interest
principal = float(input("Enter the principal amount : "))
rate = float(input("Enter the annual interest rate in % : "))
time = float(input("Enter the time period in years : "))

# Simple Interest
simple_interest = (principal * rate * time) / 100

# Compound Interest (Compounded Annually)
# First find the total accumulated amount, then subtract the principal
total_amount = principal * ((1 + rate / 100) ** time)
compound_interest = total_amount - principal

print(f"Simple Interest: {simple_interest:.2f}")
print(f"Compound Interest: {compound_interest:.2f}")
print(f"Total Amount (Compound): {total_amount:.2f}")