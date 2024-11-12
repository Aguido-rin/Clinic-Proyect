package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FrmClinica;

/**
 *
 * @author Jorge Flores
 */
public class ControladorClinica implements ActionListener{
    FrmClinica vista;

    public ControladorClinica(FrmClinica frmMenuClinic) {
        vista = frmMenuClinic;
        /*vista.jMenuItem_Pacientes.addActionListener(this);
        vista.jMenuItem_Doctores.addActionListener(this);
        vista.jMenuItem_Especialidad.addActionListener(this);
        vista.jMenuItem_Atencion.addActionListener(this);
        vista.jMenuItem_HistoriaClinica.addActionListener(this);
        vista.jMenuItem_Reportes.addActionListener(this);
        vista.jMenuItem_salir.addActionListener(this);

        //agregamos imagen como fonde de jdesktoppane
        vista.jDpFondo.setBorder(new ImagenFondo());
        if (vista instanceof JFrame) {
            ((JFrame) vista).setExtendedState(JFrame.MAXIMIZED_BOTH);
        }*/
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
