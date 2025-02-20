def Palindromecheck(string):
    if string == string[::-1]:
        return True
    else:
        return False
    
print(Palindromecheck('madam'))
print(Palindromecheck('hello'))
print(Palindromecheck('level'))