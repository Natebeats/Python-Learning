# The challenge: Write a function that converts a binary number to its decimal equivalent.
#mein code
def binary_to_decimalmine(binary):
    return int(binary, 2)

print(binary_to_decimalmine("0101")) # 5

#code von der Website

def binary_to_decimal(binary):
    decimal, i = 0, 0
    while(binary != 0):
        dec = binary % 10 #letzte Stelle
        decimal = decimal + dec * pow(2, i) #letzte Stelle * 2^i + decimal
        binary = binary//10 #binary wird durch 10 geteilt und somit die letzte Stelle entfernt
        i += 1 #i wird um 1 erhöht
    return decimal 

print(binary_to_decimal(1010101)) # 85

#mein code ist effizienter
#code von der Website ist besser zu lesen und zu verstehen was passiert bei der Umrechnung‚