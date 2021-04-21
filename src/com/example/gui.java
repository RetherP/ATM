package com.example;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class gui {
    public gui(){
        //frames
        JFrame f = new JFrame("ATM machine");
        f.setName("Atm machine");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //text fields
        JTextField title = new JTextField("Please login");
        title.setBounds(150, 0, 200, 20);
        title.setEditable(false);
        title.setBorder(BorderFactory.createEmptyBorder());

        JTextField username= new JTextField("username:");
        username.setBounds(0, 50, 60,20);
        username.setEditable(false);

        username.setBorder(BorderFactory.createEmptyBorder());
        JTextField pw= new JTextField("password:");
        pw.setBounds(0, 100, 60,20);
        pw.setEditable(false);
        pw.setBorder(BorderFactory.createEmptyBorder());

        //input
        JTextField userinut= new JTextField("Enter your username");
        userinut.setBounds(80,50, 150, 20);
        userinut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        userinut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userinut.setText("");
            }
        });
        JTextField pwinput= new JTextField("Enter your password");
        pwinput.setBounds(80,100,150,20);
        pwinput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pwinput.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pwinput.setText("");
            }
        });

        //adding fields
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
}
