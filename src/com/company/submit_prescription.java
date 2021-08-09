package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import javax.swing.*;

public class submit_prescription extends javax.swing.JFrame {

  
    public submit_prescription() {


        initComponents();

        super.setVisible(true);

//          java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new submit_prescription().setVisible(true);
//            }
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel7 = new JLabel();
        jTextField5 = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submit Prescription");
        var contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jLabel1.setForeground(Color.blue);
        jLabel1.setText("     order prescription");

        //---- jLabel3 ----
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel3.setForeground(new Color(0, 0, 153));
        jLabel3.setText("patient name");

        //---- jLabel4 ----
        jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel4.setForeground(new Color(0, 0, 153));
        jLabel4.setText("Drug name");

        //---- jLabel5 ----
        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel5.setForeground(new Color(0, 0, 153));
        jLabel5.setText("Doctor Name");

        //---- jLabel6 ----
        jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel6.setForeground(new Color(0, 0, 153));
        jLabel6.setText("Drug Type");

        //---- jTextField1 ----
        jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));

        //---- jButton1 ----
        jButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("cancel");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        //---- jButton2 ----
        jButton2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jButton2.setForeground(new Color(0, 0, 204));
        jButton2.setText("submit");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        //---- jLabel7 ----
        jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel7.setForeground(new Color(0, 0, 153));
        jLabel7.setText("quantity");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap(253, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel7;
    private JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
