import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Taschenrechner extends JFrame implements ActionListener {
    private final JTextField display;
    private final JTextField resultField;
    private final JPanel panel;
    private final StringBuilder currentInput;
    private double result;
    private String operator;

    public Taschenrechner() {
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setHorizontalAlignment(JTextField.RIGHT);
        resultField.setFont(new Font("Arial", Font.BOLD, 20));

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        currentInput = new StringBuilder();
        result = 0;
        operator = "";

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(resultField, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setTitle("Taschenrechner");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            currentInput.append(command);
            display.setText(currentInput.toString());
        } else if (command.equals("C")) {
            currentInput.setLength(0);
            result = 0;
            operator = "";
            display.setText("");
            resultField.setText("");
        } else if (command.equals("=")) {
            calculate(Double.parseDouble(currentInput.toString()));
            resultField.setText(String.valueOf(result));
            currentInput.setLength(0);
        } else {
            if (currentInput.length() > 0) {
                calculate(Double.parseDouble(currentInput.toString()));
                currentInput.setLength(0);
            }
            operator = command;
        }
    }

    private void calculate(double number) {
        switch (operator) {
            case "+":
                result += number;
                break;
            case "-":
                result -= number;
                break;
            case "*":
                result *= number;
                break;
            case "/":
                result /= number;
                break;
            default:
                result = number;
                break;
        }
    }

    public static void main(String[] args) {
        new Taschenrechner();
    }
}
