package com.company;

import javax.swing.*;
import java.awt.*;

public class Customer extends JFrame {
    private JPanel Customer;

    public Customer() {
        super("Customer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Customer);
        this.pack();

        super.setVisible(true);
        super.setSize(800, 500);
        super.setLocationRelativeTo(null);
        super.getContentPane().setBackground(Color.white);
//        this.setResizable(false);

    }
}