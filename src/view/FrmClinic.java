package view;

import Controller.ContrFrmClinic;

/**
 *
 * @author AguidoRin
 */
public class FrmClinic extends javax.swing.JFrame {

    /**
     * Creates new form FrmClínica
     */
    public FrmClinic() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspClinic = new javax.swing.JDesktopPane();
        mbOptions = new javax.swing.JMenuBar();
        menuPatient = new javax.swing.JMenu();
        mitAddPatient = new javax.swing.JMenuItem();
        mitSearchPatient = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenu();
        mitAddDoctor = new javax.swing.JMenuItem();
        mitSearchDoctor = new javax.swing.JMenuItem();
        menuAttent = new javax.swing.JMenu();
        mitAddAtent = new javax.swing.JMenuItem();
        mitSearchAttent = new javax.swing.JMenuItem();
        menuEspe = new javax.swing.JMenu();
        mitAddEspe = new javax.swing.JMenuItem();
        mitSearchEspec = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 700));

        dspClinic.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout dspClinicLayout = new javax.swing.GroupLayout(dspClinic);
        dspClinic.setLayout(dspClinicLayout);
        dspClinicLayout.setHorizontalGroup(
            dspClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        dspClinicLayout.setVerticalGroup(
            dspClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        mbOptions.setBorder(null);
        mbOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuPatient.setText("Pacientes");

        mitAddPatient.setText("Agregar Paciente");
        mitAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddPatientActionPerformed(evt);
            }
        });
        menuPatient.add(mitAddPatient);

        mitSearchPatient.setText("Buscar Paciente");
        mitSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSearchPatientActionPerformed(evt);
            }
        });
        menuPatient.add(mitSearchPatient);

        mbOptions.add(menuPatient);

        menuDoctor.setText("Médicos");
        menuDoctor.setToolTipText("");

        mitAddDoctor.setText("Agregar Médico");
        mitAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(mitAddDoctor);

        mitSearchDoctor.setText("Buscar Médico");
        mitSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSearchDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(mitSearchDoctor);

        mbOptions.add(menuDoctor);

        menuAttent.setText("Atenciones");

        mitAddAtent.setText("Agregar Atención");
        mitAddAtent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddAtentActionPerformed(evt);
            }
        });
        menuAttent.add(mitAddAtent);

        mitSearchAttent.setText("Buscar Atención");
        mitSearchAttent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSearchAttentActionPerformed(evt);
            }
        });
        menuAttent.add(mitSearchAttent);

        mbOptions.add(menuAttent);

        menuEspe.setText("Especialidades");

        mitAddEspe.setText("Agregar Especialidades");
        mitAddEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddEspeActionPerformed(evt);
            }
        });
        menuEspe.add(mitAddEspe);

        mitSearchEspec.setText("Buscar Especialidad");
        mitSearchEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSearchEspecActionPerformed(evt);
            }
        });
        menuEspe.add(mitSearchEspec);

        mbOptions.add(menuEspe);

        setJMenuBar(mbOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspClinic)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspClinic)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddPatientActionPerformed
        FrmAddPatient f = new FrmAddPatient();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitAddPatientActionPerformed

    private void mitAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddDoctorActionPerformed
        FrmAddDoctor f = new FrmAddDoctor();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitAddDoctorActionPerformed

    private void mitSearchAttentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSearchAttentActionPerformed
        FrmSearchAttent f = new FrmSearchAttent();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitSearchAttentActionPerformed

    private void mitSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSearchPatientActionPerformed
        FrmSearchPatient f = new FrmSearchPatient();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitSearchPatientActionPerformed

    private void mitSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSearchDoctorActionPerformed
        FrmSearchDoctor f = new FrmSearchDoctor();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitSearchDoctorActionPerformed

    private void mitAddAtentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddAtentActionPerformed
        FrmAddAttent f = new FrmAddAttent();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitAddAtentActionPerformed

    private void mitAddEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddEspeActionPerformed
        FrmAddEspec f = new FrmAddEspec();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitAddEspeActionPerformed

    private void mitSearchEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSearchEspecActionPerformed
        FrmSearchEspec f = new FrmSearchEspec();
        dspClinic.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mitSearchEspecActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dspClinic;
    public javax.swing.JMenuBar mbOptions;
    private javax.swing.JMenu menuAttent;
    private javax.swing.JMenu menuDoctor;
    private javax.swing.JMenu menuEspe;
    private javax.swing.JMenu menuPatient;
    public javax.swing.JMenuItem mitAddAtent;
    public javax.swing.JMenuItem mitAddDoctor;
    public javax.swing.JMenuItem mitAddEspe;
    public javax.swing.JMenuItem mitAddPatient;
    public javax.swing.JMenuItem mitSearchAttent;
    public javax.swing.JMenuItem mitSearchDoctor;
    public javax.swing.JMenuItem mitSearchEspec;
    public javax.swing.JMenuItem mitSearchPatient;
    // End of variables declaration//GEN-END:variables
}