package view;

/**
 *
 * @author AguidoRin
 */
public class FrmAtencionEspecialidad extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEstudiante
     */
    public FrmAtencionEspecialidad() {
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
        jLabel1 = new javax.swing.JLabel();
        btnSearchPatient = new javax.swing.JButton();
        txtSearchCode = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Especialidad");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 0, 14))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 215, -1));

        btnSearchPatient.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchPatient.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnSearchPatient.setText("BUSCAR");
        jPanel1.add(btnSearchPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 150, 40));

        txtSearchCode.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchCode.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Código Especialidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        txtSearchCode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 140, 40));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha fin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, 40));

        jDateChooser2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 40));

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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 890, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSearchPatient;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtSearchCode;
    // End of variables declaration//GEN-END:variables
}
