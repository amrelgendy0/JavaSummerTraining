package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

public class menu1 extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new menu1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JLabel jLabel1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton6;
    private JButton se;
    private JButton jButton8;
    private JButton jButton4;

    /**
     * Creates new form menu1
     */
    public menu1() {
        Image myImage = new ImageIcon(this.getClass().getResource("1.jpg")).getImage();
        this.setContentPane(new ImagePanel(myImage));
        initComponents();
        super.setVisible(true);
        super.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton6 = new JButton();
        se = new JButton();
        jButton8 = new JButton();
        jButton4 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 48));
        jLabel1.setForeground(new Color(187, 74, 80));
        jLabel1.setText("              Pharmacy Menu");

        //---- jButton2 ----
        jButton2.setFont(new Font("Tahoma", Font.BOLD, 20));
        jButton2.setText("Add Medicine");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        //---- jButton3 ----
        jButton3.setFont(new Font("Tahoma", Font.BOLD, 20));
        jButton3.setForeground(new Color(0, 0, 153));
        jButton3.setText("Log out");
        jButton3.addActionListener(e -> jButton3ActionPerformed(e));

        //---- jButton6 ----
        jButton6.setFont(new Font("Tahoma", Font.BOLD, 20));
        jButton6.setText("View Patient Info");
        jButton6.addActionListener(e -> jButton6ActionPerformed(e));

        //---- se ----
        se.setFont(new Font("Tahoma", Font.BOLD, 20));
        se.setText("Search Medicine");
        se.addActionListener(e -> seActionPerformed(e));

        //---- jButton8 ----
        jButton8.setFont(new Font("Tahoma", Font.BOLD, 20));
        jButton8.setText("Register Patient");
        jButton8.addActionListener(e -> jButton8ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(se, 790, 790, 790)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                                                .addGap(39, 39, 39))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(jButton8, 780, 780, 780)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                .addComponent(jButton6, 780, 780, 780)
                                                .addContainerGap())
                                        .addComponent(jButton2, 780, 780, 780)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton3, 780, 780, 780)
                                        .addGap(39, 39, 39)))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(se, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- jButton4 ----
        jButton4.setText("jButton1");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new patient_info();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        new SEARCH_RESULT();
    }//GEN-LAST:event_seActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        new patient_registertion();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new LOG_IN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new DrugView();
    }//GEN-LAST:event_jButton2ActionPerformed
    // End of variables declaration//GEN-END:variables
}
