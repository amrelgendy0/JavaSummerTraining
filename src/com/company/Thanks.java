/*
 * Created by JFormDesigner on Wed Aug 18 08:34:37 EET 2021
 */

package com.company;

import com.company.model.Drug;
import com.company.model.Order;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Thanks extends JDialog {
    DefaultTableModel tableModel1;
    public Thanks(Window owner, Order order) {
        super(owner);
        this.setVisible(true);
        initComponents();
        textField1.setText(order.getCustomerName());
        textField2.setText(order.getPhoneNumber());
        textField3.setText(order.getAddress());
        tableModel1 = (DefaultTableModel) table1.getModel();
        tableModel1.addColumn("Products", getNames(order));
        tableModel1.addColumn("Quantity", getQuantity(order));
        label9.setText(order.getTotalPrice());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    public Object[] getNames(Order order) {
        ArrayList<String> sddg = new ArrayList<String>();
        for (Drug drug : order.getProductAndQuantity().keySet()) {
            sddg.add(drug.getName());
        }
        return sddg.toArray();
    }

    public Object[] getQuantity(Order order) {
        ArrayList<String> sddg = new ArrayList<String>();
        for (int quantity : order.getProductAndQuantity().values()) {
            sddg.add(String.valueOf(quantity));
        }
        return sddg.toArray();
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void okButtonActionPerformed(ActionEvent e) {

        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - amr elgendy
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        label8 = new JLabel();
        label9 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        label7 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("We Have Received Your Order And Will Be Ready Soon");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5f));

                //---- textField1 ----
                textField1.setEnabled(false);

                //---- label2 ----
                label2.setText("Name");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

                //---- label3 ----
                label3.setText("phone number");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

                //---- textField2 ----
                textField2.setEnabled(false);

                //---- label4 ----
                label4.setText("Address");
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));

                //---- textField3 ----
                textField3.setEnabled(false);

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(table1);
                }

                //---- label8 ----
                label8.setText("Total Price :");
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 11f));

                //---- label9 ----
                label9.setText("0");
                label9.setForeground(Color.blue);
                label9.setFont(label9.getFont().deriveFont(label9.getFont().getStyle() & ~Font.ITALIC, label9.getFont().getSize() + 14f));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label1)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(5, 5, 5)
                                        .addComponent(textField2))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(113, 113, 113)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(5, 5, 5)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane);
        pack();
        setLocationRelativeTo(getOwner());

        //---- label7 ----
        label7.setText("text");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JLabel label8;
    private JLabel label9;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
