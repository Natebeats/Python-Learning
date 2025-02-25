# Aufgabe: Schreibe eine Funktion nested_sum,
# die eine verschachtelte Liste von Zahlen als Eingabe erhält und die Summe aller Elemente in der Liste zurückgibt.
# Die Liste kann beliebig tief verschachtelt sein.

def nested_sum(liste):
    summe = 0
    for element in liste:
        if type(element) == list:
            summe += nested_sum(element)
        else:
            summe += element
    return summe

# Test cases

print(nested_sum([1, 2, 3, 4])) # 10