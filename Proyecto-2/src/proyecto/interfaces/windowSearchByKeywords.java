package proyecto.interfaces;
import proyecto.searchByKey;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la búsqueda de investigaciones por palabras claves. 
 * @author: beatrizcardozo
 * @version: 22/03/2023
 */
public class windowSearchByKeywords extends javax.swing.JFrame {

    /**
     * Constructor para la clase windowSearchByKeywords
     */
    public windowSearchByKeywords() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        searchByKey.hide();
    } //Cierre del constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        keywordTextField = new javax.swing.JTextField();
        investLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumeFoundList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        fail_message = new javax.swing.JLabel();
        fail_select = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(43, 47, 181));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/searchbyKeywords.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 590, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 580, -1));

        keywordTextField.setBackground(new java.awt.Color(255, 255, 255));
        keywordTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        keywordTextField.setForeground(new java.awt.Color(0, 0, 0));
        keywordTextField.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        keywordTextField.setSelectionColor(new java.awt.Color(43, 47, 181));
        keywordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordTextFieldActionPerformed(evt);
            }
        });
        keywordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keywordTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(keywordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 470, 30));

        investLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        investLabel.setForeground(new java.awt.Color(0, 0, 0));
        investLabel.setText("Investigaciones encontradas con :");
        jPanel1.add(investLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 670, -1));

        searchButton.setBackground(new java.awt.Color(43, 47, 181));
        searchButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setActionCommand("");
        searchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchButton.setBorderPainted(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 130, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        resumeFoundList.setBackground(new java.awt.Color(255, 255, 255));
        resumeFoundList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resumeFoundList.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        resumeFoundList.setForeground(new java.awt.Color(0, 0, 0));
        resumeFoundList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Investigación 1", "Investigación 2", "Investigación 3", "Investigación 4", "Investigación 5", "Investigación 6", "Investigación 7", "Investigación 8", "Investigación 9", "Investigación 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        resumeFoundList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resumeFoundList.setSelectionBackground(new java.awt.Color(43, 47, 181));
        resumeFoundList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(resumeFoundList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 670, 210));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese una palabra clave para buscar las investigaciones relacionadas: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        select.setBackground(new java.awt.Color(43, 47, 181));
        select.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("Seleccionar Investigacion");
        select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 47, 181)));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 210, 30));

        fail_message.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        fail_message.setForeground(new java.awt.Color(102, 0, 0));
        fail_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fail_message.setText("jLabel2");
        jPanel1.add(fail_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 480, -1));

        fail_select.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        fail_select.setForeground(new java.awt.Color(102, 0, 0));
        fail_select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fail_select.setText("...");
        jPanel1.add(fail_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando el usuario realiza una acción, backButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        windowMenu windowMenu = new windowMenu();
        this.hide();
        windowMenu.show();
    }//Cierre del método
//GEN-LAST:event_backButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, exitButton cuando ha sido presionado. Para cerrar el programa. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//Cierre del método
    
//GEN-LAST:event_exitButtonActionPerformed
    
    
    /**
     * Método invocado cuando el usuario realiza una acción, searchButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String s = keywordTextField.getText().toLowerCase();
        if(s.isEmpty()){
            searchByKey.hide();
            fail_message.setVisible(true);
            fail_message.setText("Por favor introduzca una palabra clave");
        } else {
            fail_select.setVisible(false);
            fail_message.setVisible(false);
            searchByKey.set_options(windowMain.keyHash, windowMain.hash);
        }
    }//Cierre del método
//GEN-LAST:event_searchButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, keywordTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void keywordTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keywordTextFieldKeyTyped
       auxFunctions.verifyString(evt, keywordTextField, FRAMEBITS);
    } //Cierre del metodo
//GEN-LAST:event_keywordTextFieldKeyTyped

     /**
     * Método invocado cuando el usuario realiza una acción, select cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        if(resumeFoundList.getSelectedIndex() != -1 && auxFunctions.checkListSelec(resumeFoundList)){ 
            windowResumeDetails resumeDetails = new windowResumeDetails();
            resumeDetails.show();
            searchByKey.make_details_visible(resumeFoundList.getSelectedValue(), windowMain.hash);
            searchByKey.hide();
        }  else{
            fail_select.setVisible(true);
            fail_select.setText("Por favor seleccione un resumen");
        }
    } //Cierre del método
//GEN-LAST:event_selectActionPerformed

    private void keywordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(windowSearchByKeywords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowSearchByKeywords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowSearchByKeywords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowSearchByKeywords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowSearchByKeywords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;
    public static javax.swing.JLabel fail_message;
    public static javax.swing.JLabel fail_select;
    public static javax.swing.JLabel investLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField keywordTextField;
    public static javax.swing.JList<String> resumeFoundList;
    private javax.swing.JButton searchButton;
    public static javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}   //Cierre de la clase
