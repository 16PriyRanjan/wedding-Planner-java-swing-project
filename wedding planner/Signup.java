import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Signup extends JFrame implements ActionListener {
    Connection con=null;    
    Statement stmt=null;
    ResultSet rs;
    PreparedStatement pstmt;


    JLabel nameLabel, emailLabel, phoneLabel,background,l3;
    JTextField nameTextField, emailTextField, phoneTextField;
    JButton submitButton,loginButton;
    
    Signup() {

        ImageIcon img=new ImageIcon("sig2.png");
        background=new JLabel("",img,JLabel.CENTER);

        l3 = new JLabel("Wedding Planner ");
        Font g=new Font("Freestyle Script", Font.BOLD,108);l3.setFont(g);
        l3.setBounds(450,10,750,130);

        add(l3);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(100, 350, 100, 30);
        add(nameLabel);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(200, 350, 200, 30);
        add(nameTextField);
        
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(100, 400, 100, 30);
        add(emailLabel);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(200, 400, 200, 30);
        add(emailTextField);
        
        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(100, 450, 100, 30);
        add(phoneLabel);
        
        phoneTextField = new JTextField();
        phoneTextField.setBounds(200, 450, 200, 30);
        add(phoneTextField);
        
        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(150, 500, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);
        loginButton = new JButton("LOGIN");
        loginButton.setBounds(300, 500, 100, 30);
        loginButton.addActionListener(this);
        add(loginButton);
        background.setBounds(600,100,1024,720);
        add(background);
        
        setTitle("Wedding Planner Signup Form");
        this.getContentPane().setBackground(Color.blue);
        setSize(1600, 1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submitButton){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  

       
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingplanner","root",""); 
       String nm=nameTextField.getText();
       String email=emailTextField.getText();
       //int mobile=Integer.parseInt(phoneTextField.getText()); 
       //String mobile=phoneTextField.getText();
       pstmt=con.prepareStatement("INSERT into login(name,email)values(?,?)");
       pstmt.setString(1,nm);
			     pstmt.setString(2,email);
			     //pstmt.setInt(3,mobile);
                 pstmt.executeUpdate();
			     JOptionPane.showMessageDialog(this,"data Inserted");
			     con.close();
                 rs.close();
                 stmt.close();
                 
			    }
			catch(Exception e){}

		}
        else{
            login log=new login();
            log.show();
            dispose();
        }
    }
    
    public static void main(String[] args) {
        new Signup();
    }
}
