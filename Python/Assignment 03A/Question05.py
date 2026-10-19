# 5. Write a program that reads a line and a string and
# then display the number of occurrences if the string in the line

text = input("Enter text: ")

count = 0

if text:
    search = input("Enter word or letter to search in text: ")

    if search:
        count = text.count(search)

        if count > 0:
            print(f"{search} occurs {count} time in {text}")
        else:
            print(f"{search} is not present in {text}")
    else:
        print("No word or letter was entered.")
else:
    print("No text was entered.")
