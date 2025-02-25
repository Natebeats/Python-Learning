# Aufgabe: Schreibe eine Funktion count_vowels, die eine Zeichenkette als Eingabe erhält und die Anzahl der Vokale (a, e, i, o, u) in der Zeichenkette zurückgibt. 
# Die Funktion sollte sowohl Groß- als auch Kleinbuchstaben berücksichtigen.

def count_vowels(string):
    vowels = "aeiou"
    count = 0
    for char in string:
        if char.lower() in vowels:
            count += 1
    return count

# Test cases
print(count_vowels("hello")) # 2

# zusätzliche Herausforderung
# könntest du die Funktion erweitern, um auch Umlaute (ä, ö, ü) und ihre Großbuchstaben (Ä, Ö, Ü) zu berücksichtigen.


def count_vokaleundumlaute(string):
    vowels_and_umlauts = "aeiouäöü"
    count = 0
    string = string.lower()
    for char in string:
        if char in vowels_and_umlauts:
            count += 1
    return count

# Test cases
print(count_vokaleundumlaute("HELLO")) # 2
print(count_vokaleundumlaute("hello")) # 2
print(count_vokaleundumlaute("HeLLo")) # 2
print(count_vokaleundumlaute("Schön")) # 1
print(count_vokaleundumlaute("Über"))  # 2
print(count_vokaleundumlaute("Übermäßig")) # 4
