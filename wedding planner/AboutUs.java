import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel, descriptionLabel;
    private JTextArea descriptionArea;
    private JButton backButton;

    public AboutUs() {
        // Set up the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        // Add the title label
        titleLabel = new JLabel("About Us");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30));
        mainPanel.add(titleLabel);

        // Add the description field and label
        descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea();
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setText("At Wedding Planner, we specialize in creating beautiful and unforgettable weddings. Our experienced team of planners will work with you every step of the way to bring your vision to life. Whether you're looking for a classic and elegant affair or a more modern and eclectic celebration, we have the expertise to make it happen. Contact us today to schedule a consultation and start planning your dream wedding.");
        JScrollPane descriptionScroll = new JScrollPane(descriptionArea);
        mainPanel.add(descriptionLabel);
        mainPanel.add(descriptionScroll);

        // Add the back button
        backButton = new JButton("Back");
        mainPanel.add(backButton);

        // Set up the frame
        setTitle("About Us");
        setSize(1600, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the main panel to the frame
        add(mainPanel);

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new AboutUs();
    }
}