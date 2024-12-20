package view;

/**
 *
 * @author AguidoRin
 */
public class FrmHistoriasClinicas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEstudiante
     */
    public FrmHistoriasClinicas() {
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
        txtSearchName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnPrintPdf = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historias Clínicas");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 0, 14))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 215, -1));

        btnSearchPatient.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchPatient.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnSearchPatient.setText("BUSCAR");
        jPanel1.add(btnSearchPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 27, 150, -1));

        txtSearchName.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearchName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dni del paciente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        txtSearchName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 180, 42));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de historias clínicas del paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 810, 480));

        btnPrintPdf.setBackground(new java.awt.Color(0, 153, 153));
        btnPrintPdf.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnPrintPdf.setText("IMPRIMIR HISTORIA CLÍNICA PDF");
        jPanel1.add(btnPrintPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPrintPdf;
    public javax.swing.JButton btnSearchPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField txtSearchName;
    // End of variables declaration//GEN-END:variables
}
