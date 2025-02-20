#Aufgabe 1 - Fibonacci-Folge ohne Funktionen und Klassen
#Schreibe ein Python-Script, wobei die Zahlen bis zur 50-igten Folgenstelle in der Commander-Zeile Zeilenweise angezeigt werden. Verwende keine Funktion oder Klasse.
#Aufgabe 1a zeige dahinter in Klammern wieviele stellen die Zahl hat.

a = 1
b = 1

print("Aufgabe 1a")
for i in range(50):
    sum = a + b
    a = b
    b = sum
    
    print(str(sum) + "(" + str(len(str(sum))) + ")")
    #python f string Konjungation

#Aufgabe 1b schreibe die Zahlen in eine Liste. Lass anschließen die Liste ausgeben.
fibonacci = [1, 1]
for i in range(50):
    sum = fibonacci[-1] + fibonacci[-2]
    fibonacci.append(sum)
print("Aufgabe 1b")
print(fibonacci)

#Aufgabe 1c anhand der Fibonacci-Folge, schreibe ein Python-Script, welches die Goldene Zahl berechnet. 
#Die Goldene Zahl ist das Verhältnis zweier aufeinanderfolgender Fibonacci-Zahlen.

goldene_zahl = []
for i in range(50):
    goldene_zahl.append(fibonacci[i+1] / fibonacci[i])
print("Aufgabe 1c")
print(goldene_zahl)

# Aufgabe 2 Schreibe das Python-Script so um das die Berechnung der Folge Zahl in einer Python-Funktion erfolgt.

def fibonaccifolge(n):
    fibonaccifolge = [1, 1]
    for i in range(n):
        sum = fibonaccifolge[-1] + fibonaccifolge[-2]
        fibonaccifolge.append(sum)
    return fibonaccifolge
print ("Aufgabe 2")
print (fibonaccifolge(50))

#Schreibe das Python-Script so um das die Berechnung rekursiv erfolgt. (Schau dazu an was eine Rekursive Python-Funktion bzw. rekursiv ist.

fibonacci_cache = {}

def fibonaccifolge_rekursiv(n):
    if n in fibonacci_cache:
        return fibonacci_cache[n]
    
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        value = fibonaccifolge_rekursiv(n-1) + fibonaccifolge_rekursiv(n-2) #Funktion ruft sich selbst zu oft auf und ist langsam
    
    fibonacci_cache[n] = value
    return value

print ("Aufgabe 3")

for i in range(50):
    print(fibonaccifolge_rekursiv(i))

#Aufgabe 3a Was sind vor und Nachteile von Rekursion? Sollte man diese Nutzen? Warum? Wie erfolgt die Berechnung im Vergleich zum normalen Ablauf.
#Vorteile: Rekursion ist eine Möglichkeit um Probleme zu lösen, die sich in kleinere Teilprobleme zerlegen lassen.
#Nachteile: Rekursion benötigt mehr Speicherplatz und ist langsamer, weil die Funktion sich selbst aufruft und redundanten Berechnungen durchführt.
#Man sollte Rekursion nur nutzen, wenn es notwendig ist, weil es ansonsten zu einer schlechteren Performance führt.
#Die Berechnung erfolgt im Vergleich zum normalen Ablauf, dass die Funktion sich selbst aufruft und die Ergebnisse der Teilprobleme speichert.


def fiborec(n, a=1, b=1):
    if n == 0:
        return 0
    c = a + b
    print(c)
    fiborec(n-1, b, c)

print("Aufgabe 3")
fiborec(50, 1, 1)
