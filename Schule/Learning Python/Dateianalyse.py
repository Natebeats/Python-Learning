# Dateianalyse: Entwickle ein Programm, das eine Textdatei einliest und Statistiken 
# über den Inhalt der Datei ausgibt, wie z.B. die Anzahl der Wörter, die Anzahl der Zeilen, 
# die Häufigkeit jedes Wortes und die Häufigkeit jedes Buchstabens.

def dateianalyse(datei):
    try:
        # Öffne die Datei und analysiere sie
        with open(datei, "r") as file:
            text = file.read()
            wortliste = text.split()
            zeilen = text.splitlines()
            wortstatistik = {}
            buchstabenstatistik = {}
            for wort in wortliste:
                if wort in wortstatistik:
                    wortstatistik[wort] += 1
                else:
                    wortstatistik[wort] = 1
                for buchstabe in wort:
                    if buchstabe in buchstabenstatistik:
                        buchstabenstatistik[buchstabe] += 1
                    else:
                        buchstabenstatistik[buchstabe] = 1
        print(f"Anzahl der Wörter: {len(wortliste)}")
        print(f"Anzahl der Zeilen: {len(zeilen)}")
        print("Wortstatistik:")
        for wort, anzahl in wortstatistik.items():
            print(f"{wort}: {anzahl}")
        print("Buchstabenstatistik:")
        for buchstabe, anzahl in buchstabenstatistik.items():
            print(f"{buchstabe}: {anzahl}")
    except FileNotFoundError:
        print(f"Fehler: Die Datei '{datei}' wurde nicht gefunden.")
    except Exception as e:
        print(f"Ein unerwarteter Fehler ist aufgetreten: {e}")

# Benutzerinteraktion
dateipfad = input("Bitte gib den Dateipfad ein: ")
dateianalyse(dateipfad)

