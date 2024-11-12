package main;
import controlador.ControlMedico;
import view.FrmAgregarDoctor;
public class MainClass {
     public static FrmAgregarDoctor frm;
    public static void main(String[] args) {
       frm= new FrmAgregarDoctor();
       ControlMedico Cle = new ControlMedico(frm);
    }
}

     
    
