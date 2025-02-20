package day1702;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeinLogger {
    private static final Logger logger = Logger.getLogger(MeinLogger.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO); // Nur WARNING und schlimmeres wird geloggt

        logger.info("Diese Nachricht wird NICHT erscheinen.");
        logger.warning("Achtung! Dies erscheint.");
        logger.severe("Kritischer Fehler! Dies auch.");

    }
}
