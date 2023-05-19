import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class login extends JFrame implements ActionListener
{
    Connection con=null;    
    Statement stmt=null;
    ResultSet rs;
    PreparedStatement pstmt;
    JLabel l1,l2,l3,background;
    JTextField t1,t2;
    JButton b1,b2;
    //JPasswordField t2;
    login()
    {
        setTitle("Login");
        this.getContentPane().setBackground(Color.red);
        l1=new JLabel("Enter User Name");
        l2=new JLabel("Enter Password");
       // l3=new JLabel("Checking");
       l3=new JLabel("Wedding planner");
        b1=new JButton("Login");
        b2=new JButton("SignUp");
        t1=new JTextField();
        t2=new JTextField();

        ImageIcon img=new ImageIcon("log.png");
        background=new JLabel("",img,JLabel.CENTER);


        Font g=new Font("Freestyle Script", Font.BOLD,108);
        Font f=new Font("Lucida console",Font.BOLD,14);
        setLayout(null);
        l3.setFont(g);
        l1.setFont(f);l2.setFont(f);t1.setFont(f);t2.setFont(f);b1.setFont(f);b2.setFont(f);
        l3.setBounds(450,10,750,130);
        l1.setBounds(550,250,150,25);t1.setBounds(750,250,150,25);
        l2.setBounds(550,300,150,25);t2.setBounds(750,300,150,25);
        b1.setBounds(550,350,150,25);b2.setBounds(750,350,150,25);
        background.setBounds(0,0,800,720);
        add(l3);
        add(l1);add(l2);
        
        add(b1);add(b2);
        add(t1);add(t2);
        add(background);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
   public void actionPerformed(ActionEvent ee)
    {
        if(ee.getSource()==b1)
        {
            //App ap=new App();
            //ap.show();
            //dispose();
            try
            {
                
                //String s1=t1.getText();
            //String s2=t2.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingplanner","root","");

                    String q="select email FROM login where name='"+t1.getText()+"'";
                    stmt=con.createStatement();
                    rs=stmt.executeQuery(q);

                    //if(rs.next())
                    String get_email="";
                    while(rs.next())
                    {
                        get_email=rs.getString(1);
                        


                       //js = new JFrame("Show ");
    }
    if(get_email.equals(t2.getText()))
    {
        
        JOptionPane.showMessageDialog(null,"Login successful" ); 
        //App ap=new App();
        //ap.show();
        //dispose();
    }

    }
        catch(Exception e){}
    

        }
        else
        {
        //System.exit(0);
        Signup sg=new Signup();
        sg.show();
        dispose();
        }
    }
    /*public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)

       
	else
        {
		System.exit(0);
	}
     } */
    public static void main(String args[])
    {
     login obj=new login();
     obj.setSize(1600,800);
     obj.setVisible(true);
     obj.setLocation(0,0);
     obj.setDefaultCloseOperation(obj.EXIT_ON_CLOSE);
     }

}
//javac -classpath ..\lib\mysql-connector-j-8.0.32.jar;. Project1.java