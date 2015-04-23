
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
        initPanels();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buecherPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buecherTable = new javax.swing.JTable();
        schuelerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tgem = new javax.swing.JButton();
        tgei = new javax.swing.JButton();
        tgetm = new javax.swing.JButton();
        tgj11 = new javax.swing.JButton();
        tgj12 = new javax.swing.JButton();
        tgj13 = new javax.swing.JButton();
        tgj21 = new javax.swing.JButton();
        tgj22 = new javax.swing.JButton();
        tgj23 = new javax.swing.JButton();
        schuelerTblPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schuelerTbl = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        mainPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Home");
        jButton2.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton2.setMinimumSize(new java.awt.Dimension(400, 400));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));
        jButton2.getAccessibleContext().setAccessibleName("homeBtn");

        jButton3.setText("Schüler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, -1));
        jButton3.getAccessibleContext().setAccessibleName("schuelerBtn");

        jButton4.setText("Bücher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 300, -1));
        jButton4.getAccessibleContext().setAccessibleName("buecherBtn");

        jButton6.setText("Klassen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 300, -1));
        jButton6.getAccessibleContext().setAccessibleName("klassenBtn");

        jLabel1.setText("Suchen");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 33, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("suchenLbl");

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 28, 50, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        mainPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 30, 300, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        buecherPanel.setMaximumSize(new java.awt.Dimension(1200, 750));
        buecherPanel.setMinimumSize(new java.awt.Dimension(1200, 750));
        buecherPanel.setPreferredSize(new java.awt.Dimension(1200, 750));

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
        buecherTable.setMaximumSize(new java.awt.Dimension(1200, 700));
        buecherTable.setMinimumSize(new java.awt.Dimension(1200, 700));
        buecherTable.setPreferredSize(new java.awt.Dimension(1200, 700));
        jScrollPane1.setViewportView(buecherTable);

        schuelerPanel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel3.setFont(schuelerPanel.getFont());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TGE/M");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel4.setFont(schuelerPanel.getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TGE/TM");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel5.setFont(schuelerPanel.getFont());
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TGE/I");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel6.setFont(schuelerPanel.getFont());
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TGJ1/3");
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel7.setFont(schuelerPanel.getFont());
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TGJ1/2");
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel8.setFont(schuelerPanel.getFont());
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TGJ1/1");
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel8.setName(""); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel9.setFont(schuelerPanel.getFont());
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TGJ2/3");
        jLabel9.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel10.setFont(schuelerPanel.getFont());
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TGJ2/2");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 14));

        jLabel11.setFont(schuelerPanel.getFont());
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TGJ2/1");
        jLabel11.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel11.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 14));

        tgem.setText("---");
        tgem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgemActionPerformed(evt);
            }
        });

        tgei.setText("---");
        tgei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgeiActionPerformed(evt);
            }
        });

        tgetm.setText("---");
        tgetm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgetmActionPerformed(evt);
            }
        });

        tgj11.setText("---");
        tgj11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj11ActionPerformed(evt);
            }
        });

        tgj12.setText("---");
        tgj12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj12ActionPerformed(evt);
            }
        });

        tgj13.setText("---");
        tgj13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj13ActionPerformed(evt);
            }
        });

        tgj21.setText("---");
        tgj21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj21ActionPerformed(evt);
            }
        });

        tgj22.setText("---");
        tgj22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj22ActionPerformed(evt);
            }
        });

        tgj23.setText("---");
        tgj23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgj23ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout schuelerTblPanelLayout = new javax.swing.GroupLayout(schuelerTblPanel);
        schuelerTblPanel.setLayout(schuelerTblPanelLayout);
        schuelerTblPanelLayout.setHorizontalGroup(
            schuelerTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        schuelerTblPanelLayout.setVerticalGroup(
            schuelerTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout schuelerPanelLayout = new javax.swing.GroupLayout(schuelerPanel);
        schuelerPanel.setLayout(schuelerPanelLayout);
        schuelerPanelLayout.setHorizontalGroup(
            schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tgj21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgj11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgj12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgj22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgetm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgj13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgj23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(schuelerTblPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        schuelerPanelLayout.setVerticalGroup(
            schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerPanelLayout.createSequentialGroup()
                .addComponent(schuelerTblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgem)
                    .addComponent(tgei)
                    .addComponent(tgetm))
                .addGap(171, 171, 171)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgj11)
                    .addComponent(tgj12)
                    .addComponent(tgj13))
                .addGap(171, 171, 171)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schuelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgj21)
                    .addComponent(tgj22)
                    .addComponent(tgj23))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout buecherPanelLayout = new javax.swing.GroupLayout(buecherPanel);
        buecherPanel.setLayout(buecherPanelLayout);
        buecherPanelLayout.setHorizontalGroup(
            buecherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buecherPanelLayout.createSequentialGroup()
                .addComponent(schuelerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );
        buecherPanelLayout.setVerticalGroup(
            buecherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(schuelerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buecherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buecherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        mainPanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 750));
        homePanel.getAccessibleContext().setAccessibleName("homePanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initPanels() {
      buecherPanel.setVisible(false);
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //label1.setText(Books.getLabel(jTextField2.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      //label1.setText("Klassen");  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        schuelerPanel.setVisible(false);
        buecherPanel.setVisible(true);
        currentPanel = 3;
        
        UpdateTable("SELECT isbn, label, buy FROM sbm_books");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        schuelerTblPanel.setVisible(false);
        schuelerPanel.setVisible(true);
        buecherPanel.setVisible(true);
        homePanel.setVisible(true);
        currentPanel = 2;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        schuelerTblPanel.setVisible(false);
        schuelerPanel.setVisible(false);
        buecherPanel.setVisible(false);
        homePanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgemActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGE/M'");
    }//GEN-LAST:event_tgemActionPerformed

    private void tgeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgeiActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGE/I'");
    }//GEN-LAST:event_tgeiActionPerformed

    private void tgetmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgetmActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGE/TM'");
    }//GEN-LAST:event_tgetmActionPerformed

    private void tgj11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj11ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ1/1'");
    }//GEN-LAST:event_tgj11ActionPerformed

    private void tgj12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj12ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ1/2'");
    }//GEN-LAST:event_tgj12ActionPerformed

    private void tgj13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj13ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ1/3'");
    }//GEN-LAST:event_tgj13ActionPerformed

    private void tgj21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj21ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ2/1'");
    }//GEN-LAST:event_tgj21ActionPerformed

    private void tgj22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj22ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ2/2'");
    }//GEN-LAST:event_tgj22ActionPerformed

    private void tgj23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgj23ActionPerformed
        schuelerTblPanel.setVisible(true);
        UpdateTable("SELECT forename, surname, birth FROM sbm_students WHERE class LIKE 'TGJ2/3'");
    }//GEN-LAST:event_tgj23ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oberflaeche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buecherPanel;
    private javax.swing.JTable buecherTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel schuelerPanel;
    private javax.swing.JTable schuelerTbl;
    private javax.swing.JPanel schuelerTblPanel;
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
