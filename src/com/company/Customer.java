package com.company;

import com.company.model.Drug;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Customer extends JFrame {

    DefaultTableModel tableModel1;
    public Customer() {


        initComponents();
        initTables();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Customer);
        this.pack();

        super.setVisible(true);
        super.setLocationRelativeTo(null);
        super.getContentPane().setBackground(Color.white);
//        this.setResizable(false);

    }

    void initTables() {
        tableModel1 = (DefaultTableModel) table1.getModel();
        tableModel1.addColumn("Product");
        tableModel1.addColumn("Quantity");
        tableModel1.addColumn("Price");


        table2.setAutoCreateColumnsFromModel(true);
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        model.setColumnCount(0);
        TableColumn col = new TableColumn(model.getColumnCount());
        col.setHeaderValue("Our Medicine");
        table2.addColumn(col);

        ArrayList<Object> toshow = new ArrayList<Object>();

        for (Drug dd : DataManager.getdrugs()) {
            toshow.add(dd.getName());
        }
        model.addColumn(col.getHeaderValue().toString(), toshow.toArray());

    }

    private void button1ActionPerformed(ActionEvent e) {
        if (table2.getSelectedRow() != -1) {
            Drug selectedDrug = DataManager.getdrugs().get(table2.getSelectedRow());
            for (int i = 0; i < table1.getRowCount(); i++) {
                if (tableModel1.getValueAt(i, 0).equals(selectedDrug.getName())) {
                    System.out.println(table1.getModel().getValueAt(i, 0));
                    tableModel1.setValueAt((int) tableModel1.getValueAt(i, 1) + (int) spinner1.getValue(), i, 1);
                    spinner1.setValue(1);
                    label9.setText(getTotalPrice());

                    return;
                }
            }
            tableModel1.addRow(new Object[]{selectedDrug.getName(), spinner1.getValue(), selectedDrug.getPrice()});
            spinner1.setValue(1);
            label9.setText(getTotalPrice());
        }
    }


    String getTotalPrice() {
        double total = 0;

        for (int i = 0; i < table1.getRowCount(); i++) {
            total += (int) tableModel1.getValueAt(i, 1) * (double) tableModel1.getValueAt(i, 2);
        }

        return String.valueOf(Math.floor(total * 100) / 100);

    }

    private void button2ActionPerformed(ActionEvent e) {
        this.setVisible(false);

        new Thanks(this);


    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - amr elgendy
        Customer = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        spinner1 = new JSpinner();
        label7 = new JLabel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        button1 = new JButton();
        label8 = new JLabel();
        label9 = new JLabel();
        button2 = new JButton();

        //======== Customer ========
        {
            Customer.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
                    EmptyBorder(0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder.CENTER, javax.swing
                    .border.TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), Customer.getBorder()));
            Customer.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062ord\u0065r".equals(e.getPropertyName()))
                        throw new RuntimeException();
                }
            });
            Customer.setLayout(null);

            //---- label1 ----
            label1.setText("Name");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
            Customer.add(label1);
            label1.setBounds(6, 67, 90, 27);

            //---- label2 ----
            label2.setText("phone number");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            Customer.add(label2);
            label2.setBounds(6, 102, label2.getPreferredSize().width, 27);

            //---- label3 ----
            label3.setText("Address");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
            Customer.add(label3);
            label3.setBounds(6, 137, 90, 27);
            Customer.add(textField1);
            textField1.setBounds(130, 69, 310, textField1.getPreferredSize().height);
            Customer.add(textField2);
            textField2.setBounds(130, 104, 310, textField2.getPreferredSize().height);
            Customer.add(textField3);
            textField3.setBounds(130, 139, 310, textField3.getPreferredSize().height);

            //---- label5 ----
            label5.setText("Register Your Data");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 9f));
            label5.setForeground(Color.blue);
            Customer.add(label5);
            label5.setBounds(120, 6, 269, 56);

            //---- label6 ----
            label6.setText("Your Cart");
            label6.setForeground(Color.blue);
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
            Customer.add(label6);
            label6.setBounds(710, 6, 182, 43);

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(table1.getFont().deriveFont(table1.getFont().getSize() + 1f));
                scrollPane1.setViewportView(table1);
            }
            Customer.add(scrollPane1);
            scrollPane1.setBounds(470, 55, 636, scrollPane1.getPreferredSize().height);

            //---- spinner1 ----
            spinner1.setModel(new SpinnerNumberModel(1, null, null, 1));
            Customer.add(spinner1);
            spinner1.setBounds(102, 185, 61, spinner1.getPreferredSize().height);

            //---- label7 ----
            label7.setText("Quantity");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 5f));
            Customer.add(label7);
            label7.setBounds(6, 184, 90, 27);

            //======== scrollPane2 ========
            {

                //---- table2 ----
                table2.setFont(table2.getFont().deriveFont(table2.getFont().getSize() + 1f));
                scrollPane2.setViewportView(table2);
            }
            Customer.add(scrollPane2);
            scrollPane2.setBounds(0, 220, 440, 304);

            //---- button1 ----
            button1.setText("Add to Cart");
            button1.addActionListener(e -> button1ActionPerformed(e));
            Customer.add(button1);
            button1.setBounds(new Rectangle(new Point(178, 535), button1.getPreferredSize()));

            //---- label8 ----
            label8.setText("Total Price :");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 11f));
            Customer.add(label8);
            label8.setBounds(560, 490, 158, 72);

            //---- label9 ----
            label9.setText("0");
            label9.setForeground(Color.blue);
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getStyle() & ~Font.ITALIC, label9.getFont().getSize() + 14f));
            Customer.add(label9);
            label9.setBounds(724, 500, 199, 49);

            //---- button2 ----
            button2.setText("Make Order");
            button2.addActionListener(e -> {
                button2ActionPerformed(e);
                button2ActionPerformed(e);
            });
            Customer.add(button2);
            button2.setBounds(new Rectangle(new Point(420, 565), button2.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for (int i = 0; i < Customer.getComponentCount(); i++) {
                    Rectangle bounds = Customer.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Customer.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Customer.setMinimumSize(preferredSize);
                Customer.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JPanel Customer;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label5;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JSpinner spinner1;
    private JLabel label7;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JButton button1;
    private JLabel label8;
    private JLabel label9;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}