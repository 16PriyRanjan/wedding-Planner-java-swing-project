import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.FileWriter;
//import java.io.IOException;
import java.sql.*;
//import java.util.IllegalFormatFlagsException;
public class App implements ActionListener{

    Connection con=null;    
    Statement stmt=null;
    ResultSet rs;
    PreparedStatement pstmt;

    JFrame frame;
    JLabel title,nameLabel,addressLabel,contactLabel,emailLabel,dobLabel,photo,video,foodtype,npeople,skillLabel,eduLabel,bgLabel,bLabel,gradLabel,perLabel,proLabel,projectLabel,proName,proDurLabel,proDescLabel,proTecLabel,cocoLabel;
    JTextField nameTxt,addressTxt,contactTxt,emailTxt,dobTxt,videotxt,floralTxt,descTxt,techTxt,lightTxt,phototxt,fnamebg,bgname,fnameb,bname,stateTxt,cityTxt,placeTxt,proNameTxt,proDurTxt,proDescTxt,proTecTxt,coco1,coco2,coco3;
    JCheckBox ch1,ch2,ch3,ch4,ch5,ch6;
    JRadioButton rb1,rb2,rb3,np1,np2,np3,np4;
    JPanel panel,panel1,panel2;
    JButton createBtn,admin,about,contact,home;


    JLabel background;
    
    App(){
        createFields();
        setField();
        addFields();
        frame.setVisible(true);
        createBtn.addActionListener(this);
        home.addActionListener(this);
        about.addActionListener(this);
        admin.addActionListener(this);
        contact.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
       
        if(ae.getSource()==createBtn){
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");  
    
           
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingplanner","root",""); 
           String name=nameTxt.getText();
       String address=addressTxt.getText();
       String contact=contactTxt.getText();
       String email=emailTxt.getText();
       String dob=dobTxt.getText();
       String video=videotxt.getText();
       String photo=phototxt.getText(); 
       String fatherbg=fnamebg.getText();
       String fatherb=fnameb.getText();
       String bridename=bgname.getText();
       String bridegname=bname.getText();
       String place=placeTxt.getText();
       String state=stateTxt.getText();
       String city=cityTxt.getText();
       String floral=floralTxt.getText();
       String light=lightTxt.getText();
       String desc=descTxt.getText();
       String tech=techTxt.getText();

       pstmt=con.prepareStatement("INSERT into register(name,address,contact,email,dob,video,photo,bridegname,fatherbg,bname,fatherb,place,state,city,floral,light,descp,tech)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

       pstmt.setString(1,name);
       pstmt.setString(2,address);
       pstmt.setString(3,contact);
       pstmt.setString(4,email);
       pstmt.setString(5,dob);
       pstmt.setString(6,video);
       pstmt.setString(7,photo);
       pstmt.setString(8,bridegname);
       pstmt.setString(9,fatherbg);
       pstmt.setString(10,bridename);
       pstmt.setString(11,fatherb);
       pstmt.setString(12,place);
       pstmt.setString(13,state);
       pstmt.setString(14,city);
       pstmt.setString(15,floral);
       pstmt.setString(16,light);
       pstmt.setString(17,desc);
       pstmt.setString(18,tech);
       
       pstmt.executeUpdate();
			    // JOptionPane.showMessageDialog(this,"data Inserted");
			     con.close();
                 rs.close();
                 stmt.close();
			    }
                catch(Exception e){ }}
            else if(ae.getSource()==admin)
            {
AdminPage ad=new AdminPage();
ad.show();
            }
            else if(ae.getSource()==contact)
            {
ContactUsForm cf=new ContactUsForm();
cf.show();

            }
            else if(ae.getSource()==about){
                AboutUs as=new AboutUs();
                as.show();
            }
       
    }

public void createFields(){
        frame = new JFrame("Wedding Planner");
        
        title = new JLabel("Wedding Planner");
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        nameLabel = new JLabel("Name");
        addressLabel = new JLabel("Address");
        contactLabel = new JLabel("Contact");
        emailLabel = new JLabel("Email");
        dobLabel = new JLabel("Date of event");
        video = new JLabel("Videography");
        photo = new JLabel("Photography");
        npeople=new JLabel("No. of People:");
        skillLabel = new JLabel("Other");
        foodtype = new JLabel("Food Type");
        bgLabel = new JLabel("BrideGroom details");
        bLabel = new JLabel("Bride Details");
        gradLabel = new JLabel("Event Location");
        perLabel = new JLabel("Personal Information");
        projectLabel = new JLabel("Decoration");
        proName = new JLabel("Floral(y/n)");
        proDurLabel = new JLabel("Light");
        proDescLabel = new JLabel("Description");
        proTecLabel = new JLabel("Technologies");
        //cocoLabel = new JLabel("Co-curricular Activities");

        nameTxt = new JTextField();
        addressTxt = new JTextField();
        contactTxt = new JTextField();
        emailTxt = new JTextField();
        dobTxt = new JTextField();
        videotxt = new JTextField();
        phototxt = new JTextField();
        
        rb1=new JRadioButton("Basic");
        rb2=new JRadioButton("Standard");
        rb3=new JRadioButton("Advance");
        ButtonGroup bg=new ButtonGroup();
       bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);
    np1=new JRadioButton("100");
        np2=new JRadioButton("500");
        np3=new JRadioButton("1000");
        np4=new JRadioButton("2000");
        ButtonGroup ag=new ButtonGroup();
       ag.add(np1);
    ag.add(np2);
    ag.add(np3);
    ag.add(np4);
        ch1 = new JCheckBox("Singer");
        ch2 = new JCheckBox("DJ");
        ch3 = new JCheckBox("Clarinet");
        ch4 = new JCheckBox("Floral rain");
       // ch5 = new JCheckBox("C#");
        //ch6 = new JCheckBox("R");
        
