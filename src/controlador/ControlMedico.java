
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import estructuras.doctor.*;
import procesos.ProcesosDoctor;
import persistencia.*;
import modelo.Doctor;
import mensajes.Mensajes;
import procesos.ProcesosPaciente;

import view.FrmAgregarDoctor;

public class ControlMedico implements ActionListener {
  
    FrmAgregarDoctor vista;
    Doctor doc;
    Nodo actual;
    ListaDoctor Lista;
    
    public ControlMedico(FrmAgregarDoctor fle) {
        vista = fle;
        vista.btn_añadir.addActionListener(this);
        vista.btn_modificar.addActionListener(this);
        vista.btn_eliminar.addActionListener(this);
        vista.btn_limpiar.addActionListener(this);
        vista.btn_buscar.addActionListener(this);
        Lista=AlmacenarDoctor.recuperarLista();
        ProcesosDoctor.Presentacion(fle);
        ProcesosDoctor.MostrarDoc(fle, Lista);
    }

    private void ActualizarFrame() {
        ProcesosDoctor.LimpiarEntradas(vista);
        AlmacenarDoctor.guardarLista(Lista);
        ProcesosDoctor.MostrarDoc(vista, Lista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_añadir) {
            doc = procesos.ProcesosDoctor.LeerDoctor(vista);
            Nodo nuevo = new Nodo(doc);
            Lista.AgregarAlFinal(nuevo);
            ActualizarFrame();
        }
        if (e.getSource() == vista.btn_buscar) {
            String dnibus = Mensajes.MensajeInput("Ingresar dni del doctor a buscar");
            actual = Lista.BuscarPorDni(dnibus);
            if (actual == null) {
                Mensajes.MensajeMostrar("Codigo" + dnibus + "no existe en la lista");
            } else {
                Doctor aux=ProcesosDoctor.LeerDoctor(vista);
                Lista.AgregarAlInicio(new Nodo(aux));
            }
        }
        if (e.getSource() == vista.btn_modificar) {
            doc = ProcesosDoctor.LeerDoctor(vista);
            Lista.ActualizarDoctor(actual, doc);
            this.ActualizarFrame();
        }//fin actualizar

        //eliminación
        if (e.getSource() == vista.btn_eliminar) {
            int resp = Mensajes.MensajeConfirmar("Alerta!!!",
                    "¿Desea eliminar el nodo?");
            if (resp == 0) {
                Lista.EliminarDoctor(actual);
                this.ActualizarFrame();
            }
        }//fin eliminar
        if (e.getSource()==vista.btn_limpiar) {
            ProcesosDoctor.LimpiarEntradas(vista);
        }  
    }
}


