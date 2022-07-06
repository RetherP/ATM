package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;

public class login {
    //variable
    static JFrame f;
    static JTextField title;
    static JTextField username;
    static JTextField pw;
    static JTextField userinut;
    static JTextField pwinput;
    static JButton b;
    static JButton r;
    public login(){
        //frames
        f = new JFrame("ATM machine");
        f.setName("Atm machine");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //text fields
        title = new JTextField("Please login");
        title.setBounds(150, 0, 200, 20);
        title.setEditable(false);
        title.setBorder(BorderFactory.createEmptyBorder());

        username= new JTextField("Card number:");
        username.setBounds(0, 50, 90,20);
        username.setEditable(false);
        username.setBorder(BorderFactory.createEmptyBorder());

        pw= new JTextField("Password:");
        pw.setBounds(0, 100, 70,20);
        pw.setEditable(false);
        pw.setBorder(BorderFactory.createEmptyBorder());

        //input
        userinut= new JTextField("Enter your card number");
        userinut.setBounds(90,50, 165, 20);
        userinut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        userinut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userinut.setText("");
            }
        });
        pwinput= new JTextField("Enter your pin");
        pwinput.setBounds(90,100,165,20);
        pwinput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pwinput.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pwinput.setText("");
            }
        });
        //loginbutton
        b = new JButton("Login");
        b.setBounds(275, 47, 90,80);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        //registerbutton
        r= new JButton("Register");
        r.setBounds(100, 130, 150, 30);
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register r = new register();
                f.dispose();
            }
        });
        //adding fields
        f.add(b);
        f.add(r);
        f.add(title);
        f.add(username);
        f.add(pw);
        f.add(userinut);
        f.add(pwinput);
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
