import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial extends JFrame implements ActionListener {
    private JTextField numberField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public Factorial() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));
        numberField = new JTextField();
        numberField.setHorizontalAlignment(JTextField.CENTER);
        add(numberField);
        calculateButton = new JButton("Calculate Factorial");
        calculateButton.addActionListener(this);
        add(calculateButton);
        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        add(resultLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(numberField.getText());
            long factorial = calculateFactorial(number);
            resultLabel.setText("Factorial of " + number + " is: " + factorial);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

public static void main(String[] args) {
new Factorial();
}
}
