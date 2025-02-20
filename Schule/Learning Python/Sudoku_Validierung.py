# Sudoku-Validierung: Schreibe eine Funktion, die ein 9x9-Sudoku-Raster nimmt und überprüft, 
# ob es sich um eine gültige Lösung handelt. Eine gültige Sudoku-Lösung bedeutet, dass jede Zeile, 
# jede Spalte und jedes 3x3-Untergitter die Zahlen von 1 bis 9 genau einmal enthält.

def sudoku_validierung(sudoku):
    def ist_gueltig(zeile):
        # Filtert die Zeichen aus der Zeile, die nicht '.' sind
        zeile = [zahl for zahl in zeile if zahl != "."]
        # Überprüft, ob alle Zeichen eindeutig sind
        return len(zeile) == len(set(zeile))
    
    def spalten(sudoku):
        # Erstellt eine Liste der Spalten des Sudokus
        return [[sudoku[j][i] for j in range(9)] for i in range(9)]
    
    def untergitter(sudoku):
        # Erstellt eine Liste der 3x3-Untergitter des Sudokus
        untergitter = []
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                untergitter.append([sudoku[x][y] for x in range(i, i + 3) for y in range(j, j + 3)])
        return untergitter
    
    # Überprüft alle Reihen
    for zeile in sudoku:
        if not ist_gueltig(zeile):
            return False
    # Überprüft alle Spalten
    for spalte in spalten(sudoku):
        if not ist_gueltig(spalte):
            return False
    # Überprüft alle Untergitter
    for gitter in untergitter(sudoku):
        if not ist_gueltig(gitter):
            return False
    return True

sudoku = [
    ["5","3",".",".","7",".",".",".","."],
    ["6",".",".","1","9","5",".",".","."],
    [".","9","8",".",".",".",".","6","."],
    ["8",".",".",".","6",".",".",".","3"],
    ["4",".",".","8",".","3",".",".","1"],
    ["7",".",".",".","2",".",".",".","6"],
    [".","6",".",".",".",".","2","8","."],
    [".",".",".","4","1","9",".",".","5"],
    [".",".",".",".","8",".",".","7","9"]
]

print(sudoku_validierung(sudoku))  # Ausgabe: True
