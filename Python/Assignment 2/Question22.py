marks = []

for subject in range(1, 6):
    mark = float(input(f"Enter marks for subject {subject} (out of 100): "))
    marks.append(mark)

print("\nMarks entered:")
for subject, mark in enumerate(marks, start=1):
    print(f"Subject {subject}: {mark:g}")

percentage = sum(marks) / 5
print(f"Percentage: {percentage:.2f}%")

if percentage > 85:
    grade = "A"
elif percentage >= 75:
    grade = "B"
elif percentage >= 50:
    grade = "C"
elif percentage >= 30:
    grade = "D"
else:
    grade = "Fail"

print(f"Grade: {grade}")
