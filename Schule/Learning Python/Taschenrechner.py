def taschenrechner(a, operator, b):
    try:
        if operator == "+":
            return a + b
        elif operator == "-":
            return a - b
        elif operator == "*":
            return a * b
        elif operator == "/":
            if b != 0:
                return a / b
            else:
                return "Fehler: Division durch Null"
        elif operator == "**":
            return a ** b
        elif operator == "%":
            return a % b
        else:
            return "Ungültiger Operator"
    except Exception as e:
        return f"Fehler: {e}"

# Benutzerinteraktion
try:
    a = float(input("Gib die erste Zahl ein: "))
    operator = input("Gib den Operator ein (+, -, *, /, **, %): ")
    b = float(input("Gib die zweite Zahl ein: "))
    ergebnis = taschenrechner(a, operator, b)
    print(f"Ergebnis: {ergebnis}")
except ValueError:
    print("Bitte gib gültige Zahlen ein.")
