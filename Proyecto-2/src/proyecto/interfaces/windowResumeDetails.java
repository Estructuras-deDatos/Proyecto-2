package proyecto.interfaces;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para agregar mostrar los detalles de un resumen selccionado. 
 * @author: beatrizcardozo
 * @version: 22/03/2023
 */
public class windowResumeDetails extends javax.swing.JFrame {

     /**
     * Constructor para la clase windowResumeDetails
     */
    public windowResumeDetails() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
    } //Cierre del constructor


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        summary_keyw = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        summary_authors = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        summary_body = new javax.swing.JTextArea();
        Resumen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        summary_title = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalles de la Investigación Seleccionada");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(43, 47, 181));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Cerrar");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setBorderPainted(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Investigación Seleccionada: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/detailsImage.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 47, 181));
        jLabel5.setText("Autores:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 47, 181));
        jLabel6.setText("Palabras Claves:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jScrollPane.setBorder(null);
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        summary_keyw.setEditable(false);
        summary_keyw.setBackground(new java.awt.Color(255, 255, 255));
        summary_keyw.setColumns(20);
        summary_keyw.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        summary_keyw.setForeground(new java.awt.Color(0, 0, 0));
        summary_keyw.setRows(5);
        summary_keyw.setBorder(null);
        summary_keyw.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        summary_keyw.setSelectionColor(new java.awt.Color(43, 47, 181));
        jScrollPane.setViewportView(summary_keyw);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 290, -1));

        jScrollPane1.setBorder(null);

        summary_authors.setEditable(false);
        summary_authors.setBackground(new java.awt.Color(255, 255, 255));
        summary_authors.setColumns(20);
        summary_authors.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        summary_authors.setForeground(new java.awt.Color(0, 0, 0));
        summary_authors.setRows(5);
        summary_authors.setBorder(null);
        summary_authors.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        summary_authors.setSelectionColor(new java.awt.Color(43, 47, 181));
        jScrollPane1.setViewportView(summary_authors);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, -1));

        jScrollPane3.setBackground(new java.awt.Color(43, 47, 181));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        summary_body.setEditable(false);
        summary_body.setBackground(new java.awt.Color(255, 255, 255));
        summary_body.setColumns(20);
        summary_body.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        summary_body.setForeground(new java.awt.Color(0, 0, 0));
        summary_body.setLineWrap(true);
        summary_body.setRows(5);
        summary_body.setWrapStyleWord(true);
        summary_body.setBorder(null);
        summary_body.setCaretColor(new java.awt.Color(255, 255, 255));
        summary_body.setMargin(new java.awt.Insets(10, 50, 10, 50));
        summary_body.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        summary_body.setSelectionColor(new java.awt.Color(43, 47, 181));
        jScrollPane3.setViewportView(summary_body);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 710, 240));

        Resumen.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        Resumen.setForeground(new java.awt.Color(43, 47, 181));
        Resumen.setText("Resumen");
        jPanel1.add(Resumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        summary_title.setBackground(new java.awt.Color(255, 255, 255));
        summary_title.setColumns(20);
        summary_title.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        summary_title.setForeground(new java.awt.Color(0, 0, 0));
        summary_title.setLineWrap(true);
        summary_title.setRows(5);
        summary_title.setWrapStyleWord(true);
        summary_title.setBorder(null);
        summary_title.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        summary_title.setSelectionColor(new java.awt.Color(43, 47, 181));
        jScrollPane2.setViewportView(summary_title);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 750, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     /**
     * Método invocado cuando el usuario realiza una acción, backButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.hide();

    } //Cierre del método
    //GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(windowResumeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowResumeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowResumeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowResumeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowResumeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Resumen;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextArea summary_authors;
    public static javax.swing.JTextArea summary_body;
    public static javax.swing.JTextArea summary_keyw;
    public static javax.swing.JTextArea summary_title;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