        fnamebg = new JTextField("Father Name");
        fnameb = new JTextField("Father Name");
        bgname = new JTextField("Name");
        bname = new JTextField("Name");
        stateTxt = new JTextField("State");
        cityTxt = new JTextField("City");
        placeTxt = new JTextField("Place");

        floralTxt = new JTextField();
        lightTxt = new JTextField();
        descTxt = new JTextField();
        techTxt = new JTextField();
    
       // coco1 = new JTextField();
       // coco2 = new JTextField();
        //coco3 = new JTextField();


        ImageIcon img=new ImageIcon("wedding.jpg");
        background=new JLabel("",img,JLabel.CENTER);
        
        
        
        createBtn = new JButton("Submit");
        createBtn.setBackground(Color.GREEN);
createBtn.setOpaque(true);
        admin = new JButton("Admin");
        admin.setBackground(Color.CYAN);
admin.setOpaque(true);
        about =new JButton("About");
        about.setBackground(Color.CYAN);
about.setOpaque(true);
        contact =new JButton("Contact us");
        contact.setBackground(Color.CYAN);
contact.setOpaque(true);
        home =new JButton("Home");
        home.setBackground(Color.CYAN);
home.setOpaque(true);

        

    }
    
    public void addFields(){
        
       panel.add(background);
       
        panel1.add(perLabel);
       panel1.add(nameLabel);
        panel1.add(nameTxt);
        panel1.add(contactLabel);
        panel1.add(contactTxt);
        panel1.add(addressLabel);
        panel1.add(addressTxt);
        panel1.add(emailLabel);
        panel1.add(emailTxt);
        panel1.add(dobLabel);
        panel1.add(dobTxt);
        
        panel1.add(video);
        panel1.add(videotxt);
        panel1.add(photo);
        panel1.add(phototxt);
panel1.add(foodtype);

panel1.add(rb1);
panel1.add(rb2);
panel1.add(rb3);

panel1.add(npeople);
panel1.add(np1);
panel1.add(np2);
panel1.add(np3);
panel1.add(np4);


        //panel1.add(cocoLabel);
        //panel1.add(coco1);
        //panel1.add(coco2);
        //panel1.add(coco3);

        panel1.add(createBtn);

        
        //panel.add(background);
        panel2.add(skillLabel);
        panel2.add(ch1);
        panel2.add(ch2);
        panel2.add(ch3);
        panel2.add(ch4);
        panel2.add(home);
       panel2.add(admin);
       panel2.add(about);
       panel2.add(contact);
       // panel2.add(ch5);
        //panel2.add(ch6);
       // panel2.add(eduLabel);

        panel2.add(bgLabel);
        panel2.add(bgname);
        panel2.add(fnamebg);
        panel2.add(bLabel);
        panel2.add(bname);
        panel2.add(fnameb);
        panel2.add(gradLabel);
        panel2.add(placeTxt);
        panel2.add(cityTxt);
        panel2.add(stateTxt);
        panel2.add(projectLabel);
        panel2.add(proName);
        panel2.add(floralTxt);
        panel2.add(proDurLabel);
        panel2.add(lightTxt);
        panel2.add(proDescLabel);
        panel2.add(descTxt);
        panel2.add(proTecLabel);
        panel2.add(techTxt);

        panel.add(panel1);
        panel.add(panel2);



background.setBounds(0,0,1024,720);

        frame.add(title,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    
    public void setField(){
        frame.setSize(1600,1000);
        frame.setLayout(new BorderLayout());
        
        title.setHorizontalAlignment(0);
        title.setFont(new Font("Freestyle Script", Font.BOLD, 72));
        title.setPreferredSize(new Dimension(250, 100));
        
        panel.setLayout(new GridLayout(1,2));
        panel1.setLayout(null);
        panel2.setLayout(null);

        perLabel.setFont(new Font("Verdana",Font.BOLD,15));
        perLabel.setBounds(50,10,200,30);

        home.setBounds(0,0,120,50);
        admin.setBounds(120,0,120,50);
        about.setBounds(240,0,120,50);
        contact.setBounds(360,0,120,50);


        nameLabel.setBounds(50,50,100,30);
        nameTxt.setBounds(110,50,120,30);
        contactLabel.setBounds(50,90,100,30);
        contactTxt.setBounds(110,90,120,30);
        addressLabel.setBounds(50,130,100,30);
        addressTxt.setBounds(110,130,120,30);
        emailLabel.setBounds(50,170,100,30);
        emailTxt.setBounds(110,170,120,30);
        dobLabel.setBounds(50,210,120,30);
        dobTxt.setBounds(130,210,120,30);
        video.setBounds(50,250,120,30);
        videotxt.setBounds(130,250,120,30);photo.setBounds(50,290,120,30);
        phototxt.setBounds(130,290,120,30);
foodtype.setBounds(50,350,120,30);
rb1.setBounds(110,350,100,30);
rb2.setBounds(210,350,100,30);
rb3.setBounds(310,350,140,30);
        //cocoLabel.setFont(new Font("",Font.BOLD,15));
        //cocoLabel.setBounds(50,330,300,30);
        npeople.setBounds(50,410,100,30);
        np1.setBounds(160,410,50,30);
np2.setBounds(210,410,50,30);
np3.setBounds(260,410,75,30);
np4.setBounds(330,410,80,30);
        

        skillLabel.setBounds(10,50,80,30);
        skillLabel.setFont(new Font("Verdana",Font.BOLD,15));
        ch1.setBounds(60,50,80,30);
        ch2.setBounds(140,50,60,30);
        ch3.setBounds(200,50,100,30);
        ch4.setBounds(300,50,120,30);
        //ch5.setBounds(320,10,60,30);
       // ch6.setBounds(380,10,80,30);
        
        //eduLabel.setFont(new Font("Verdana",Font.BOLD,15));
        //eduLabel.setBounds(10,20,300,100);

        bgLabel.setBounds(10,100,200,30);
        bgname.setBounds(10,130,200,30);
        fnamebg.setBounds(230,130,200,30);
        bLabel.setBounds(10,160,100,30);
        bname.setBounds(10,190,200,30);
        fnameb.setBounds(230,190,200,30);
        gradLabel.setBounds(10,220,100,30);
        placeTxt.setBounds(10,250,100,30);
        stateTxt.setBounds(120,250,100,30);
        cityTxt.setBounds(230,250,200,30);

        projectLabel.setFont(new Font("Verdana", Font.BOLD, 15));
        projectLabel.setBounds(10,270,300,100);

        proName.setBounds(10,340,100,30);
        floralTxt.setBounds(90,340,200,30);
        proDurLabel.setBounds(10,380,100,30);
        lightTxt.setBounds(90,380,200,30);
        proDescLabel.setBounds(10,420,100,30);
        descTxt.setBounds(90,420,200,30);
        proTecLabel.setBounds(10,460,100,30);
        techTxt.setBounds(90,460,200,30);

        createBtn.setBounds(50,510,200,40);
        createBtn.setFont(new Font("Freestyle Script",Font.BOLD,30));


    }
    public static void main(String[] args) {
        new App();
        
    }
}
//javac -classpath ..\lib\mysql-connector-j-8.0.32.jar;. App.java