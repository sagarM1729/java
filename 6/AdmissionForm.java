import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdmissionForm extends JFrame implements ActionListener {
    // Components
    private JTextField nameField;
    private JTextField ageField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextArea addressArea;
    private JButton submitButton;
    private JButton clearButton;

    public AdmissionForm() {
        setTitle("Admission Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        // Labels
        add(new JLabel("Name: "));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age: "));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Gender: "));
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderPanel);

        add(new JLabel("Address: "));
        addressArea = new JTextArea();
        addressArea.setRows(3);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        add(scrollPane);

        // Buttons
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get form data and process it
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = (maleRadioButton.isSelected()) ? "Male" : "Female";
            String address = addressArea.getText();

            // Example: Displaying the form data
            JOptionPane.showMessageDialog(this, "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAddress: " + address, "Form Data", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == clearButton) {
            // Clear form fields
            nameField.setText("");
            ageField.setText("");
            maleRadioButton.setSelected(true);
            addressArea.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdmissionForm());
    }
}
