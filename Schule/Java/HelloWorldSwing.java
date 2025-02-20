import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!" + " " + "this is a small swing demo");
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    
    }
}
