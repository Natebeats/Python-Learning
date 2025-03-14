package posts.main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        List<ControllerInterface> controllers = ControllerFactory.loadControllers("controllers.txt");
        for (ControllerInterface controller : controllers) {
            controller.init();

        }
    }
}
