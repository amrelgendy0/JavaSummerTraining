package com.company;

import com.company.model.Drug;
import com.company.model.Order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends JFrame {
    HashMap<Drug,Integer> userCart = new HashMap<Drug, Integer>();

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
userCart.clear();
        for (int i = 0; i < table1.getRowCount(); i++) {
            total += (int) tableModel1.getValueAt(i, 1) * (double) tableModel1.getValueAt(i, 2);
            userCart.put(DataManager.searchMedicine((String) tableModel1.getValueAt(i, 0)).get(0), (int) tableModel1.getValueAt(i, 1));


        }

        return String.valueOf(Math.floor(total * 100) / 100);

    }

    private void button2ActionPerformed(ActionEvent e) {
        this.setVisible(false);
        new Thanks(this, new Order(textField1.getText(),textField2.getText(),textField3.getText(),getTotalPrice(),userCart));


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
            Customer.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,Customer. getBorder( )) ); Customer. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );

            //---- label1 ----
            label1.setText("Name");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

            //---- label2 ----
            label2.setText("phone number");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

            //---- label3 ----
            label3.setText("Address");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

            //---- label5 ----
            label5.setText("Register Your Data");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 9f));
            label5.setForeground(Color.blue);

            //---- label6 ----
            label6.setText("Your Cart");
            label6.setForeground(Color.blue);
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(table1.getFont().deriveFont(table1.getFont().getSize() + 1f));
                scrollPane1.setViewportView(table1);
            }

            //---- spinner1 ----
            spinner1.setModel(new SpinnerNumberModel(1, null, null, 1));

            //---- label7 ----
            label7.setText("Quantity");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 5f));

            //======== scrollPane2 ========
            {

                //---- table2 ----
                table2.setFont(table2.getFont().deriveFont(table2.getFont().getSize() + 1f));
                scrollPane2.setViewportView(table2);
            }

            //---- button1 ----
            button1.setText("Add to Cart");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- label8 ----
            label8.setText("Total Price :");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 11f));

            //---- label9 ----
            label9.setText("0");
            label9.setForeground(Color.blue);
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getStyle() & ~Font.ITALIC, label9.getFont().getSize() + 14f));

            //---- button2 ----
            button2.setText("Make Order");
            button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});

            GroupLayout CustomerLayout = new GroupLayout(Customer);
            Customer.setLayout(CustomerLayout);
            CustomerLayout.setHorizontalGroup(
                CustomerLayout.createParallelGroup()
                    .addGroup(CustomerLayout.createSequentialGroup()
                        .addGroup(CustomerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(CustomerLayout.createSequentialGroup()
                                .addGroup(CustomerLayout.createParallelGroup()
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(button1)))
                                .addGap(25, 25, 25))
                            .addGroup(GroupLayout.Alignment.TRAILING, CustomerLayout.createSequentialGroup()
                                .addGroup(CustomerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(CustomerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(GroupLayout.Alignment.LEADING, CustomerLayout.createSequentialGroup()
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(CustomerLayout.createSequentialGroup()
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)))
                        .addGroup(CustomerLayout.createParallelGroup()
                            .addGroup(CustomerLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
                            .addGroup(CustomerLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CustomerLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(button2))
            );
            CustomerLayout.setVerticalGroup(
                CustomerLayout.createParallelGroup()
                    .addGroup(CustomerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(CustomerLayout.createParallelGroup()
                            .addGroup(CustomerLayout.createSequentialGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addGroup(CustomerLayout.createParallelGroup()
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(GroupLayout.Alignment.TRAILING, CustomerLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(CustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(CustomerLayout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addGroup(CustomerLayout.createParallelGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(button1))
                            .addGroup(CustomerLayout.createSequentialGroup()
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(CustomerLayout.createParallelGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CustomerLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))))
                        .addGap(3, 3, 3)
                        .addComponent(button2))
            );
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