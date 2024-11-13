package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import procesos.ImagenFondo;
import view.FrmAgregarDoctor;
import view.FrmAgregarEspecialidad;
import view.FrmAtencion;
import view.FrmClinica;
import view.FrmDoctor;
import view.FrmHistoriasClinicas;
import view.FrmPaciente;

/**
 *
 * @author Jorge Flores
 */
public class ControladorClinica implements ActionListener {

    FrmClinica vista;

    public ControladorClinica(FrmClinica frmMenuClinic) {
        vista = frmMenuClinic;
        vista.jMenuItem_Pacientes.addActionListener(this);
        vista.jMenuItem_BuscarPaciente.addActionListener(this);
        vista.jMenuItem_Doctores.addActionListener(this);
        vista.jMenuItem_AtencionesMedico.addActionListener(this);
        vista.jMenuItem_Especialidad.addActionListener(this);
        vista.jMenuItem_BuscarAtenciones.addActionListener(this);
        vista.jMenuItem_Atencion.addActionListener(this);
        vista.jMenuItem_HistoriaClinica.addActionListener(this);
        vista.jMenuItem_Reportes.addActionListener(this);
        vista.jMenuItem_salir.addActionListener(this);
        //agregamos imagen como fonde de jdesktoppane
        vista.jDpFondo.setBorder(new ImagenFondo());
        if (vista instanceof JFrame) {
            ((JFrame) vista).setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }

    private void MostrarFrame(JInternalFrame frame) {
        vista.jDpFondo.removeAll();
        vista.jDpFondo.add(frame);
        vista.jDpFondo.repaint();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jMenuItem_Pacientes) {
            FrmPaciente fp = new FrmPaciente();
            MostrarFrame(fp);
            ControlPaciente ce = new ControlPaciente(fp);  
        }

        if (e.getSource() == vista.jMenuItem_Doctores) {
            FrmAgregarDoctor fd=new FrmAgregarDoctor();
            MostrarFrame(fd);
            ControlMedico cm=new ControlMedico(fd);
        }
        if (e.getSource() == vista.jMenuItem_Especialidad) {
            FrmAgregarEspecialidad fe = new FrmAgregarEspecialidad();
            MostrarFrame(fe);
            ControladorEspecialidad es = new ControladorEspecialidad(fe);
        }
        if (e.getSource() == vista.jMenuItem_Atencion) {
            FrmAtencion fa = new FrmAtencion();
            MostrarFrame(fa);

        }
        if (e.getSource() == vista.jMenuItem_HistoriaClinica) {
            FrmHistoriasClinicas fhc = new FrmHistoriasClinicas();
            MostrarFrame(fhc);
        }
        if (e.getSource() == vista.jMenuItem_Reportes) {
            //FrmReportes fr = new FrmReportes();
            //MostrarFrame(fr);
        }
        if (e.getSource() == vista.jMenuItem_salir) {
            this.vista.dispose();
        }
    }

}
