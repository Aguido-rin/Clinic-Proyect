package main;
/**
 *
 * @author AguidoRin
 */
import Controller.ContrFrmLogin;
import javax.swing.JFrame;
import view.FrmLogin;

public class MainClass {
    
    
    public static void main(String[] args) {
        FrmLogin frmLog = new FrmLogin();
        ContrFrmLogin as = new ContrFrmLogin(frmLog);
    }
}