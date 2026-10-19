# 12.  Write a program that reads a line of text and prints the count of words in a line

text = input("Enter text: ")
wordsSplit = text.split()
if text.strip():
    checkWord = input("Enter word to check: ")
    if checkWord.strip():
        count = wordsSplit.count(checkWord)
        if count > 0:
            print(f"{checkWord} found {count} times in", text)
        else:
            print(f"{checkWord} not present in", text)
    else:
        print("No word was entered to check.")
else:
    print("No text was entered.")
