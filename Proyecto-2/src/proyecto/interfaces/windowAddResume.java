package proyecto.interfaces;
import java.io.File;
import proyecto.Summary;
import proyecto.searchByAuthor;
import proyecto.searchByKey;
import proyecto.uploadSummary;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para agregar resumenes al programa. 
 * @author: beatrizcardozo
 * @version: 22/03/2023
 */
public class windowAddResume extends javax.swing.JFrame {

    public static File file;
    public static Summary sum;
    public static boolean valid;
    
    /**
     * Constructor para la clase windowAddResume
     */
    public windowAddResume() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        uploadSummary.hide();
        summary_authors.setText("");
        summary_keyw.setText("");
    } //Cierre del constructor


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        attachSummary = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        fail_message = new javax.swing.JLabel();
        confirm_message = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        summary_title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Resumen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        summary_keyw = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        summary_body = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        summary_authors = new javax.swing.JTextArea();
        confirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(153, 0, 0));
        exitButton.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("X");
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        backButton.setBackground(new java.awt.Color(43, 47, 181));
        backButton.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Regresar");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/addResume.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 580, -1));

        attachSummary.setBackground(new java.awt.Color(43, 47, 181));
        attachSummary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        attachSummary.setForeground(new java.awt.Color(255, 255, 255));
        attachSummary.setText("Adjuntar");
        attachSummary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        attachSummary.setBorderPainted(false);
        attachSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachSummaryActionPerformed(evt);
            }
        });
        jPanel1.add(attachSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, 30));

        path.setEditable(false);
        path.setBackground(new java.awt.Color(255, 255, 255));
        path.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        path.setForeground(new java.awt.Color(43, 47, 181));
        path.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 400, 30));

        fail_message.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        fail_message.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(fail_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, 20));

        confirm_message.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        confirm_message.setForeground(new java.awt.Color(43, 47, 181));
        jPanel1.add(confirm_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 340, 20));

        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 690, -1));

        summary_title.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        summary_title.setForeground(new java.awt.Color(0, 0, 0));
        summary_title.setText("Titulo");
        jPanel1.add(summary_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 690, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Palabras Claves:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        Resumen.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Resumen.setForeground(new java.awt.Color(0, 0, 0));
        Resumen.setText("Resumen");
        jPanel1.add(Resumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Autores:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 290, -1));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        summary_body.setEditable(false);
        summary_body.setBackground(new java.awt.Color(255, 255, 255));
        summary_body.setColumns(20);
        summary_body.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        summary_body.setForeground(new java.awt.Color(0, 0, 0));
        summary_body.setLineWrap(true);
        summary_body.setRows(5);
        summary_body.setWrapStyleWord(true);
        summary_body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        summary_body.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        summary_body.setSelectionColor(new java.awt.Color(43, 47, 181));
        jScrollPane3.setViewportView(summary_body);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 620, 170));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 290, -1));

        confirm.setBackground(new java.awt.Color(43, 47, 181));
        confirm.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirmar");
        confirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 47, 181)));
        confirm.setBorderPainted(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 150, 30));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargar archivo del resumen correspondiente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando el usuario realiza una acción, exitButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
        //Cierre del método
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, backButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        windowMenu windowMenu = new windowMenu();
        this.hide();
        windowMenu.show();
        //Cierre del método
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, attachSummaryButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void attachSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachSummaryActionPerformed
        file = uploadSummary.attach_file();
        if(file!=null){
            path.setText(file.getPath());
            confirm_message.setVisible(true);
            confirm_message.setText("Prevista del resumen");
            Object[] result = uploadSummary.load_summary(windowMain.hash, file);
            valid =(boolean) result[0];
            if(valid){
                summary_authors.setVisible(true);
                summary_keyw.setVisible(true);
                confirm.setVisible(true);
                sum =(Summary) result[1];
            }else{
                uploadSummary.hide();
            }
        }else{
            path.setText("...");
        }
        
        
        //Cierre del método
    }//GEN-LAST:event_attachSummaryActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, confirmButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        if(valid){
            uploadSummary.add_summary(windowMain.hash, sum, file);
            searchByKey.insert_new(windowMain.hash, windowMain.keyHash, sum);
            searchByAuthor.insert_new(windowMain.hash, windowMain.authorHash, sum);
            uploadSummary.hide();
            confirm_message.setVisible(true);
            confirm_message.setText("Carga y Guardado Exitoso");
        }
        //Cierre del método
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(windowAddResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowAddResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowAddResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowAddResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowAddResume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Resumen;
    private javax.swing.JButton attachSummary;
    private javax.swing.JButton backButton;
    public static javax.swing.JButton confirm;
    public static javax.swing.JLabel confirm_message;
    private javax.swing.JButton exitButton;
    public static javax.swing.JLabel fail_message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField path;
    public static javax.swing.JTextArea summary_authors;
    public static javax.swing.JTextArea summary_body;
    public static javax.swing.JTextArea summary_keyw;
    public static javax.swing.JLabel summary_title;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
