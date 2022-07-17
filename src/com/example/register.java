package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class register {
    //variables
    static JFrame f;
    static JTextField first_name;
    static JTextField second_name;
    static JTextField email;
    static JTextField phone_number;
    static JTextField password;
    static JTextField title;
    static JTextField fin;
    static JTextField sein;
    static JTextField emailin;
    static JTextField phonein;
    static JPasswordField pwin;
    static JButton r;
    static boolean IsCcorrect;
    public register(){
        //frame
        //text
        f= new JFrame("Register");
        f.setSize(400,200);
        f.setName("Register");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //title
        title = new JTextField("Please Register");
        title.setBounds(150, 0, 200, 20);
        title.setEditable(false);
        title.setBorder(BorderFactory.createEmptyBorder());
        //text fields
        first_name = new JTextField("First name:");
        first_name.setBounds(0,30,100,20);
        first_name.setEditable(false);
        first_name.setBorder(BorderFactory.createEmptyBorder());
        second_name= new JTextField("Second name:");
        second_name.setBounds(0,50,100,20);
        second_name.setEditable(false);
        second_name.setBorder(BorderFactory.createEmptyBorder());
        email= new JTextField("Email address:");
        email.setBounds(0,70,100,20);
        email.setBorder(BorderFactory.createEmptyBorder());
        email.setEditable(false);
        phone_number= new JTextField("Phone number:");
        phone_number.setBounds(0,90,100,20);
        phone_number.setBorder(BorderFactory.createEmptyBorder());
        phone_number.setEditable(false);
        password= new JTextField("PIN:");
        password.setBounds(0,120,100,20);
        password.setBorder(BorderFactory.createEmptyBorder());
        password.setEditable(false);
        //inputs
        fin= new JTextField("Enter your First name!");
        fin.setBounds(100,30,150,20);
        fin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fin.setText("");
            }
        });
        sein= new JTextField("Enter your Second name!");
        sein.setBounds(100,50,150,20);
        sein.setBorder(BorderFactory.createLineBorder((Color.BLACK)));
        sein.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sein.setText("");
            }
        });
        emailin= new JTextField("Enter your Email");
        emailin.setBounds(100,70,150,20);
        emailin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        emailin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emailin.setText("");
            }
        });
        phonein= new JTextField("Enter your Phone number");
        phonein.setBounds(100,90,150,20);
        phonein.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        phonein.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                phonein.setText("");
            }
        });
        pwin=new JPasswordField("");
        pwin.setBounds(100,120,150,20);
        pwin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //button
        r= new JButton("Register");
        r.setBounds(270,40, 90,80);
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    regcheck();
            }
        });
        //adding fields
        f.add(title);
        f.add(first_name);
        f.add(second_name);
        f.add(email);
        f.add(phone_number);
        f.add(password);
        f.add(fin);
        f.add(sein);
        f.add(emailin);
        f.add(phonein);
        f.add(pwin);
        f.add(r);
        //frame settings
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
    }
    //check
    public static void regcheck(){
        Connect a = new Connect();
        try{

            Statement stmt = a.con.createStatement();
            //getting id
            String getid= String.format("SELECT max(id) from userinfo");
            ResultSet rs = stmt.executeQuery(getid);
            int id = Integer.parseInt(rs.getObject(1).toString())+1;
            //add to userinfo
            String addtouser=String.format("INSERT INTO userinfo (id,firstname,secondname,email,phonenumber,password)" +
                    "VALUES ('%d','%s','%s','%s','%s','%s')",id,fin.getText(),sein.getText(),emailin.getText(),phonein.getText(),pwin.getPassword());
            stmt.executeUpdate(addtouser);
            //add to userlogin
            int cardnumber= Integer.parseInt(GenerateCardNum());
            for(int i = 0;i<id+1;i++){

            }
            String addtouserlog= String.format("INSERT INTO userlogin (user_id,card_number,card_pin)" +
                    "VALUES ('%d','%d','%d')",id,cardnumber,pwin.getPassword());
            JOptionPane.showMessageDialog(null, "You registered");
            stmt.close();
        }
        catch (Exception k) {
            JOptionPane.showMessageDialog(null, k.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }
    static String GenerateCardNum(){
        String cardnum="";
        Random rnd= new Random();
        for(int i=0;i<10;i++){
            cardnum+=rnd.nextInt(10);
        }
        return cardnum;
    }
}
