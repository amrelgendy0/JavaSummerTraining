package com.company;

import java.awt.*;
import javax.swing.*;

public class patient_registertion extends javax.swing.JFrame {
    public patient_registertion() {
        Image myImage = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
        this.setContentPane(new ImagePanel(myImage));
        initComponents();
        super.setVisible(true);
//          java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new patient_registertion().setVisible(true);
//            }
//        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();
        jTextField3 = new JTextField();
        jLabel5 = new JLabel();
        jTextField4 = new JTextField();
        jLabel6 = new JLabel();
        jTextField5 = new JTextField();
        jLabel8 = new JLabel();
        jTextField6 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel9 = new JLabel();
        jTextField7 = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(255, 51, 51));
        setForeground(new Color(51, 255, 51));
        setTitle("Register Patient");
        var contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(0, 153, 0));
        jLabel1.setText("          patient registertion form");

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2.setForeground(new Color(0, 153, 0));
        jLabel2.setText("first name");

        //---- jTextField1 ----
        jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));

        //---- jLabel3 ----
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3.setForeground(new Color(0, 153, 0));
        jLabel3.setText("last name");

        //---- jTextField2 ----
        jTextField2.addActionListener(e -> jTextField2ActionPerformed(e));

        //---- jLabel4 ----
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setForeground(new Color(0, 153, 0));
        jLabel4.setText("Age");

        //---- jLabel5 ----
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel5.setForeground(new Color(0, 153, 0));
        jLabel5.setText("prescribe medicne");

        //---- jTextField4 ----
        jTextField4.addActionListener(e -> jTextField4ActionPerformed(e));

        //---- jLabel6 ----
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel6.setForeground(new Color(0, 153, 0));
        jLabel6.setText("Address");

        //---- jTextField5 ----
        jTextField5.addActionListener(e -> jTextField5ActionPerformed(e));

        //---- jLabel8 ----
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel8.setForeground(new Color(0, 153, 0));
        jLabel8.setText("Doctor");

        //---- jTextField6 ----
        jTextField6.addActionListener(e -> jTextField6ActionPerformed(e));

        //---- jButton1 ----
        jButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jButton1.setForeground(new Color(0, 153, 0));
        jButton1.setText("cancel");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        //---- jButton2 ----
        jButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jButton2.setForeground(new Color(0, 153, 0));
        jButton2.setText("Register");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        //---- jLabel9 ----
        jLabel9.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel9.setForeground(new Color(0, 153, 0));
        jLabel9.setText("Date");

        //---- jTextField7 ----
        jTextField7.addActionListener(e -> jTextField7ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(377, Short.MAX_VALUE)))
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(563, Short.MAX_VALUE)))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                    .addGap(129, 129, 129))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(53, 53, 53)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(49, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addContainerGap(427, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(16, 16, 16)))
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addContainerGap(292, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(162, 162, 162)))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabel3)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                    .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .addGap(58, 58, 58)
                    .addComponent(jButton1)
                    .addGap(20, 20, 20))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
       
    }//GEN-LAST:event_jTextField7ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField jTextField1;
    private JLabel jLabel3;
    private JTextField jTextField2;
    private JLabel jLabel4;
    private JTextField jTextField3;
    private JLabel jLabel5;
    private JTextField jTextField4;
    private JLabel jLabel6;
    private JTextField jTextField5;
    private JLabel jLabel8;
    private JTextField jTextField6;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel9;
    private JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
