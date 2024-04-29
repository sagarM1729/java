import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame
{
    private JLabel nameLabel, ageLabel, genderLabel, courseLabel;
    private JTextField nameField, ageField;
    private JComboBox<String> genderComboBox, courseComboBox;
    private JButton submitButton;

    public Registration() {
        setTitle("Student Registration Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);
        ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        add(ageLabel);
        add(ageField);
        genderLabel = new JLabel("Gender:");
        String[] genders = { "Male", "Female", "Other" };
        genderComboBox = new JComboBox<>(genders);
        add(genderLabel);
        add(genderComboBox);
        courseLabel = new JLabel("Course:");
        String[] courses = { "Computer Science", "Information Technology", "Electonics", "Civil",
                "Mechanical", "Electrcal" };
        courseComboBox = new JComboBox<>(courses);
        add(courseLabel);
        add(courseComboBox);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String gender = (String) genderComboBox.getSelectedItem();
                String course = (String) courseComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null,
                        "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nCourse: " + course,
                        "Registration Successful",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(submitButton);
        setVisible(true);
    }

public static void main(String[] args) {
new Registration();
}
}