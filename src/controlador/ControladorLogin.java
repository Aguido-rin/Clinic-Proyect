package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.FrmClinica;
import view.FrmLogin;

/**
 *
 * @author Jorge Flores
 */
public class ControladorLogin implements ActionListener{
        FrmLogin vista;
    public ControladorLogin(FrmLogin flog){
        vista = flog;
        vista.btnLogin.addActionListener(this);
        vista.setTitle("Ingreso al Sistema");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.btnLogin) {
             String usu = vista.txtUser.getText();
             FrmClinica fm =  new FrmClinica();//formulario menu
            ControladorClinica cm = new ControladorClinica(fm);
            fm.setVisible(true);
            fm.setTitle(usu.toUpperCase()+" : Aplicación del curso de Estructura de datos");
            fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vista.setVisible(false);
        }
    }
}
