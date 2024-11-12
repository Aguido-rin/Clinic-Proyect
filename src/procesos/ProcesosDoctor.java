package procesos;

import view.FrmAgregarDoctor;
import modelo.*;
import estructuras.doctor.ListaDoctor;
import javax.swing.table.DefaultTableModel;
import estructuras.doctor.Nodo;

public class ProcesosDoctor {
    
    

    public static void Presentacion(FrmAgregarDoctor fe) {
       fe.setTitle("Registro de doctores");
       fe.setVisible(true);
       fe.cbxEspec.removeAllItems();
       fe.cbxEspec.addItem("Cardiología");
       fe.cbxEspec.addItem("Pediatría");
       fe.cbxEspec.addItem("Ginecología");
       fe.cbxEspec.addItem("Dermatología");
       fe.cbxEspec.addItem("Traumatología");
       fe.cbxEspec.addItem("Neurología");
       fe.cbxEspec.addItem("Psiquiatría");
       fe.cbxEspec.addItem("Oftalmología");
       fe.cbxEspec.addItem("Endocrinología");
       fe.cbxEspec.addItem("Gastroenterología");
   
         
    }

    public static void LimpiarEntradas(FrmAgregarDoctor fe) {
        fe.txtCode.setText("");
        fe.txtDni.setText("");
        fe.txtName.setText("");
        fe.txtTelefono.setText("");
        fe.txtTelefono1.setText("");
        fe.cbxEspec.setSelectedIndex(0);
        fe.txtCode.requestFocus();
    }

    public static void MostrarDoc(FrmAgregarDoctor fe, ListaDoctor lista) {
        String[] titulos = {"Num","Código", "DNI", "Nombre", "Teléfono", "Dirección", "Especialidad"};
        DefaultTableModel mt = new DefaultTableModel(null, titulos);
        fe.jTable1.setModel(mt);
        int num=0;
       for(Nodo aux=lista.getIni();aux!=null; aux = aux.sig){
           num++;
           mt.addRow(aux.doc.Registro(num));
       }    
       
        
    }//fin mostrarest

    public static Doctor LeerDoctor(FrmAgregarDoctor fe) {
        Doctor e = new Doctor();
        e.setCodigo(fe.txtCode.getText());
        e.setDni(fe.txtDni.getText());
        e.setNombres(fe.txtName.getText());
        e.setTelefono(fe.txtTelefono.getText());
        e.setDireccion(fe.txtTelefono1.getText());
        e.setEspecialidad(fe.cbxEspec.getSelectedItem().toString());
        return e;
    }//fin leer
}
