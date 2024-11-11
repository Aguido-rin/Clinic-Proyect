package procesos;

import estructuras.especialidad.ArregloEspecialidad;
import javax.swing.table.DefaultTableModel;
import modelo.Especialidad;
import view.FrmAgregarEspecialidad;

/**
 *
 * @author AguidoRin
 */
public class ProcesosEspecialidad {
    public static void AbrirIntFrms(FrmAgregarEspecialidad frm){
        frm.setTitle("Registro Especialidades");
        frm.txtCodEspec.requestFocus();
        frm.setVisible(true);
    }
    
    public static void LimpiarCampos(FrmAgregarEspecialidad fe){
        fe.txtCodEspec.setText("");
        fe.txtTipoEspec.setText("");
        fe.txtBuscado.setText("");
        fe.txtCodEspec.requestFocus();
    }
    
    public static Especialidad CrearEspecialidad(FrmAgregarEspecialidad frm){
        Especialidad espec = new Especialidad();
        espec.setId(frm.txtCodEspec.getText());
        espec.setTipo(frm.txtTipoEspec.getText());
        return espec;
    }
    
    public static void MostrarTabla(FrmAgregarEspecialidad frm,ArregloEspecialidad listEspec){
        String titulos[]={"Número","Codigo","Especialidad"};
        DefaultTableModel mt =  new DefaultTableModel(null,titulos);
        frm.tblEspec.setModel(mt);
        for(int pos=0;pos<ArregloEspecialidad.cant;pos++){
            mt.addRow(listEspec.ObtenerEspecialidad(pos).Registrar(pos+1));
        }
    }
}