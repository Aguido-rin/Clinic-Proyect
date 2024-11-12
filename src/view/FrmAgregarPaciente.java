package view;

/**
 *
 * @author AguidoRin
 */
public class FrmAgregarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEstudiante
     */
    public FrmAgregarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cbxGénero = new javax.swing.JComboBox<>();
        btnAddPatient = new javax.swing.JButton();
        txtTelefono1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnAddPatient1 = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        btnAddPatient2 = new javax.swing.JButton();
        btnAddPatient3 = new javax.swing.JButton();
        btnAddPatient4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDni1 = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDni.setBackground(new java.awt.Color(204, 255, 255));
        txtDni.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dni buscado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 240, -1));

        txtNombres.setBackground(new java.awt.Color(204, 255, 255));
        txtNombres.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 40));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pacientes");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 0, 14))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 235, 42));

        txtTelefono.setBackground(new java.awt.Color(204, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, -1));

        cbxGénero.setBackground(new java.awt.Color(204, 255, 255));
        cbxGénero.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        cbxGénero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cbxGénero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        cbxGénero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGéneroActionPerformed(evt);
            }
        });
        jPanel1.add(cbxGénero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 40));

        btnAddPatient.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPatient.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPatient.setText("BUSCAR");
        jPanel1.add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 170, 40));

        txtTelefono1.setBackground(new java.awt.Color(204, 255, 255));
        txtTelefono1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txtTelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        jPanel1.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 40));

        jDateChooser1.setBackground(new java.awt.Color(204, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 240, 50));

        btnAddPatient1.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPatient1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPatient1.setText("MODIFICAR");
        jPanel1.add(btnAddPatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 150, 30));

        txtAge.setBackground(new java.awt.Color(204, 255, 255));
        txtAge.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtAge.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 238, -1));

        btnAddPatient2.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPatient2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPatient2.setText("AGREGAR");
        jPanel1.add(btnAddPatient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 150, 30));

        btnAddPatient3.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPatient3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPatient3.setText("ELIMINAR");
        jPanel1.add(btnAddPatient3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 150, 30));

        btnAddPatient4.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPatient4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPatient4.setText("LIMPIAR");
        jPanel1.add(btnAddPatient4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 830, 500));

        txtDni1.setBackground(new java.awt.Color(204, 255, 255));
        txtDni1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txtDni1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dni", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12))); // NOI18N
        jPanel1.add(txtDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxGéneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGéneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGéneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddPatient;
    public javax.swing.JButton btnAddPatient1;
    public javax.swing.JButton btnAddPatient2;
    public javax.swing.JButton btnAddPatient3;
    public javax.swing.JButton btnAddPatient4;
    public javax.swing.JComboBox<String> cbxGénero;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtDni1;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}