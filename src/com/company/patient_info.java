package com.company;

import com.company.model.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class patient_info extends javax.swing.JFrame {
    ArrayList<Patient> patients = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JButton jButton1;
    private JScrollPane scrollPane1;
    private JTable table1;

    public patient_info() {
        Image myImage = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
        this.setContentPane(new ImagePanel(myImage));
        initComponents();
        patients = DataManager.getPathient();

        table1.setAutoCreateColumnsFromModel(true);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setColumnCount(0);
        for (int i = 0; i < 1; i++) {
            TableColumn col = new TableColumn(model.getColumnCount());
            col.setHeaderValue("Patient Full Name");
            table1.addColumn(col);
            ArrayList<Object> toshow = new ArrayList<Object>();

            assert patients != null;
            for (Patient dd : patients) {
                toshow.add(dd.getFirstname() + " " + dd.getLastname());
            }
            model.addColumn(col.getHeaderValue().toString(), toshow.toArray());
        }

        super.setVisible(true);
        super.setResizable(false);
    }

    private void table1MouseClicked(MouseEvent e) {
        JTable source = (JTable) e.getSource();
        int row = source.rowAtPoint(e.getPoint());
        int column = source.columnAtPoint(e.getPoint());
        String s = source.getModel().getValueAt(row, column) + "";
        Patient p = DataManager.getPathent(s);
        assert p != null;
        jTextField3.setText(p.getFirstname());
        jTextField5.setText(p.getLastname());
        jTextField2.setText(String.valueOf((int) p.getAge()));
        jTextField1.setText(p.getPrescribeMedicine());
        jTextField7.setText(p.getAddress());
        jTextField4.setText(p.getDoctor());
        jTextField6.setText(p.getDate());
    }

    private void scrollPane1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jButton1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Patient Info");
        Container contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(187, 74, 80));
        jLabel1.setText("         Patient information");

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2.setText("First name");

        //---- jLabel3 ----
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3.setText("Age");

        //---- jLabel4 ----
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setText("Last name");

        //---- jLabel5 ----
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel5.setText("Prescribe medicine");

        //---- jLabel6 ----
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel6.setText("Doctor");

        //---- jLabel7 ----
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel7.setText("Address");

        //---- jLabel8 ----
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel8.setText("Date");

        //---- jTextField1 ----
        jTextField1.setEnabled(false);
        jTextField1.setDisabledTextColor(new Color(0, 0, 0));
        jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));

        //---- jTextField2 ----
        jTextField2.setDisabledTextColor(new Color(0, 0, 0));
        jTextField2.setEnabled(false);

        //---- jTextField3 ----
        jTextField3.setDisabledTextColor(new Color(0, 0, 0));
        jTextField3.setEnabled(false);

        //---- jTextField4 ----
        jTextField4.setEnabled(false);
        jTextField4.setDisabledTextColor(new Color(0, 0, 0));
        jTextField4.addActionListener(e -> jTextField4ActionPerformed(e));

        //---- jTextField5 ----
        jTextField5.setEnabled(false);
        jTextField5.setDisabledTextColor(new Color(0, 0, 0));
        jTextField5.addActionListener(e -> jTextField5ActionPerformed(e));

        //---- jTextField6 ----
        jTextField6.setDisabledTextColor(new Color(0, 0, 0));
        jTextField6.setEnabled(false);

        //---- jTextField7 ----
        jTextField7.setDisabledTextColor(new Color(0, 0, 0));
        jTextField7.setEnabled(false);

        //---- jButton1 ----
        jButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("Exit");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    table1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(130, 130, 130)
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 50, 50))))
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
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    // End of variables declaration//GEN-END:variables
}
