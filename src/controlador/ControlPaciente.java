package controlador;

import estructuras.paciente.ListacPaciente;
import estructuras.paciente.Nodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Paciente;
import persistencia.AlmacenarPaciente;
import procesos.Mensajes;
import procesos.ProcesosPaciente;
import view.FrmPaciente;

public class ControlPaciente implements ActionListener {

    FrmPaciente vista;
    ListacPaciente lista;
    Nodo actual;

    public ControlPaciente(FrmPaciente fp) {
        vista = fp;
        vista.btnAgregar.addActionListener(this);
        vista.btnBuscardni.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        lista = new ListacPaciente();
        lista = AlmacenarPaciente.recuperarLista();
        ProcesosPaciente.presentacion(vista);
        ProcesosPaciente.mostrarPacientes(vista, lista);
    }

    private void actualizarFrame() {
        ProcesosPaciente.limpiarEntradas(vista);
        AlmacenarPaciente.guardarLista(lista);
        ProcesosPaciente.mostrarPacientes(vista, lista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            Paciente pac = ProcesosPaciente.leerPaciente(vista);
            lista.InsertarFinal(pac);
            actualizarFrame();
        }
        if (e.getSource() == vista.btnBuscardni) {
            actual = lista.BuscarDni(vista.txtDnibuscado.toString());
            if (actual == null) {
                Mensajes.mostrar("ERROR dni " + vista.txtDnibuscado.toString() + " no existe en la lista");
            } else {
                vista.txtDni.setText(actual.pac.getDni());
                vista.txtNombres.setText(actual.pac.getNombres());
                vista.txtTelefono.setText(actual.pac.getTelf());
                vista.txtEdad.setText(String.valueOf(actual.pac.getEdad()));
                vista.txtDireccion.setText(actual.pac.getDireccion());
                switch (actual.pac.getGenero()) {
                    case "MASCULINO":
                        vista.cbxGenero.setSelectedIndex(0);
                        break;
                    case "FEMENINO":
                        vista.cbxGenero.setSelectedIndex(1);
                        break;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date fecha = sdf.parse(actual.pac.getFechaNac());
                    vista.jdcFechaNacimiento.setDate(fecha);
                }catch (ParseException ex) {
                    ex.printStackTrace(); //excepción en caso de error de formato
                }
            }
        }
    }
}
