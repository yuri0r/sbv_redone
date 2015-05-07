

package sbv;

import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
public class Oberflaeche2 extends javax.swing.JFrame {
    
    static int currentPanel=1; 
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private void UpdateTable(String sql) {
        try{
            conn = DbConnector.getConnection();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(currentPanel == 3) {
            buecherTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(currentPanel == 2) {
            schuelerTbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public Oberflaeche2() {
        initComponents();
        initPanels();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        basePanel = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        schuelerTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tgem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tgei = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tgetm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tgj13 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tgj12 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tgj11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tgj21 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tgj22 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tgj23 = new javax.swing.JButton();
        buecherTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buecherTable = new javax.swing.JTable();
        klassenTab = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basePanelMouseClicked(evt);
            }
        });
        basePanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                basePanelComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Schulbuch Verwaltung");

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(668, Short.MAX_VALUE))
        );

        basePanel.addTab("Home", homeTab);

        schuelerTab.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        schuelerTab.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TGE/M");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel3);
        jLabel3.setBounds(100, 125, 200, 14);

        tgem.setText("---");
        schuelerTab.add(tgem);
        tgem.setBounds(100, 145, 200, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TGE/I");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel5);
        jLabel5.setBounds(500, 125, 200, 14);

        tgei.setText("---");
        schuelerTab.add(tgei);
        tgei.setBounds(500, 145, 200, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TGE/TM");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel4);
        jLabel4.setBounds(900, 125, 200, 14);

        tgetm.setText("---");
        schuelerTab.add(tgetm);
        tgetm.setBounds(900, 145, 200, 23);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TGJ1/3");
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel6);
        jLabel6.setBounds(900, 339, 200, 14);

        tgj13.setText("---");
        schuelerTab.add(tgj13);
        tgj13.setBounds(900, 359, 200, 23);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TGJ1/2");
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel7);
        jLabel7.setBounds(500, 339, 200, 14);

        tgj12.setText("---");
        schuelerTab.add(tgj12);
        tgj12.setBounds(500, 359, 200, 23);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TGJ1/1");
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel8.setName(""); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel8);
        jLabel8.setBounds(100, 339, 200, 14);

        tgj11.setText("---");
        schuelerTab.add(tgj11);
        tgj11.setBounds(100, 359, 200, 23);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TGJ2/1");
        jLabel11.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel11.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel11);
        jLabel11.setBounds(100, 553, 200, 14);

        tgj21.setText("---");
        schuelerTab.add(tgj21);
        tgj21.setBounds(100, 573, 200, 23);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TGJ2/2");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel10);
        jLabel10.setBounds(500, 553, 200, 14);

        tgj22.setText("---");
        schuelerTab.add(tgj22);
        tgj22.setBounds(500, 573, 200, 23);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TGJ2/3");
        jLabel9.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 14));
        schuelerTab.add(jLabel9);
        jLabel9.setBounds(900, 553, 200, 14);

        tgj23.setText("---");
        schuelerTab.add(tgj23);
        tgj23.setBounds(900, 573, 200, 23);

        basePanel.addTab("Schüler", schuelerTab);

        buecherTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                buecherTabComponentShown(evt);
            }
        });

        buecherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        buecherTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                buecherTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(buecherTable);

        javax.swing.GroupLayout buecherTabLayout = new javax.swing.GroupLayout(buecherTab);
        buecherTab.setLayout(buecherTabLayout);
        buecherTabLayout.setHorizontalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        buecherTabLayout.setVerticalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        basePanel.addTab("Bücher", buecherTab);

        javax.swing.GroupLayout klassenTabLayout = new javax.swing.GroupLayout(klassenTab);
        klassenTab.setLayout(klassenTabLayout);
        klassenTabLayout.setHorizontalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        klassenTabLayout.setVerticalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        basePanel.addTab("Klassen", klassenTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basePanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_basePanelComponentShown
        currentPanel = 3;
        UpdateTable("SELECT isbn, label, buy FROM sbm_books");
    }//GEN-LAST:event_basePanelComponentShown

    private void basePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basePanelMouseClicked
        currentPanel = 3;
        UpdateTable("SELECT isbn, label, buy FROM sbm_books");
    }//GEN-LAST:event_basePanelMouseClicked

    private void buecherTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_buecherTabComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_buecherTabComponentShown

    private void buecherTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_buecherTableComponentShown
        currentPanel = 3;
        UpdateTable("SELECT isbn, label, buy FROM sbm_books");
    }//GEN-LAST:event_buecherTableComponentShown

    private void initPanels() {
        schuelerTblPanel.setVisible(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(Oberflaeche2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oberflaeche2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane basePanel;
    private javax.swing.JPanel buecherTab;
    private javax.swing.JTable buecherTable;
    private javax.swing.JPanel homeTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel klassenTab;
    private javax.swing.JButton schuelerBackBtn;
    private javax.swing.JButton schuelerBackBtn2;
    private javax.swing.JButton schuelerBackBtn3;
    private javax.swing.JButton schuelerBackBtn4;
    private javax.swing.JButton schuelerBackBtn5;
    private javax.swing.JButton schuelerBackBtn6;
    private javax.swing.JPanel schuelerTab;
    private javax.swing.JTable schuelerTbl;
    private javax.swing.JTable schuelerTbl2;
    private javax.swing.JTable schuelerTbl3;
    private javax.swing.JTable schuelerTbl4;
    private javax.swing.JTable schuelerTbl5;
    private javax.swing.JTable schuelerTbl6;
    private javax.swing.JPanel schuelerTblPanel;
    private javax.swing.JPanel schuelerTblPanel2;
    private javax.swing.JPanel schuelerTblPanel3;
    private javax.swing.JPanel schuelerTblPanel4;
    private javax.swing.JPanel schuelerTblPanel5;
    private javax.swing.JPanel schuelerTblPanel6;
    private javax.swing.JButton tgei;
    private javax.swing.JButton tgem;
    private javax.swing.JButton tgetm;
    private javax.swing.JButton tgj11;
    private javax.swing.JButton tgj12;
    private javax.swing.JButton tgj13;
    private javax.swing.JButton tgj21;
    private javax.swing.JButton tgj22;
    private javax.swing.JButton tgj23;
    // End of variables declaration//GEN-END:variables
}
