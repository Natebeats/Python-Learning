package day1702;

import java.io.IOException;
import java.util.logging.*;

public class DateiLogger {
    private static final Logger logger = Logger.getLogger(DateiLogger.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("./logfile.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.info("Dies wird in der Datei gespeichert.");
            logger.warning("Hier eine Warnung.");
        } catch (IOException e) {
            logger.severe("Fehler beim Öffnen der Log-Datei: " + e.getMessage());
        }
    }
}