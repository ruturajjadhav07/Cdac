# 10.  Write a program that asks the user for a string and a character and 
# then it print the locations of that character in the string 

text = input("Enter text: ")
if text:
    character = input("Enter character: ")
    if len(character) == 1:
        found = False
        for index in range(len(text)):
            if text[index] == character:
                print(f"Character found at position {index}")
                found = True

        if not found:
            print(f"{character} is not present in the text.")
    else:
        print("Please enter exactly one character.")
else:
    print("No text was entered.")
        