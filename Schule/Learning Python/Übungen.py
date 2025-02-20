import testmodule  # Importiert das Modul testmodule

testmodule.sayhallo("Thanh")  # Ruft die Funktion hello() aus dem Modul testmodule auf

x = pow(2, 4)  # Ruft die Funktion pow() aus dem Modul math auf
print(x)

import re

# Get pattern input from the user
pattern = input("Geben Sie das Suchmuster ein: ")

# Return a list containing every occurrence of the input pattern
txt = input("Geben Sie den Text ein: ")
x = re.findall(pattern, txt)

# Print the number of occurrences
print(len(x))