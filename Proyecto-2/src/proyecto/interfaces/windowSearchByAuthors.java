/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;
import javax.swing.JOptionPane;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la búsqueda de investigaciones por autor. 
 * @author: beatrizcardozo
 * @version: 22/03/2023
 */
public class windowSearchByAuthors extends javax.swing.JFrame {

    /**
     * Constructor para la clase windowSearchByAuthors
    */
    public windowSearchByAuthors() {
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
        exitButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        selectResumeButton = new javax.swing.JButton();
        authorsComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumeFoundList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

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

        exitButton1.setBackground(new java.awt.Color(153, 0, 0));
        exitButton1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(255, 255, 255));
        exitButton1.setText("X");
        exitButton1.setBorderPainted(false);
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/searchbyAuthors.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 580, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Investigaciones encotradas de \"AUTOR\":");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        selectResumeButton.setBackground(new java.awt.Color(43, 47, 181));
        selectResumeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        selectResumeButton.setForeground(new java.awt.Color(255, 255, 255));
        selectResumeButton.setText("Seleccionar Investigación");
        selectResumeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selectResumeButton.setBorderPainted(false);
        selectResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectResumeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectResumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 270, 30));

        authorsComboBox.setBackground(new java.awt.Color(255, 255, 255));
        authorsComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        authorsComboBox.setForeground(new java.awt.Color(0, 0, 0));
        authorsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor 1", "Autor 2", "Autor 3", "Autor 4" }));
        authorsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(authorsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 320, 30));

        resumeFoundList.setBackground(new java.awt.Color(204, 204, 204));
        resumeFoundList.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        resumeFoundList.setForeground(new java.awt.Color(0, 0, 0));
        resumeFoundList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(resumeFoundList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 390, 210));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione un autor, para conocer sus resumenes registrados:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

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
    } //Cierre del metodo
//GEN-LAST:event_backButtonActionPerformed

     /**
     * Método invocado cuando el usuario realiza una acción, exitButton cuando ha sido presionado. Para cerrar el programa. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    } //Cierre del metodo
//GEN-LAST:event_exitButton1ActionPerformed

     /**
     * Método invocado cuando el usuario realiza una acción, selectResumeButton cuando ha sido presionado. Para cerrar el programa. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void selectResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectResumeButtonActionPerformed
//        if(authorsComboBox.getSelectedIndex() != -1 && windowMain.auxFunc.checkListSelec(resumeFoundList)){ 
//            windowResumeDetails resumeDetails = new windowResumeDetails();
//            resumeDetails.show();
//        }   
//    //Cierre del método
    }//GEN-LAST:event_selectResumeButtonActionPerformed

    private void authorsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorsComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(windowSearchByAuthors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowSearchByAuthors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowSearchByAuthors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowSearchByAuthors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowSearchByAuthors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> authorsComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> resumeFoundList;
    private javax.swing.JButton selectResumeButton;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
