import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main3 {
    public static void main(String[] args) {
        JFrame CustomerFrame = new Customer("Customer");
        CustomerFrame.setVisible(true);
        CustomerFrame.setSize(800, 500);
        CustomerFrame.setLocationRelativeTo(null);
        CustomerFrame.getContentPane().setBackground(Color.white);
    }
}


public class Customer extends JFrame {


    private JPanel Customer;

    public Customer (String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Customer);
        this.pack();
}}
