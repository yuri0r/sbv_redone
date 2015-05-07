

package sbv;

import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
public class Oberflaeche extends javax.swing.JFrame {
    
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
    
    public Oberflaeche() {
        initComponents();
        schuelerCount.setText(Home.StudentsCount());
        freieBuecher.setText(Home.WildCopyCount());
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        basePanel = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        schuelerCount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        freieBuecher = new javax.swing.JLabel();
        schuelerTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schuelerTbl = new javax.swing.JTable();
        tgj23 = new javax.swing.JButton();
        tgem = new javax.swing.JButton();
        tgei = new javax.swing.JButton();
        tgetm = new javax.swing.JButton();
        tgj11 = new javax.swing.JButton();
        tgj12 = new javax.swing.JButton();
        tgj13 = new javax.swing.JButton();
        tgj21 = new javax.swing.JButton();
        tgj22 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Anzahl Schüler:");
        jLabel3.setVerifyInputWhenFocusTarget(false);

        schuelerCount.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        schuelerCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schuelerCount.setText("---");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Anzahl freier Bücher:");

        freieBuecher.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        freieBuecher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        freieBuecher.setText("---");

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(schuelerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(freieBuecher, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addGroup(homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schuelerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freieBuecher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(431, Short.MAX_VALUE))
        );

        basePanel.addTab("Home", homeTab);

        schuelerTab.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        schuelerTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(schuelerTbl);

        tgj23.setText("TGJ2/3");
        tgj23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj23ActionPerformed(evt);
            }
        });

        tgem.setText("TGE/M");
        tgem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgemActionPerformed(evt);
            }
        });

        tgei.setText("TGE/I");
        tgei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgeiActionPerformed(evt);
            }
        });

        tgetm.setText("TGE/TM");
        tgetm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgetmActionPerformed(evt);
            }
        });

        tgj11.setText("TGJ1/1");
        tgj11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj11ActionPerformed(evt);
            }
        });

        tgj12.setText("TGJ1/2");
        tgj12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj12ActionPerformed(evt);
            }
        });

        tgj13.setText("TGJ1/3");
        tgj13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj13ActionPerformed(evt);
            }
        });

        tgj21.setText("TGJ2/1");
        tgj21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj21ActionPerformed(evt);
            }
        });

        tgj22.setText("TGJ2/2");
        tgj22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj22ActionPerformed(evt);
            }
        });

        jButton1.setText("Export als PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout schuelerTabLayout = new javax.swing.GroupLayout(schuelerTab);
        schuelerTab.setLayout(schuelerTabLayout);
        schuelerTabLayout.setHorizontalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgei, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgetm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgj23, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schuelerTabLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        schuelerTabLayout.setVerticalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, schuelerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tgem)
                        .addGap(50, 50, 50)
                        .addComponent(tgei)
                        .addGap(50, 50, 50)
                        .addComponent(tgetm)
                        .addGap(50, 50, 50)
                        .addComponent(tgj11)
                        .addGap(50, 50, 50)
                        .addComponent(tgj12)
                        .addGap(50, 50, 50)
                        .addComponent(tgj13)
                        .addGap(69, 69, 69)
                        .addComponent(tgj21)
                        .addGap(50, 50, 50)
                        .addComponent(tgj22)
                        .addGap(50, 50, 50)
                        .addComponent(tgj23)))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
        );
        buecherTabLayout.setVerticalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        basePanel.addTab("Bücher", buecherTab);

        javax.swing.GroupLayout klassenTabLayout = new javax.swing.GroupLayout(klassenTab);
        klassenTab.setLayout(klassenTabLayout);
        klassenTabLayout.setHorizontalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        klassenTabLayout.setVerticalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        basePanel.addTab("Klassen", klassenTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tgeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgeiActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGE/I' ORDER BY surname ASC");
    }//GEN-LAST:event_tgeiActionPerformed

    private void tgj13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj13ActionPerformed
      currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ1/3' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj13ActionPerformed

    private void tgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgemActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGE/M' ORDER BY surname ASC");
    }//GEN-LAST:event_tgemActionPerformed

    private void tgetmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgetmActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGE/TM' ORDER BY surname ASC");
    }//GEN-LAST:event_tgetmActionPerformed

    private void tgj11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj11ActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ1/1' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj11ActionPerformed

    private void tgj12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj12ActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ1/2' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj12ActionPerformed

    private void tgj21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj21ActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ2/1' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj21ActionPerformed

    private void tgj22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj22ActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ2/2' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj22ActionPerformed

    private void tgj23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj23ActionPerformed
        currentPanel = 2;
        UpdateTable("SELECT surname AS Nachname, forename AS Vorname, birth AS Geburtstag FROM sbm_students WHERE class LIKE 'TGJ2/3' ORDER BY surname ASC");
    }//GEN-LAST:event_tgj23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PDF_Export.jPanelPdfExport(this.schuelerTab);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**private void panels() {
        schuelerTblPanel.setVisible(false);
    }*/
    
    
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
            java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oberflaeche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane basePanel;
    private javax.swing.JPanel buecherTab;
    private javax.swing.JTable buecherTable;
    private javax.swing.JLabel freieBuecher;
    private javax.swing.JPanel homeTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel klassenTab;
    private javax.swing.JLabel schuelerCount;
    private javax.swing.JPanel schuelerTab;
    private javax.swing.JTable schuelerTbl;
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
