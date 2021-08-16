package com.company;

import javax.swing.*;
import java.awt.*;

public class FirstChoice extends JFrame {
    private JPanel FirstChoice;
    private JButton customerButton;
    private JButton adminButton;
    private JButton creditsButton;

    public FirstChoice() {
        super("Pharmacy App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(FirstChoice);
        this.pack();
        customerButton.addActionListener(e -> customerButtonActionPerformed(e));
        adminButton.addActionListener(e -> adminButtonActionPerformed(e));
        creditsButton.addActionListener(e -> showCredits(e));
        super.setVisible(true);
        super.setSize(500, 300);
        super.setLocationRelativeTo(null);
        super.getContentPane().setBackground(Color.white);
//        super.setResizable(false);
    }

    private void showCredits(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        JOptionPane.showMessageDialog(null, textBlocks(), "Made By", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnActionPerformed

    public String textBlocks() {
        String[] names = new String[]{
                "عمرو أحمد محمد حسنين الجندي - جروب ١٠",
                "محمد أيمن أحمد محمد عبدالله - جروب ١٢",
                "ماجدة جمال عبدالمجيد حسين الجبالي - جروب ١١",
                "محمد أمين أحمد العزب شلبي - جروب ١٢",
                "فاطمة خالد عبدالمغني محمد قابيل - جروب ١٠",
        };
        String data = "";
        for (String name : names) {
            data += name + "\n";
        }
        return data;
    }

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DataManager.initDataBase();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN().setVisible(true);
            }
        });
        this.dispose();
    }

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DataManager.initDataBase();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer();
            }
        });
        this.dispose();
    }
}