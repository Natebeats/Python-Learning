# 1. Palindromische Zahlensuche
# Schreiben Sie ein Programm, das alle palindromischen Zahlen in einem gegebenen Bereich (zum Beispiel von 10 bis 10.000) findet. 
# Ein Palindrom ist eine Zahl, die rückwärts gelesen gleich bleibt (z. B. 121 oder 12321).

# Zusatzaufgabe: Zählen Sie, wie viele solcher Zahlen es gibt,und geben Sie die größte und kleinste palindromische Zahl im Bereich aus.

def Palindromecheck(string):
    if string == string[::-1]:
        return True
    else:
        return False
    


def PalindromicNumbers(start, end):
    counter = 0
    palindromic_numbers = []
    for i in range(start, end + 1):  # Endwert einschließen
        if Palindromecheck(str(i)):  # Überprüfen, ob die Zahl ein Palindrom ist
            palindromic_numbers.append(i)
            counter += 1
    
    if palindromic_numbers:  # Überprüfen, ob die Liste nicht leer ist
        return palindromic_numbers, counter, min(palindromic_numbers), max(palindromic_numbers)
    else:
        return "No Palindromic Numbers found"

# Testen
print(PalindromicNumbers(10, 10000))
