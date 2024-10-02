package Controller;
/**
 *
 * @author AguidoRin
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.FrmClinic;
import view.FrmLogin;

public class ContrFrmLogin implements ActionListener {
    FrmLogin lgnView;
    
    public ContrFrmLogin(FrmLogin frmLog){
        lgnView=frmLog;
        lgnView.btnClose.addActionListener(this);
        lgnView.btnLogin.addActionListener(this);
        lgnView.setTitle("Ingreso al sistema");
        lgnView.setVisible(true);
        lgnView.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(lgnView.btnLogin == e.getSource()){
            String usu = lgnView.txtUser.getText();
            FrmClinic fm =  new FrmClinic();
            ContrFrmLogin cm = new ContrFrmLogin(lgnView);
            fm.setVisible(true);
            fm.setTitle(usu.toUpperCase()+" : Aplicación del curso de Estructura de datos");
            fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            lgnView.setVisible(false);
        }
        if (lgnView.btnClose==e.getSource()) {
            lgnView.dispose();
        }
    }
    
}