import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main2 {
    public static void main(String[] args) {
        JFrame j = new FirstChoice("Select option");
        j.setVisible(true);
        j.setSize(300, 300);
        j.setLocationRelativeTo(null);
        j.getContentPane().setBackground(Color.white);
    }
}
public class FirstChoice extends JFrame {
    private JPanel FirstChoice;
    private JButton customerButton;
    private JButton adminButton;
    public FirstChoice (String title) {
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
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }


}
