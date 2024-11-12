package main;

import controlador.ControladorLogin;
import view.FrmLogin;

public class MainClass {
    public static FrmLogin frmlog;
    public static void main(String[] args) {
        frmlog = new FrmLogin();
        ControladorLogin contlog = new ControladorLogin(frmlog);
    }
}