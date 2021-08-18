package com.company;

import com.company.model.Drug;

import javax.swing.*;
import java.awt.*;

public class DrugView extends javax.swing.JFrame {


    public DrugView() {
        initComponents();

        super.setVisible(true);
        super.setResizable(false);
//              java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Drug().setVisible(true);
//            }
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        pan = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Medicine");
        Container contentPane = getContentPane();

        //======== pan ========
        {
            pan.setForeground(new Color(0, 0, 153));
            pan.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , " ", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,pan. getBorder( )) ); pan. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- jLabel1 ----
            jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
            jLabel1.setForeground(new Color(187, 74, 80));
            jLabel1.setText("Drug Registration");

            //---- jLabel2 ----
            jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel2.setForeground(new Color(0, 0, 0));
            jLabel2.setText("Drug type");

            //---- jLabel3 ----
            jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel3.setForeground(new Color(0, 0, 0));
            jLabel3.setText("Drug name");

            //---- jLabel4 ----
            jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel4.setForeground(new Color(0, 0, 0));
            jLabel4.setText("Price");

            //---- jLabel5 ----
            jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel5.setForeground(new Color(0, 0, 0));
            jLabel5.setText("Shelf no.");

            //---- jLabel6 ----
            jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel6.setForeground(new Color(0, 0, 0));
            jLabel6.setText("Ex.date");

            //---- jLabel7 ----
            jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabel7.setForeground(new Color(0, 0, 0));
            jLabel7.setText("Drug id");

            //---- jTextField1 ----
            jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));

            //---- jTextField4 ----
            jTextField4.addActionListener(e -> jTextField4ActionPerformed(e));

            //---- jTextField5 ----
            jTextField5.addActionListener(e -> jTextField5ActionPerformed(e));

            //---- jButton1 ----
            jButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
            jButton1.setForeground(new Color(0, 0, 153));
            jButton1.setText("Register");
            jButton1.addActionListener(e -> jButton1ActionPerformed(e));

            //---- jButton2 ----
            jButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
            jButton2.setForeground(new Color(0, 0, 153));
            jButton2.setText("Cancel");
            jButton2.addActionListener(e -> jButton2ActionPerformed(e));

            GroupLayout panLayout = new GroupLayout(pan);
            pan.setLayout(panLayout);
            panLayout.setHorizontalGroup(
                panLayout.createParallelGroup()
                    .addGroup(panLayout.createSequentialGroup()
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panLayout.createSequentialGroup()
                                .addGroup(panLayout.createParallelGroup()
                                    .addGroup(panLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(panLayout.createParallelGroup()
                                            .addGroup(panLayout.createSequentialGroup()
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panLayout.createSequentialGroup()
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.LEADING, panLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panLayout.createSequentialGroup()
                                        .addGap(194, 194, 194)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))
                            .addGroup(panLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                    .addGap(90, 90, 90)

                            ))
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
            );
            panLayout.setVerticalGroup(
                panLayout.createParallelGroup()
                    .addGroup(panLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLayout.createParallelGroup()
                            .addGroup(panLayout.createSequentialGroup()
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(panLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(0, 0, 0))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(pan, GroupLayout.Alignment.TRAILING, 450, 450, 450)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(pan, GroupLayout.Alignment.TRAILING, 420, 420, 420)
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Drug drug = new Drug(jTextField6.getText(),Double.parseDouble(jTextField3.getText()),jTextField2.getText(),0,jTextField1.getText());

            DataManager.addDrug(drug);

           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");





    }//EN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variablesG
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JPanel pan;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JButton jButton1;
    private JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
