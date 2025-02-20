#schreibe ein Programm, das zwei Strings nimmt und überprüft, ob sie Anagramme voneinander sind. 
#Ein Anagramm ist ein Wort oder eine Phrase, die durch Umstellen der Buchstaben eines anderen Wortes oder einer anderen Phrase gebildet wird, 
#wobei alle ursprünglichen Buchstaben genau einmal verwendet werden.

def anagramm(s1, s2):
    s1 = s1.replace(" ", "").lower()
    s2 = s2.replace(" ", "").lower()
    return sorted(s1) == sorted(s2)

print(anagramm("listen", "silent")) # True
print(anagramm("hello", "world")) # False
print(anagramm("Dormitory", "dirty room")) # True
print(anagramm("School master", "The classroom")) # True
