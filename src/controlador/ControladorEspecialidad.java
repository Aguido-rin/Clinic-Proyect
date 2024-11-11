package controlador;

import estructuras.especialidad.ArregloEspecialidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mensajes.Mensajes;
import modelo.Especialidad;
import persistencia.AlmacenarEspecialidad;
import procesos.ProcesosEspecialidad;
import view.FrmAgregarEspecialidad;

/**
 *
 * @author AguidoRin
 */
public class ControladorEspecialidad implements ActionListener{
    
    FrmAgregarEspecialidad frmEspec;
    ArregloEspecialidad arrEspec;
    int posic;
    
    public ControladorEspecialidad(FrmAgregarEspecialidad frm){
        frmEspec=frm;
        arrEspec=new ArregloEspecialidad(50);
        frmEspec.btnAgregarEspec.addActionListener(this);
        frmEspec.btnModificarEspec.addActionListener(this);
        frmEspec.btnEliminarEspec.addActionListener(this);
        frmEspec.btnLimpiar.addActionListener(this);
        arrEspec = AlmacenarEspecialidad.RecuperarEspecialidad();
        ProcesosEspecialidad.MostrarTabla(frmEspec, arrEspec);
        ProcesosEspecialidad.AbrirIntFrms(frmEspec);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== frmEspec.btnAgregarEspec){
            Especialidad enf = ProcesosEspecialidad.CrearEspecialidad(frmEspec);
            arrEspec.AgregarEspecialidad(enf);
            AlmacenarEspecialidad.GuardarEspecialidad(arrEspec);
            ProcesosEspecialidad.MostrarTabla(frmEspec, arrEspec);
            ProcesosEspecialidad.LimpiarCampos(frmEspec);
            Mensajes.MensajeMostrar("Especialidad Registrada");
        }
        
        if (e.getSource() == frmEspec.btnModificarEspec) {
            if (frmEspec.txtCodEspec.isEditable() && frmEspec.txtTipoEspec.isEditable()) {
                String nuevoId = frmEspec.txtCodEspec.getText();
                String nuevoTipo = frmEspec.txtTipoEspec.getText();
                Especialidad especModf = new Especialidad();
                especModf.setId(nuevoId);
                especModf.setTipo(nuevoTipo);
                arrEspec.EditarEspecialidad(especModf, posic);
                AlmacenarEspecialidad.GuardarEspecialidad(arrEspec);
                ProcesosEspecialidad.MostrarTabla(frmEspec, arrEspec);
                ProcesosEspecialidad.LimpiarCampos(frmEspec);
                frmEspec.txtCodEspec.setEditable(false);
                frmEspec.txtTipoEspec.setEditable(false);
                Mensajes.MensajeMostrar("Especialidad modificada exitosamente");
            } else {
                String EspecModif = frmEspec.txtBuscado.getText();
                posic = arrEspec.Buscar(EspecModif);
                if (posic == -1) {
                    Mensajes.MensajeMostrar("Primero busca la especialidad a Modificar");
                } else {
                    Especialidad enf = arrEspec.ObtenerEspecialidad(posic);
                    frmEspec.txtCodEspec.setText(enf.getId());
                    frmEspec.txtTipoEspec.setText(enf.getTipo());
                    frmEspec.txtCodEspec.setEditable(true);
                    frmEspec.txtTipoEspec.setEditable(true);
                    Mensajes.MensajeMostrar("Modifique y presione 'Modificar' para guardar");
                }
            }
        }
        
        if (e.getSource() == frmEspec.btnEliminarEspec) {
            String EspecElim = Mensajes.MensajeInput("Ingrese código de especialidad");
            posic = arrEspec.Buscar(EspecElim);
            if (posic == -1) {
                Mensajes.MensajeMostrar("Código " + EspecElim + " no existe");
            } else {
                Especialidad espec = arrEspec.ObtenerEspecialidad(posic);
                frmEspec.txtCodEspec.setText(espec.getId());
                frmEspec.txtTipoEspec.setText(espec.getTipo());
                int resp = Mensajes.MensajeConfirmar("Confirmación", "¿Deseas eliminar esta especialidad?");
                //Usa 0 o 1 para ver si dijo q sí o q no el usuario
                if (resp == 0) {
                    arrEspec.EliminarEspecialidad(posic);
                    ProcesosEspecialidad.LimpiarCampos(frmEspec);
                    AlmacenarEspecialidad.GuardarEspecialidad(arrEspec);
                    ProcesosEspecialidad.MostrarTabla(frmEspec, arrEspec);
                    Mensajes.MensajeMostrar("Registro de especialidad eliminado");
                }
            }
        }
        
        if (e.getSource()==frmEspec.btnLimpiar) {
            ProcesosEspecialidad.LimpiarCampos(frmEspec);
        }
        
        if(e.getSource()==frmEspec.btnBuscar){
            String EspecBusc = Mensajes.MensajeInput("Ingrese código de enfermera");
            posic = arrEspec.Buscar(EspecBusc);
            if(posic==-1){
                Mensajes.MensajeMostrar("Codigo "+EspecBusc+" no existe");
            }else{
                Especialidad enf = arrEspec.ObtenerEspecialidad(posic);
                frmEspec.txtCodEspec.setText(enf.getTipo());
                frmEspec.txtTipoEspec.setText(enf.getTipo());
                frmEspec.txtBuscado.requestFocus();
            }
        }
    }
}