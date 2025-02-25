package day2502.factory;

import java.util.List;

/**
 * Hauptklasse zur Initialisierung aller Controller.
 */
public class Main {
    public static void main(String[] args) {
    	String currentDir = System.getProperty("user.dir");
        List<ControllerInterface> controllers = ControllerFactory.loadControllers(currentDir+"/src/day2502/factory/controllers.txt");
        for (ControllerInterface controller : controllers) {
            controller.init();
        }
    }
}