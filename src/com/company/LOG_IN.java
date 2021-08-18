package com.company;
import com.company.model.User;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.swing.LayoutStyle;


public class LOG_IN extends javax.swing.JFrame {


    private Map<String, String> loginData = new HashMap<String, String>();


    public boolean is_member() {


        if (loginData.containsKey(getUsername())) {
            return Objects.equals(loginData.get(getUsername()), getPassword());


        } else return false;


    }

    private void tfpActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void tfuActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    public LOG_IN() {
        Image myImage = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("1.jpg"))).getImage();
        this.setContentPane(new ImagePanel(myImage));
        initComponents();

        for (User user: DataManager.users()
             ) {
            if(user.isAdmin()){
                loginData.put(user.getUsername(),user.getPassword());

            }
        }
        tfp.setText("");
        super.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        tfp = new JPasswordField();
        tfu = new JTextField();
        can = new JButton();
        btn = new JButton();
//        btn2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 153, 153));
        setForeground(new Color(0, 204, 255));
        Container contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jLabel1.setForeground(new Color(187, 74, 80));
        jLabel1.setText("Welcome to our pharmacy system");

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel2.setForeground(new Color(0,0,153));
        jLabel2.setText("Password");

        //---- jLabel3 ----
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel3.setForeground(new Color(0,0,153));
        jLabel3.setText("User name");

        //---- tfp ----
        tfp.setText("jPasswordField1");
        tfp.addActionListener(e -> tfpActionPerformed(e));

        //---- tfu ----
        tfu.addActionListener(e -> tfuActionPerformed(e));

        //---- can ----
        can.setFont(new Font("Tahoma", Font.BOLD, 18));
        can.setForeground(new Color(0, 0, 153));
        can.setText("Cancel");
        can.addActionListener(e -> canActionPerformed(e));

        //---- btn ----
        btn.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn.setForeground(new Color(0, 0, 153));
        btn.setText("Log in");
        btn.addActionListener(e -> btnActionPerformed(e));

        //---- btn2 ----
//        btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
//        btn2.setForeground(new Color(0, 0, 153));
//        btn2.setText("Credits");
//        btn2.addActionListener(e -> showCredits(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addGap(0, 110, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tfp, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tfu, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(114, 114, 114)
                                                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                .addGap(155, 155, 155)
                                                .addComponent(can, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(270, 270, 270)
//                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(135, Short.MAX_VALUE))
        )));
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfp, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(can, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
//                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        // TODO add your handling code here:
        new FirstChoice();
        this.dispose();
    }//GEN-LAST:event_canActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

        if (is_member()) {
            this.dispose();
            new menu1();
        } else
            JOptionPane.showMessageDialog(null, "User Id or Password may be wrong. Please Try Again!", "Message", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btnActionPerformed

//    private void showCredits(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
//
//
//        JOptionPane.showMessageDialog(null, textBlocks(), "Made By", JOptionPane.WARNING_MESSAGE);
//
//    }//GEN-LAST:event_btnActionPerformed
//
//    public String textBlocks() {
//        String[] names = new String[]{
//                "عمرو أحمد محمد حسنين الجندي - جروب ١٠",
//                "محمد أيمن أحمد محمد عبدالله - جروب ١٢",
//                "ماجدة جمال عبدالمجيد حسين الجبالي - جروب ١١",
//                "محمد أمين أحمد العزب شلبي - جروب ١٢",
//                "فاطمة خالد عبدالمغني محمد قابيل - جروب ١٠",
//        };
//        String data = "";
//        for (String name : names) {
//            data += name + "\n";
//        }
//        return data;
//    }

//
//    private void tfuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_tfuActionPerformed
//
//    private void tfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_tfpActionPerformed
//


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField tfp;
    private JTextField tfu;
    private JButton can;
    private JButton btn;
    private JButton btn2;

    // End of variables declaration//GEN-END:variables
    public String getUsername() {
        return tfu.getText();
    }

    public String getPassword() {
        return tfp.getText();
    }

}
