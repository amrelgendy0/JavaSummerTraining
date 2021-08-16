import com.company.DrugView;
import com.company.LOG_IN;
import com.company.DataManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main2 {
    public static void main(String[] args) {
        JFrame FirstChoiceFrame = new FirstChoice("Pharmacy App");
        FirstChoiceFrame.setVisible(true);
        FirstChoiceFrame.setSize(500, 300);
        FirstChoiceFrame.setLocationRelativeTo(null);
        FirstChoiceFrame.getContentPane().setBackground(Color.white);
    }
}

public class FirstChoice extends JFrame {
    private JPanel FirstChoice;
    private JButton customerButton;
    private JButton adminButton;
    private JButton creditsButton;

    public FirstChoice(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(FirstChoice);
        this.pack();


        // Here
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //Here
        adminButton.addActionListener(e -> adminButtonActionPerformed(e));
        creditsButton.addActionListener(e -> showCredits(e));

    };

    private void showCredits(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed


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


    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DataManager.initDataBase();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN().setVisible(true);
            }
        });
        this.dispose();
    }
}



