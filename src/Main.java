import com.company.DataManager;
import com.company.LOG_IN;

import java.sql.SQLException;

public class Main {

    public static void main(String args[]) throws SQLException {
        DataManager dataManager = new DataManager();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN().setVisible(true);
            }
        });
    }

}