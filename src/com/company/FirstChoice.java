package com.company;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Locale;

public class FirstChoice extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amr elgendy
    private JPanel FirstChoice;
    private JButton adminButton;
    private JButton customerButton;
    private JButton creditsButton;

    public FirstChoice() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(FirstChoice);
        this.pack();
        customerButton.addActionListener(e -> customerButtonActionPerformed(e));
        adminButton.addActionListener(e -> adminButtonActionPerformed(e));
        creditsButton.addActionListener(e -> showCredits(e));
        super.setVisible(true);
        super.setSize(515, 445);
        super.setLocationRelativeTo(null);
        super.getContentPane().setBackground(Color.white);
        super.setResizable(false);
    }

    private void showCredits(ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        JOptionPane.showMessageDialog(null, textBlocks(), "Made By", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnActionPerformed

    public String textBlocks() {
        String[] names = new String[]{
                "عمرو أحمد محمد حسنين الجندي - جروب ١٠",
                "محمد أيمن أحمد محمد عبدالله - جروب ١٢",
                "ماجدة جمال عبدالمجيد حسين الجبالي - جروب ١١",
                "محمد أمين أحمد العزب شلبي - جروب ١٢",
                "فاطمة خالد عبدالمغني محمد قابيل - جروب ١٠",
        };
        String data = "";
        for (String name : names) {
            data += name + "\n";
        }
        return data;
    }

    private void adminButtonActionPerformed(ActionEvent evt) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN();
            }
        });
        this.dispose();
    }

    private void customerButtonActionPerformed(ActionEvent evt) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer();
            }
        });
        this.dispose();
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - amr elgendy
        FirstChoice = new JPanel();
        adminButton = new JButton();
        customerButton = new JButton();
        creditsButton = new JButton();
        var label1 = new JLabel();
        var label2 = new JLabel();

        //======== FirstChoice ========
        {
            FirstChoice.setEnabled(true);
            FirstChoice.setForeground(Color.white);
            FirstChoice.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
                    .border.EmptyBorder(0, 0, 0, 0), "", javax.swing.border.TitledBorder
                    .CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("D\u0069al\u006fg", java.
                    awt.Font.BOLD, 12), java.awt.Color.red), FirstChoice.getBorder()))
            ;
            FirstChoice.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e
                ) {
                    if ("\u0062or\u0064er".equals(e.getPropertyName())) throw new RuntimeException();
                }
            })
            ;

            //---- adminButton ----
            adminButton.setEnabled(true);
            adminButton.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 24));
            adminButton.setForeground(new Color(0, 0, 153));
            adminButton.setHideActionText(false);
            adminButton.setText("Admin");
            adminButton.setToolTipText("Modify pharmacy medicine and patients!");

            //---- customerButton ----
            customerButton.setEnabled(true);
            customerButton.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 24));
            customerButton.setForeground(new Color(0, 0, 153));
            customerButton.setHideActionText(false);
            customerButton.setText("Customer");
            customerButton.setToolTipText("Ready to order, Click here!");

            //---- creditsButton ----
            creditsButton.setEnabled(true);
            creditsButton.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 18));
            creditsButton.setForeground(new Color(3, 102, 214));
            creditsButton.setText("Credits");
            creditsButton.setToolTipText("Summer project team members' name");

            //---- label1 ----
            label1.setEnabled(true);
            label1.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 20));
            label1.setForeground(new Color(187, 74, 80));
            label1.setText("Welcome to pharmacy");

            //---- label2 ----
            label2.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 16));
            label2.setText("Choose option");

            GroupLayout FirstChoiceLayout = new GroupLayout(FirstChoice);
            FirstChoice.setLayout(FirstChoiceLayout);
            FirstChoiceLayout.setHorizontalGroup(
                    FirstChoiceLayout.createParallelGroup()
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(label1))
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(label2))
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(customerButton, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(creditsButton, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
            );
            FirstChoiceLayout.setVerticalGroup(
                    FirstChoiceLayout.createParallelGroup()
                            .addGroup(FirstChoiceLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(label1)
                                    .addGap(5, 5, 5)
                                    .addComponent(label2)
                                    .addGap(5, 5, 5)
                                    .addComponent(customerButton, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(creditsButton))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}