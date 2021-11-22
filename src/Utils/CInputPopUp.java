package Utils;
import javax.swing.*;

public class CInputPopUp {
    public int result;
    public CInputPopUp(JFrame parent, JPanel panel, String title){
        result = JOptionPane.showConfirmDialog(parent,panel, title, JOptionPane.OK_CANCEL_OPTION);
    }
}
