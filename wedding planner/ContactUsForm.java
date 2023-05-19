import javax.swing.*;
import java.awt.*;

public class ContactUsForm extends JFrame {
    private JPanel mainPanel;
    private JLabel nameLabel, emailLabel, messageLabel;
    private JTextField nameField, emailField;
    private JTextArea messageArea;
    private JButton submitButton;

    public ContactUsForm() {
        // Set up the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        // Add the name field and label
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        // Add the email field and label
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);

        // Add the message field and label
        messageLabel = new JLabel("Message:");
        messageArea = new JTextArea();
        mainPanel.add(messageLabel);
        mainPanel.add(messageArea);

        // Add the submit button
        submitButton = new JButton("Submit");
        mainPanel.add(submitButton);

        // Set up the frame
        setTitle("Contact Us");
        setSize(1600, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the main panel to the frame
        add(mainPanel);

        // Show the frame
        setVisible(true);
    }

    
}