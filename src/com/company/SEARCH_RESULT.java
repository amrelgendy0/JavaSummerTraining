package com.company;

import com.company.model.Drug;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;

public class SEARCH_RESULT extends javax.swing.JFrame {
    String[] columnNames = {"Name",
            "Type",
            "Expire date",
            "Price",
            "id"};
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JButton jButton1;
    private JLabel jLabel2;
    private JScrollPane scrollPane1;
    private JTable table1;

    public SEARCH_RESULT() {
        initComponents();
        getSearch();
        super.setVisible(true);
        super.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private void initComponents() {
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Medicine");
        Container contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jLabel1.setForeground(new Color(187, 74, 80));
        jLabel1.setText("      Enter your key");

        //---- jButton1 ----
        jButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("Find");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 36));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("Result");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setEnabled(false);
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 628, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 628, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                                        .addGap(81, 81, 81)
                                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                                        .addGap(146, 146, 146)
                                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(304, 304, 304))
                                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                        .addGap(53, 53, 53)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        getSearch();
    }

    void getSearch() {
        ArrayList<Drug> medicine = DataManager.searchMedicine(jTextField1.getText());
        table1.setAutoCreateColumnsFromModel(true);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        model.setColumnCount(0);


        for (int i = 0; i < columnNames.length; i++) {

            TableColumn col = new TableColumn(model.getColumnCount());
            col.setHeaderValue(columnNames[i]);
            table1.addColumn(col);

            ArrayList<Object> toshow = new ArrayList<Object>();

            for (Drug dd : medicine) {
                switch (i) {
                    case 0: { toshow.add(dd.getName()); break;}
                    case 1: {toshow.add(dd.getType());break;}
                    case 2: {toshow.add(dd.getExpireDate());break;}
                    case 3: {toshow.add(dd.getPrice());break;}
                    case 4: {toshow.add(dd.getId());break;}
                }
            }
            model.addColumn(col.getHeaderValue().toString(), toshow.toArray());

        }
    }
}
