package proyecto.pkg1.interfaces.images;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario en la página principal del programa. 
 * @author: beatrizcardozo
 * @version: 15/03/2023
 */

public class windowMenu extends javax.swing.JFrame {

    /**
     * Creates new form windowMain
     */
    public windowMenu() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        searchByAuthorsButton.setBounds(10, 10, 30, 25);
        searchByAuthorsButton.setBorder(new RoundedBorder(10)); //10 is the radius
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
        searchByAuthorsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/images/searchAuthors.png"))); // NOI18N
        searchByAuthorsButton.setText("Buscar por Autor");
        searchByAuthorsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/logoImage.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 380, 50));

        addResumeButton.setBackground(new java.awt.Color(42, 47, 189));
        addResumeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        addResumeButton.setForeground(new java.awt.Color(255, 255, 255));
        addResumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/images/addResumeImage.png"))); // NOI18N
        addResumeButton.setText("Agregar Resumen");
        addResumeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        analyzeResumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/images/analizeImage.png"))); // NOI18N
        analyzeResumeButton.setText("Analizar Resumen");
        analyzeResumeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        searchByKeywordsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/images/searchKeyWords.png"))); // NOI18N
        searchByKeywordsButton.setText("Buscar por Palabras Clave");
        searchByKeywordsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        closeAndSaveButton.setText("Salir y Guardar");
        closeAndSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAndSaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeAndSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByAuthorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorsButtonActionPerformed
        windowSearchByAuthors windowAuthors = new windowSearchByAuthors();
        this.hide();
        windowAuthors.show();
    }//GEN-LAST:event_searchByAuthorsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResumeButtonActionPerformed
        windowAddResume windowAdd = new windowAddResume();
        this.hide();
        windowAdd.show();
    }//GEN-LAST:event_addResumeButtonActionPerformed

    private void analyzeResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeResumeButtonActionPerformed
        windowAnalyzeResume windowAnalyze = new windowAnalyzeResume();
        this.hide();
        windowAnalyze.show();
    }//GEN-LAST:event_analyzeResumeButtonActionPerformed

    private void searchByKeywordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByKeywordsButtonActionPerformed
        windowSearchByKeywords windowKeywords = new windowSearchByKeywords();
        this.hide();
        windowKeywords.show();
    }//GEN-LAST:event_searchByKeywordsButtonActionPerformed

    private void closeAndSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAndSaveButtonActionPerformed
        // TODO add your handling code here:
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

    
    private static class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}


}