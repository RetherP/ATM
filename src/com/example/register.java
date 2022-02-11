package com.example;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class register {
    //variables
    static JFrame f;
    static JTextField first_name;
    static JTextField second_name;
    static JTextField email;
    static JTextField phone_number;
    static JTextField password;
    static JTextField title;
    public register(){
        //frame
        f= new JFrame("Register");
        f.setSize(400,400);
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
        //adding fields
        f.add(title);
        f.add(first_name);
        f.add(second_name);
        //frame settings
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
    }
}
