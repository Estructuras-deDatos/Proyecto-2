package proyecto.interfaces;
import javax.swing.JOptionPane;
import proyecto.interfaces.windowAddResume;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario en el menu del programa. 
 * @author: beatrizcardozo
 * @version: 15/03/2023
 */

public class windowMenu extends javax.swing.JFrame {
    /**
     * Constructor para la clase windowMenu
     */
    public windowMenu() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
    } //Cierre del constructor


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchByAuthorsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addResumeButton = new javax.swing.JButton();
        analyzeResumeButton = new javax.swing.JButton();
        searchByKeywordsButton = new javax.swing.JButton();
        closeAndSaveButton = new javax.swing.JButton();

        setTitle("MetroMendeley");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchByAuthorsButton.setBackground(new java.awt.Color(42, 47, 189));
        searchByAuthorsButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        searchByAuthorsButton.setForeground(new java.awt.Color(255, 255, 255));
        searchByAuthorsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/searchAuthors.png"))); // NOI18N
        searchByAuthorsButton.setText("Buscar por Autor");
        searchByAuthorsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchByAuthorsButton.setBorderPainted(false);
        searchByAuthorsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchByAuthorsButton.setOpaque(true);
        searchByAuthorsButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        searchByAuthorsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchByAuthorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAuthorsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchByAuthorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 230, 180));

        exitButton.setBackground(new java.awt.Color(153, 0, 0));
        exitButton.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("X");
        exitButton.setBorderPainted(false);
        exitButton.setOpaque(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/logoImage.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 50));

        addResumeButton.setBackground(new java.awt.Color(42, 47, 189));
        addResumeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        addResumeButton.setForeground(new java.awt.Color(255, 255, 255));
        addResumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/addResumeImage.png"))); // NOI18N
        addResumeButton.setText("Agregar Resumen");
        addResumeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addResumeButton.setBorderPainted(false);
        addResumeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addResumeButton.setOpaque(true);
        addResumeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addResumeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResumeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addResumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 230, 180));

        analyzeResumeButton.setBackground(new java.awt.Color(42, 47, 189));
        analyzeResumeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        analyzeResumeButton.setForeground(new java.awt.Color(255, 255, 255));
        analyzeResumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/analizeImage.png"))); // NOI18N
        analyzeResumeButton.setText("Analizar Resumen");
        analyzeResumeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        analyzeResumeButton.setBorderPainted(false);
        analyzeResumeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        analyzeResumeButton.setOpaque(true);
        analyzeResumeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        analyzeResumeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        analyzeResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeResumeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(analyzeResumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 230, 180));

        searchByKeywordsButton.setBackground(new java.awt.Color(42, 47, 189));
        searchByKeywordsButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        searchByKeywordsButton.setForeground(new java.awt.Color(255, 255, 255));
        searchByKeywordsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/searchKeyWords.png"))); // NOI18N
        searchByKeywordsButton.setText("Buscar por Palabras Clave");
        searchByKeywordsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchByKeywordsButton.setBorderPainted(false);
        searchByKeywordsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchByKeywordsButton.setOpaque(true);
        searchByKeywordsButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        searchByKeywordsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchByKeywordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByKeywordsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchByKeywordsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 230, 180));

        closeAndSaveButton.setBackground(new java.awt.Color(42, 47, 189));
        closeAndSaveButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        closeAndSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        closeAndSaveButton.setText("Salir");
        closeAndSaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 47, 189)));
        closeAndSaveButton.setBorderPainted(false);
        closeAndSaveButton.setOpaque(true);
        closeAndSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAndSaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeAndSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Método invocado cuando el usuario realiza una acción, searchByAuthorsButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void searchByAuthorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorsButtonActionPerformed
         if(windowMain.hash.getSize() > 0){
            windowSearchByAuthors windowAuthors = new windowSearchByAuthors();
            this.hide();
            windowAuthors.show();
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún resumen en el sistema!", "Atención!", JOptionPane.INFORMATION_MESSAGE,auxFunctions.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/Proyecto 2/Proyecto-2/Proyecto-2/src/proyecto/interfaces/images/atentionImage.png"));
        }
//        Cierre del método
    }//GEN-LAST:event_searchByAuthorsButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, exitButton cuando ha sido presionado. Para cerrar el programa.
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
        //Cierre del método
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, addResumeButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void addResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResumeButtonActionPerformed
        windowAddResume windowAdd = new windowAddResume();
        this.hide();
        windowAdd.show();
        //Cierre del método
    }//GEN-LAST:event_addResumeButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, analyzeResumeButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void analyzeResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeResumeButtonActionPerformed
        if(windowMain.hash.getSize() > 0){
            windowAnalyzeResume windowAnalyze = new windowAnalyzeResume();
            this.hide();
            windowAnalyze.show();
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún resumen en el sistema!", "Atención!", JOptionPane.INFORMATION_MESSAGE,auxFunctions.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/Proyecto 2/Proyecto-2/Proyecto-2/src/proyecto/interfaces/images/atentionImage.png"));
        }
        //Cierre del método
    }//GEN-LAST:event_analyzeResumeButtonActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, searchByKeywordsButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void searchByKeywordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByKeywordsButtonActionPerformed
        if(windowMain.hash.getSize() > 0){   
            windowSearchByKeywords windowKeywords = new windowSearchByKeywords();
            this.hide();
            windowKeywords.show();
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún resumen en el sistema!", "Atención!", JOptionPane.INFORMATION_MESSAGE,auxFunctions.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/Proyecto 2/Proyecto-2/Proyecto-2/src/proyecto/interfaces/images/atentionImage.png"));
        }
        //Cierre del método
    }//GEN-LAST:event_searchByKeywordsButtonActionPerformed

    
    /**
     * Método invocado cuando el usuario realiza una acción, closeAndSaveButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void closeAndSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAndSaveButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeAndSaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(windowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResumeButton;
    private javax.swing.JButton analyzeResumeButton;
    private javax.swing.JButton closeAndSaveButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchByAuthorsButton;
    private javax.swing.JButton searchByKeywordsButton;
    // End of variables declaration//GEN-END:variables

} //Cierre de la clase
