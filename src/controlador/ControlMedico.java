
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import estructuras.doctor.*;
import procesos.ProcesosDoctor;
import persistencia.*;
import modelo.Doctor;
import mensajes.Mensajes;

import view.FrmAgregarDoctor;

public class ControlMedico implements ActionListener {
  
    FrmAgregarDoctor vista;
    Doctor doc;
    Nodo actual;
    ListaDoctor Lista;

    public ControlMedico(FrmAgregarDoctor fle) {
        vista = fle;
        vista.btnAddPatient2.addActionListener(this);
        vista.btnAddPatient1.addActionListener(this);
        vista.btnAddPatient3.addActionListener(this);
        vista.btnAddPatient4.addActionListener(this);
        vista.btnAddPatient.addActionListener(this);
       
    }

    private void ActualizarFrame() {
        ProcesosDoctor.LimpiarEntradas(vista);
        AlmacenarDoctor.guardarLista(Lista);
        ProcesosDoctor.MostrarDoc(vista, Lista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAddPatient2) {
            doc = procesos.ProcesosDoctor.LeerDoctor(vista);
            Nodo nuevo = new Nodo(doc);
            Lista.AgregarAlFinal(nuevo);
            ActualizarFrame();
        }
        if (e.getSource() == vista.btnAddPatient) {
            String dnibus = Mensajes.MensajeInput("Ingresar dni del doctor a buscar");
            actual = Lista.BuscarPorDni(dnibus);
            if (actual == null) {
                Mensajes.MensajeMostrar("Codigo" + dnibus + "no existe en la lista");
            } else {
                vista.txtCode.setText(actual.doc.getCodigo());
                vista.txtDni.setText(actual.doc.getDni());
                vista.txtName.setText(actual.doc.getNombres());
                vista.txtTelefono.setText(actual.doc.getTelefono());
                vista.txtTelefono1.setText(actual.doc.getDireccion());
                vista.cbxEspec.setSelectedItem(actual.doc.getEspecialidad());
                switch (actual.doc.getEspecialidad()) {
                    case "Cardiología":
                        vista.cbxEspec.setSelectedIndex(0);
                        break;
                    case "Pediatría":
                        vista.cbxEspec.setSelectedIndex(1);
                        break;
                    case "Ginecología":
                        vista.cbxEspec.setSelectedIndex(2);
                        break;
                    case "Dermatología":
                        vista.cbxEspec.setSelectedIndex(3);
                        break;
                    case "Traumatología":
                        vista.cbxEspec.setSelectedIndex(4);
                        break;
                    case "Neurología":
                        vista.cbxEspec.setSelectedIndex(5);
                        break;
                    case "Psiquiatría":
                        vista.cbxEspec.setSelectedIndex(6);
                        break;
                    case "Oftalmología":
                        vista.cbxEspec.setSelectedIndex(7);
                        break;
                    case "Endocrinología":
                        vista.cbxEspec.setSelectedIndex(8);
                        break;
                    case "Gastroenterología":
                        vista.cbxEspec.setSelectedIndex(9);
                        break;    

                }

            }

        }
        if (e.getSource() == vista.btnAddPatient1) {
            doc = ProcesosDoctor.LeerDoctor(vista);
            Lista.ActualizarDoctor(actual, doc);
            this.ActualizarFrame();
        }//fin actualizar

        //eliminación
        if (e.getSource() == vista.btnAddPatient3) {
            int resp = Mensajes.MensajeConfirmar("Alerta!!!",
                    "¿Desea eliminar el nodo?");
            if (resp == 0) {
                Lista.EliminarDoctor(actual);
                this.ActualizarFrame();
            }
        }//fin eliminar
        if (e.getSource()==vista.btnAddPatient4) {
            ProcesosDoctor.LimpiarEntradas(vista);
        }
       
    }

}


