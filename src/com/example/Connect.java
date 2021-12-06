package com.example;

import javax.swing.*;
import java.io.File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static Connection con = null;
    public Connect(){
        try{
            con= DriverManager.getConnection("jdbc:sqlite:data.sqlite");
            JOptionPane.showMessageDialog(null, "The database is succesfully connected", null, JOptionPane.INFORMATION_MESSAGE);

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }
}
