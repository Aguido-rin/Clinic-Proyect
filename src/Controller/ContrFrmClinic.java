package Controller;
/**
 *
 * @author AguidoRin
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import view.FrmAddAttent;
import view.FrmAddDoctor;
import view.FrmAddEspec;
import view.FrmAddPatient;
import view.FrmClinic;
import view.FrmSearchAttent;
import view.FrmSearchDoctor;
import view.FrmSearchEspec;
import view.FrmSearchPatient;

public class ContrFrmClinic implements ActionListener{
    FrmClinic vista;
    public ContrFrmClinic(FrmClinic frmClinic){
        vista=frmClinic;
        vista.mitAddAtent.addActionListener(this);
        vista.mitAddDoctor.addActionListener(this);
        vista.mitAddEspe.addActionListener(this);
        vista.mitAddPatient.addActionListener(this);
        vista.mitSearchDoctor.addActionListener(this);
        vista.mitSearchAttent.addActionListener(this);
        vista.mitSearchEspec.addActionListener(this);
        vista.mitSearchPatient.addActionListener(this);
    }
    
    private void ShowFrame(JInternalFrame frame){
        vista.dspClinic.add(frame);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== vista.mitAddAtent){
          FrmAddAttent f =  new FrmAddAttent();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitAddDoctor){
          FrmAddDoctor f =  new FrmAddDoctor();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitAddEspe){
          FrmAddEspec f =  new FrmAddEspec();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitAddPatient){
          FrmAddPatient f =  new FrmAddPatient();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitSearchAttent){
          FrmSearchAttent f =  new FrmSearchAttent();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitSearchDoctor){
          FrmSearchDoctor f =  new FrmSearchDoctor();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitSearchEspec){
          FrmSearchEspec f =  new FrmSearchEspec();
          ShowFrame(f);
      }
      if(e.getSource()== vista.mitSearchPatient){
          FrmSearchPatient f =  new FrmSearchPatient();
          ShowFrame(f);
      }
    }
}