package procesos;

import estructuras.paciente.ListacPaciente;
import estructuras.paciente.Nodo;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import view.FrmPaciente;

public class ProcesosPaciente {

    public static void presentacion(FrmPaciente fp) {
        fp.setTitle("Registro de Pacientes...");
        fp.setVisible(true);
        fp.cbxGénero.removeAllItems();
        fp.cbxGénero.addItem("MASCULINO");
        fp.cbxGénero.addItem("FEMENINO");
        fp.jdcFechaNacimiento.removeAll();
    }

    public static void limpiarEntradas(FrmPaciente fp) {
        fp.txtDni.setText("");
        fp.txtDireccion.setText("");
        fp.txtDnibuscado.setText("");
        fp.txtEdad.setText("");
        fp.txtNombres.setText("");
        fp.txtTelefono.setText("");
        fp.jdcFechaNacimiento.setDate(null);
        fp.cbxGénero.setSelectedIndex(0);
        fp.txtDni.requestFocus();
    }
    
    public static Paciente leerPaciente(FrmPaciente fp){
        Paciente pac = new Paciente();
        pac.setDni(fp.txtDni.getText());
        pac.setNombres(fp.txtNombres.getText());
        pac.setTelf(fp.txtTelefono.getText());
        pac.setEdad(Integer.parseInt(fp.txtEdad.getText()));
        pac.setDireccion(fp.txtDireccion.getText());
        pac.setGenero(fp.cbxGénero.getSelectedItem().toString());
        
        //verificacion de fecha Nac.
        if(fp.jdcFechaNacimiento.getDate() != null){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            pac.setFechaNac(sdf.format(fp.jdcFechaNacimiento.getDate()));
        }else{
            pac.setFechaNac("");
        }
        return pac;
    }

    public static void mostrarPacientes(FrmPaciente fp, ListacPaciente lista) {
        String[] titulos = {"Nro", "Dni", "Nombres", "Telefono", "Edad", "Direccion", "Genero", "Fecha Nac."};
        DefaultTableModel dm = new DefaultTableModel(null, titulos);
        fp.tblDatosPaciente.setModel(dm);
        int num = 0;

        if (lista.lc != null) {
            Nodo aux = lista.lc;
            do {
                num++;
                dm.addRow(aux.pac.Registro(num));
                aux = aux.enlace;
            } while (aux != lista.lc.enlace);
        }

    }

}
