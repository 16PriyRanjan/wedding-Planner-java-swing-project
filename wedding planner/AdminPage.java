import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPage extends JFrame implements ActionListener {
   private JLabel label;
   private JButton button1;
   private JButton button2;
   
   public AdminPage() {
      setTitle("Admin Page");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1600, 1000);
      
      label = new JLabel("Welcome Admin!");
      label.setFont(new Font("Arial", Font.BOLD, 24));
      label.setHorizontalAlignment(SwingConstants.CENTER);
      add(label, BorderLayout.CENTER);
      
      button1 = new JButton("Admin Login");
      button1.addActionListener(this);
      add(button1, BorderLayout.NORTH);
      
      button2 = new JButton("Delete User");
      button2.addActionListener(this);
      add(button2, BorderLayout.SOUTH);
      
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button1) {
         
         // Code to add a user
      } else if (e.getSource() == button2) {
         // Code to delete a user
      }
   }
   
   public static void main(String[] args) {
      new AdminPage();
   }
}
