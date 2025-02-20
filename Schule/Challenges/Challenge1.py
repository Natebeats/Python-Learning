'''
Challenge
Capital indexes
Write a function named capital_indexes. The function takes a single parameter, which is a string. Your function should return a list of all the indexes in the string that have capital letters.

For example, calling capital_indexes("HeLlO") should return the list [0, 2, 4].

Your code should consider each letter in the string at a time. Keep track of the current index; you can do this with enumerate() or manually. To check if a letter is uppercase, you can use the .isupper() method, or use the in operator to see if the letter is in "ABCD..XYZ".
'''

def capital_indexes(string):
    return [i for i, letter in enumerate(string) if letter.isupper()]

print(capital_indexes("My Sister Is Dumb"))  # [0, 3, 10, 13]

