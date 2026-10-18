# 23. Write a Python program to print the following shapes
# a)
#     *
#     * *
#     * * *
#     * *
#     *
#
# b)
#     0
#     22
#     444
#     6666
#     88888

# Pattern a
for i in range(1, 4):
    print(" ".join(["*"] * i))
for i in range(2, 0, -1):
    print(" ".join(["*"] * i))

print()

# Pattern b
for i in range(5):
    print(str(2 * i) * (i + 1))

    # Not done by me
