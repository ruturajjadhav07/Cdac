# 7. Write a program that reads a line of text and displays the longest word.

text = input("Enter text: ")
splitText = text.split()

if splitText:
    longestWord = splitText[0]

    for word in splitText[1:]:
        if len(word) > len(longestWord):
            longestWord = word

    print("Longest word:", longestWord)
else:
    print("No text were entered.")