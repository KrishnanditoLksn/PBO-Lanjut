/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kelompok_PBOL;

import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form kelompok
     */
    CardLayout cardLayout;
    ArrayList<Tanaman> tanamanArrayList = new ArrayList();
    boolean isDataFill = false;

    public MainApp() {
        initComponents();
        cardLayout = (CardLayout) jMainRootPanel.getLayout();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonDaftar = new javax.swing.JButton();
        jButtonDaftarItem = new javax.swing.JButton();
        jButtonKeranjang = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMainRootPanel = new javax.swing.JPanel();
        jMainDashboardPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jItemPanel = new javax.swing.JPanel();
        jTanamanPanel1 = new javax.swing.JPanel();
        jLabelItem1 = new javax.swing.JLabel();
        jSpinnerItem1 = new javax.swing.JSpinner();
        jLabelItemName1 = new javax.swing.JLabel();
        jButtonTambahKeranjang1 = new javax.swing.JButton();
        jCheckoutButton1 = new javax.swing.JButton();
        jKeranjangMainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menu");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Keranjang");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Item");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Daftar");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(" Login & Register");

        jButtonDaftar.setText("<>");

        jButtonDaftarItem.setText("<>");
        jButtonDaftarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaftarItemActionPerformed(evt);
            }
        });

        jButtonKeranjang.setText("<>");
        jButtonKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeranjangActionPerformed(evt);
            }
        });

        jButton4.setText("<>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jButtonDaftar)
                    .addComponent(jButtonDaftarItem)
                    .addComponent(jButtonKeranjang)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDaftar)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDaftarItem)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKeranjang)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMainRootPanel.setBackground(new java.awt.Color(255, 255, 255));
        jMainRootPanel.setLayout(new java.awt.CardLayout());

        jLabel6.setText("cek ombak");

        javax.swing.GroupLayout jMainDashboardPanelLayout = new javax.swing.GroupLayout(jMainDashboardPanel);
        jMainDashboardPanel.setLayout(jMainDashboardPanelLayout);
        jMainDashboardPanelLayout.setHorizontalGroup(
            jMainDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainDashboardPanelLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(726, Short.MAX_VALUE))
        );
        jMainDashboardPanelLayout.setVerticalGroup(
            jMainDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainDashboardPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        jMainRootPanel.add(jMainDashboardPanel, "card2");

        jTanamanPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelItem1.setBackground(new java.awt.Color(148, 242, 120));
        jLabelItem1.setIcon(new javax.swing.ImageIcon("D:\\USD_JAVA_OOP\\PBOL\\Praktek\\src\\main\\java\\Images\\lodeh.jpg")); // NOI18N
        jLabelItem1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jSpinnerItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSpinnerItem1KeyPressed(evt);
            }
        });

        jLabelItemName1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelItemName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelItemName1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelItemName1.setText("TANAMAN PAKIS");

        jButtonTambahKeranjang1.setText("Tambah");
        jButtonTambahKeranjang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahKeranjang1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTanamanPanel1Layout = new javax.swing.GroupLayout(jTanamanPanel1);
        jTanamanPanel1.setLayout(jTanamanPanel1Layout);
        jTanamanPanel1Layout.setHorizontalGroup(
            jTanamanPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTanamanPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jSpinnerItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonTambahKeranjang1)
                .addGap(48, 48, 48))
            .addGroup(jTanamanPanel1Layout.createSequentialGroup()
                .addGroup(jTanamanPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTanamanPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTanamanPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabelItemName1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTanamanPanel1Layout.setVerticalGroup(
            jTanamanPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTanamanPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelItemName1)
                .addGap(18, 18, 18)
                .addGroup(jTanamanPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTambahKeranjang1))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jCheckoutButton1.setBackground(new java.awt.Color(78, 144, 182));
        jCheckoutButton1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckoutButton1.setText("Checkout");

        javax.swing.GroupLayout jItemPanelLayout = new javax.swing.GroupLayout(jItemPanel);
        jItemPanel.setLayout(jItemPanelLayout);
        jItemPanelLayout.setHorizontalGroup(
            jItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jItemPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTanamanPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(727, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jItemPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jItemPanelLayout.setVerticalGroup(
            jItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTanamanPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jMainRootPanel.add(jItemPanel, "card3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Tanaman", "Stock", "Jumlah", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jKeranjangMainPanelLayout = new javax.swing.GroupLayout(jKeranjangMainPanel);
        jKeranjangMainPanel.setLayout(jKeranjangMainPanelLayout);
        jKeranjangMainPanelLayout.setHorizontalGroup(
            jKeranjangMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKeranjangMainPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 243, Short.MAX_VALUE))
        );
        jKeranjangMainPanelLayout.setVerticalGroup(
            jKeranjangMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        jMainRootPanel.add(jKeranjangMainPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMainRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jMainRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        cardLayout.show(jMainRootPanel, "card2");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        cardLayout.show(jMainRootPanel, "card3");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        cardLayout.show(jMainRootPanel, "card4");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jSpinnerItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinnerItem1KeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_jSpinnerItem1KeyPressed

    private void jButtonTambahKeranjang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahKeranjang1ActionPerformed
        tanamanArrayList.add(tanamanArrayList.get(0));
        isDataFill = true;
    }//GEN-LAST:event_jButtonTambahKeranjang1ActionPerformed

    private void jButtonDaftarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaftarItemActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jMainRootPanel, "card3");
    }//GEN-LAST:event_jButtonDaftarItemActionPerformed

    private void jButtonKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeranjangActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jMainRootPanel, "card4");
    }//GEN-LAST:event_jButtonKeranjangActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonDaftar;
    private javax.swing.JButton jButtonDaftarItem;
    private javax.swing.JButton jButtonKeranjang;
    private javax.swing.JButton jButtonTambahKeranjang1;
    private javax.swing.JButton jCheckoutButton1;
    private javax.swing.JPanel jItemPanel;
    private javax.swing.JPanel jKeranjangMainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelItem1;
    private javax.swing.JLabel jLabelItemName1;
    private javax.swing.JPanel jMainDashboardPanel;
    private javax.swing.JPanel jMainRootPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerItem1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jTanamanPanel1;
    // End of variables declaration//GEN-END:variables
}
