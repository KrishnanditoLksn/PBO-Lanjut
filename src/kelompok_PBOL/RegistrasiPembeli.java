/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kelompok_PBOL;

/**
 *
 * @author ASUS
 */
public class RegistrasiPembeli extends javax.swing.JFrame {

    /**
     * Creates new form RegistrasiPembeli
     */
    public RegistrasiPembeli() {
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

        jControllerMainPanel = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelRegistrasi1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jControllerMainPanel.setBackground(new java.awt.Color(82, 178, 242));
        jControllerMainPanel.setForeground(new java.awt.Color(39, 203, 239));

        jLabelLogin.setBackground(new java.awt.Color(0, 0, 0));
        jLabelLogin.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogin.setText("Login");

        jLabelRegistrasi1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelRegistrasi1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRegistrasi1.setText("Registrasi");

        javax.swing.GroupLayout jControllerMainPanelLayout = new javax.swing.GroupLayout(jControllerMainPanel);
        jControllerMainPanel.setLayout(jControllerMainPanelLayout);
        jControllerMainPanelLayout.setHorizontalGroup(
            jControllerMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControllerMainPanelLayout.createSequentialGroup()
                .addGroup(jControllerMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jControllerMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRegistrasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jControllerMainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jControllerMainPanelLayout.setVerticalGroup(
            jControllerMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControllerMainPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabelLogin)
                .addGap(134, 134, 134)
                .addComponent(jLabelRegistrasi1)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jControllerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jControllerMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegistrasiPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrasiPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jControllerMainPanel;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRegistrasi1;
    // End of variables declaration//GEN-END:variables
}
