package com.example;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Statement;

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
    static JTextField pwin;
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
        password= new JTextField("Password:");
        password.setBounds(0,120,100,20);
        password.setBorder(BorderFactory.createEmptyBorder());
        password.setEditable(false);
        //inputs

        //adding fields
        f.add(title);
        f.add(first_name);
        f.add(second_name);
        f.add(email);
        f.add(phone_number);
        f.add(password);
        //frame settings
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
    }
    //check
    public static void logincheck(){
        Connect a = new Connect();
        try{
            String sql=" ";
            Statement stmt = a.con.createStatement();
            //stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Success");
        }
        catch (Exception k) {
            JOptionPane.showMessageDialog(null, k.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }
}
