package proyecto.interfaces;
import proyecto.Summary;
import proyecto.analizeSummary;
import proyecto.uploadSummary;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para agregar resumenes al programa. 
 * @author: beatrizcardozo 
 * @version: 22/03/2023
 */
public class windowAnalyzeResume extends javax.swing.JFrame {
    
    public static Summary selected;

    /**
     * Constructor para la clase windowAnalyze
     */
    public windowAnalyzeResume() {
        setUndecorated(true);
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        jList1.setListData(analizeSummary.get_options(windowMain.hash));
        analizeSummary.hide();
    } //Cierre del método


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        analyze = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sel_authors = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sel_title = new javax.swing.JTextArea();
        problem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton1.setBackground(new java.awt.Color(153, 0, 0));
        exitButton1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(255, 255, 255));
        exitButton1.setText("X");
        exitButton1.setBorderPainted(false);
        exitButton1.setOpaque(true);
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/interfaces/images/analyzeResume.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 580, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 20, 460));

        jLabel2.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Investigaciones Disponibles:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        analyze.setBackground(new java.awt.Color(43, 47, 181));
        analyze.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        analyze.setForeground(new java.awt.Color(255, 255, 255));
        analyze.setText("Analizar");
        analyze.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 47, 181), 5));
        analyze.setBorderPainted(false);
        analyze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analyze.setOpaque(true);
        analyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeActionPerformed(evt);
            }
        });
        jPanel1.add(analyze, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 190, -1));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Autores:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sel_authors.setEditable(false);
        sel_authors.setBackground(new java.awt.Color(255, 255, 255));
        sel_authors.setColumns(20);
        sel_authors.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 12)); // NOI18N
        sel_authors.setForeground(new java.awt.Color(0, 0, 0));
        sel_authors.setRows(5);
        sel_authors.setBorder(null);
        jScrollPane2.setViewportView(sel_authors);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 400, -1));

        jLabel4.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estadisticas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setSelectionBackground(new java.awt.Color(43, 47, 181));
        jList1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jList1.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 230));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setOpaque(false);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setAutoscrolls(false);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setFillsViewportHeight(true);
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(25);
        table.setRowMargin(1);
        table.setRowSelectionAllowed(false);
        table.setSelectionBackground(new java.awt.Color(0, 0, 0));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(true);
        jScrollPane3.setViewportView(table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 330, 180));

        backButton.setBackground(new java.awt.Color(43, 47, 181));
        backButton.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Regresar");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 47, 181), 2));
        backButton.setBorderPainted(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel5.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 47, 181));
        jLabel5.setText("Investigacion seleccionada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sel_title.setBackground(new java.awt.Color(255, 255, 255));
        sel_title.setColumns(20);
        sel_title.setFont(new java.awt.Font("Kohinoor Devanagari", 2, 12)); // NOI18N
        sel_title.setForeground(new java.awt.Color(0, 0, 0));
        sel_title.setLineWrap(true);
        sel_title.setRows(5);
        sel_title.setWrapStyleWord(true);
        sel_title.setBorder(null);
        jScrollPane4.setViewportView(sel_title);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 390, 80));

        problem.setFont(new java.awt.Font("Kohinoor Devanagari", 2, 12)); // NOI18N
        problem.setForeground(new java.awt.Color(102, 0, 0));
        problem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        problem.setText("...");
        jPanel1.add(problem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando el usuario realiza una acción, exitButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
        //Cierre del método
    }//GEN-LAST:event_exitButton1ActionPerformed

    /**
     * Método invocado cuando el usuario realiza una acción, analyzeButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void analyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeActionPerformed
        String title_selected = jList1.getSelectedValue();
        if(title_selected!=null){
            problem.setVisible(false);
        selected = uploadSummary.search(title_selected.trim(),windowMain.hash);
        analizeSummary.analyze_summary(selected);}
        else{
            problem.setVisible(true);
            problem.setText("Por favor seleccione una opcion!");
        }
        //Cierre del método
    }//GEN-LAST:event_analyzeActionPerformed

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
            java.util.logging.Logger.getLogger(windowAnalyzeResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowAnalyzeResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowAnalyzeResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowAnalyzeResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowAnalyzeResume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton analyze;
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel problem;
    public static javax.swing.JTextArea sel_authors;
    public static javax.swing.JTextArea sel_title;
    public static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
