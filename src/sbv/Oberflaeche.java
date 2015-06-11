

package sbv;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Oberflaeche extends javax.swing.JFrame {
    
    static String momentaneKopie;
    static String schuelerId;
    static int schuelerInKlasse;
    static int schuelerRow;
    static String momentaneKlasse = null;
    static int currentPanel = 1;
    Connection conn = null;
    
    private void UpdateTable(ArrayList<String> data) {
        try{
            conn = DbConnector.getConnection();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        if(currentPanel == 2) {
        String col[] = {"Nachname", "Vorname", "Geburtsdatum"};
        DefaultTableModel schuelerModel = new DefaultTableModel(col, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        for(int i=0; i<= data.size()-4;i=i+4) {
            Object[] obj = {data.get(i+1),data.get(i),data.get(i+2)};
            schuelerModel.addRow(obj);
        }
        schuelerTbl.setModel(schuelerModel);
        }
        
        
        
        if(currentPanel == 3) {
        String col[] = {"Label", "ISBN", "Preis", "Kaufbuch"};
        DefaultTableModel buecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        for(int i=0; i<= data.size()-4; i=i+4) {
            Object[] obj = {data.get(i),data.get(i+1),data.get(i+2),data.get(i+3)};
            buecherModel.addRow(obj);
        }
        buecherTbl.setModel(buecherModel);
        }
        
        
        
        if(currentPanel == 4) {
        String col[] = {"Label", "ISBN"};
        DefaultTableModel buecherKlasseModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        for(int i=0; i<= data.size()-2; i=i+2) {
            Object[] obj = {data.get(i), data.get(i+1)};
            buecherKlasseModel.addRow(obj);
        }
        buecherKlassenTbl.setModel(buecherKlasseModel);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        klassenList = new javax.swing.JList();
        schuelerTblPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schuelerTbl = new javax.swing.JTable();
        klasseExportBtn = new javax.swing.JButton();
        einSchuelerTab = new javax.swing.JPanel();
        schuelerName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        schuelerGeburt = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        schuelerBuecherTbl = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        schuelerKlassenList = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        schuelerZurueckAnzahl = new javax.swing.JLabel();
        schuelerZurueck = new javax.swing.JButton();
        schuelerWeiter = new javax.swing.JButton();
        buecherTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buecherTbl = new javax.swing.JTable();
        einBuchTab = new javax.swing.JPanel();
        einBuchLabel = new javax.swing.JLabel();
        einBuchISBNL = new javax.swing.JLabel();
        einBuchISBN = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        einBuchKauf = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        einBuchPreis = new javax.swing.JLabel();
        isbnSuche = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        labelSuche = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        einKopieTab = new javax.swing.JPanel();
        eineKopieSuchen = new javax.swing.JTextField();
        kopieLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kopieFore = new javax.swing.JLabel();
        kopieSur = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kopieDistributed = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kopieBought = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kopiePaid = new javax.swing.JLabel();
        kopieEinsammeln = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        klassenTab = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        buchKlassenList = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        buecherKlassenTbl = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGroup(homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeTabLayout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeTabLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schuelerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(freieBuecher, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(236, 236, 236))
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
                .addContainerGap(334, Short.MAX_VALUE))
        );

        basePanel.addTab("Home", homeTab);

        schuelerTab.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        schuelerTab.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                schuelerTabComponentAdded(evt);
            }
        });

        klassenList.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        klassenList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klassenListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(klassenList);

        schuelerTbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
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
        schuelerTbl.setDragEnabled(true);
        schuelerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schuelerTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(schuelerTbl);

        javax.swing.GroupLayout schuelerTblPanelLayout = new javax.swing.GroupLayout(schuelerTblPanel);
        schuelerTblPanel.setLayout(schuelerTblPanelLayout);
        schuelerTblPanelLayout.setHorizontalGroup(
            schuelerTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        schuelerTblPanelLayout.setVerticalGroup(
            schuelerTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerTblPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        klasseExportBtn.setText("Klasse als PDF Exportieren");
        klasseExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klasseExportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout schuelerTabLayout = new javax.swing.GroupLayout(schuelerTab);
        schuelerTab.setLayout(schuelerTabLayout);
        schuelerTabLayout.setHorizontalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schuelerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(schuelerTblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(schuelerTabLayout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(klasseExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        schuelerTabLayout.setVerticalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(schuelerTblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(schuelerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addGap(18, 18, 18)
                .addComponent(klasseExportBtn)
                .addContainerGap())
        );

        basePanel.addTab("Schüler", schuelerTab);

        schuelerName.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        schuelerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schuelerName.setText("Name");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setText("Geburtsdatum:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("Klassen:");

        schuelerGeburt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        schuelerGeburt.setText("-----");

        schuelerBuecherTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(schuelerBuecherTbl);

        schuelerKlassenList.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        schuelerKlassenList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-----" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(schuelerKlassenList);

        jButton2.setText("Export als PDF");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setText("Zurück zu geben:");

        schuelerZurueckAnzahl.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        schuelerZurueckAnzahl.setText("-----");

        schuelerZurueck.setText("<<<");
        schuelerZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schuelerZurueckActionPerformed(evt);
            }
        });

        schuelerWeiter.setText(">>>");
        schuelerWeiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schuelerWeiterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout einSchuelerTabLayout = new javax.swing.GroupLayout(einSchuelerTab);
        einSchuelerTab.setLayout(einSchuelerTabLayout);
        einSchuelerTabLayout.setHorizontalGroup(
            einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einSchuelerTabLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(188, 188, 188)
                        .addComponent(schuelerZurueckAnzahl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schuelerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einSchuelerTabLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(schuelerGeburt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(einSchuelerTabLayout.createSequentialGroup()
                                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(schuelerZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jScrollPane5))
                                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schuelerWeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(einSchuelerTabLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        einSchuelerTabLayout.setVerticalGroup(
            einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einSchuelerTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                        .addComponent(schuelerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schuelerGeburt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schuelerZurueckAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(103, 103, 103)
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schuelerZurueck)
                            .addComponent(schuelerWeiter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
        );

        basePanel.addTab("Einzelner Schueler", einSchuelerTab);

        buecherTab.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                buecherTabComponentAdded(evt);
            }
        });

        buecherTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        buecherTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buecherTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(buecherTbl);

        javax.swing.GroupLayout buecherTabLayout = new javax.swing.GroupLayout(buecherTab);
        buecherTab.setLayout(buecherTabLayout);
        buecherTabLayout.setHorizontalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        buecherTabLayout.setVerticalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );

        basePanel.addTab("Bücher", buecherTab);

        einBuchLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        einBuchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        einBuchLabel.setText("- - - - -");

        einBuchISBNL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchISBNL.setText("ISBN:");

        einBuchISBN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchISBN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Kaufbuch:");

        einBuchKauf.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchKauf.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("Preis:");

        einBuchPreis.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchPreis.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        isbnSuche.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        isbnSuche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnSucheActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("Nach ISBN suchen");

        labelSuche.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelSuche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelSucheActionPerformed(evt);
            }
        });

        jLabel17.setText("Nach Buchlabel suchen");

        javax.swing.GroupLayout einBuchTabLayout = new javax.swing.GroupLayout(einBuchTab);
        einBuchTab.setLayout(einBuchTabLayout);
        einBuchTabLayout.setHorizontalGroup(
            einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einBuchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(einBuchTabLayout.createSequentialGroup()
                        .addComponent(labelSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(einBuchTabLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(einBuchPreis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(einBuchTabLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(einBuchKauf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(einBuchTabLayout.createSequentialGroup()
                                .addComponent(einBuchISBNL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(einBuchISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(einBuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(isbnSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)))
        );
        einBuchTabLayout.setVerticalGroup(
            einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einBuchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isbnSuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(einBuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(45, 45, 45)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(einBuchISBNL)
                    .addComponent(einBuchISBN))
                .addGap(50, 50, 50)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(einBuchKauf))
                .addGap(50, 50, 50)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(einBuchPreis))
                .addContainerGap())
        );

        basePanel.addTab("Einzelnes Buch", einBuchTab);

        eineKopieSuchen.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        eineKopieSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eineKopieSuchenActionPerformed(evt);
            }
        });

        kopieLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        kopieLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kopieLabel.setText("---");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Ausgegeben an:");

        kopieFore.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kopieFore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel9.setText("Ausgegeben am:");

        kopieDistributed.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kopieDistributed.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setText("Gekauft:");

        kopieBought.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kopieBought.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("Bezahlt:");

        kopiePaid.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kopiePaid.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        kopieEinsammeln.setText("Einsammeln");
        kopieEinsammeln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kopieEinsammelnMouseClicked(evt);
            }
        });
        kopieEinsammeln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopieEinsammelnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel15.setText("Nach Kopie suchen");

        javax.swing.GroupLayout einKopieTabLayout = new javax.swing.GroupLayout(einKopieTab);
        einKopieTab.setLayout(einKopieTabLayout);
        einKopieTabLayout.setHorizontalGroup(
            einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einKopieTabLayout.createSequentialGroup()
                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(einKopieTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eineKopieSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(einKopieTabLayout.createSequentialGroup()
                        .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, einKopieTabLayout.createSequentialGroup()
                                .addGap(475, 475, 475)
                                .addComponent(kopieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, einKopieTabLayout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(360, 360, 360)
                                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kopieDistributed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kopieFore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kopieBought, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(einKopieTabLayout.createSequentialGroup()
                                        .addComponent(kopiePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kopieSur, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(einKopieTabLayout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(kopieEinsammeln, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(einKopieTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        einKopieTabLayout.setVerticalGroup(
            einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einKopieTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eineKopieSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addGap(1, 1, 1)
                .addComponent(kopieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kopieFore, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kopieSur, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(kopieDistributed, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(kopieBought, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(einKopieTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(kopiePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(kopieEinsammeln, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );

        basePanel.addTab("Einzelne Kopie", einKopieTab);

        klassenTab.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                klassenTabComponentAdded(evt);
            }
        });

        buchKlassenList.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        buchKlassenList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buchKlassenListMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(buchKlassenList);

        buecherKlassenTbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buecherKlassenTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        buecherKlassenTbl.setDragEnabled(true);
        buecherKlassenTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buecherKlassenTblMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(buecherKlassenTbl);

        javax.swing.GroupLayout klassenTabLayout = new javax.swing.GroupLayout(klassenTab);
        klassenTab.setLayout(klassenTabLayout);
        klassenTabLayout.setHorizontalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(klassenTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                .addContainerGap())
        );
        klassenTabLayout.setVerticalGroup(
            klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, klassenTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(klassenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, klassenTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6))
                .addGap(72, 72, 72))
        );

        basePanel.addTab("Klassen", klassenTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schuelerTabComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_schuelerTabComponentAdded
        ArrayList<String> ids = new ArrayList();
        ids = Classes.getClassIDs();
        ArrayList<String> names = new ArrayList<>();
        for(String s: ids) {
            names.add(Classes.getClassName(s));
        }
        klassenList.setListData(names.toArray());
    }//GEN-LAST:event_schuelerTabComponentAdded

    private void klassenListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klassenListMouseClicked
        currentPanel = 2;
        int index = klassenList.locationToIndex(evt.getPoint());
        ListModel dlm = klassenList.getModel();
        Object item = dlm.getElementAt(index);
        momentaneKlasse = item.toString();
        klassenList.ensureIndexIsVisible(index);
        ArrayList<String> klasse = Classes.classList(momentaneKlasse);
        UpdateTable(klasse);
        schuelerInKlasse = klasse.size()/4;
    }//GEN-LAST:event_klassenListMouseClicked

    private void schuelerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schuelerTblMouseClicked
        schuelerRow = schuelerTbl.getSelectedRow();
        ArrayList<String> data = Classes.classList(momentaneKlasse);
        schuelerId = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(schuelerId, 1) +" " +Students.SingelStudent(schuelerId, 2));
        schuelerGeburt.setText(Students.SingelStudent(schuelerId, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(schuelerId));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(schuelerId).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(schuelerId);
        
        for(int i=0; i<= buecher.size()-4; i=i+4) {
            Object[] obj = {buecher.get(i),buecher.get(i+1),Date.ToNormal(buecher.get(i+2)),buecher.get(i+3)};
            schuelerBuecherModel.addRow(obj);
        }
        schuelerBuecherTbl.setModel(schuelerBuecherModel);  
        
        if(evt.getClickCount()==2) {
            basePanel.setSelectedIndex(2);
        }
        
       
        if(schuelerRow == 0)
        schuelerZurueck.setVisible(false);
        else {
        schuelerZurueck.setVisible(true);
        }
        
        if(schuelerRow == schuelerInKlasse -1)
        schuelerWeiter.setVisible(false);
        else{
        schuelerWeiter.setVisible(true);
        }
        
    }//GEN-LAST:event_schuelerTblMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        PDF_Export.studentPDF(schuelerId,this);
        try {
            PDF_Export.openPDF();
        } catch (IOException ex) {
            Logger.getLogger(Oberflaeche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void schuelerWeiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schuelerWeiterActionPerformed
        if(schuelerRow == 0){
            schuelerZurueck.setVisible(true);
        }
        
        schuelerRow = schuelerRow +1;
        ArrayList<String> data = Classes.classList(momentaneKlasse);
        schuelerId = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(schuelerId, 1) +" " +Students.SingelStudent(schuelerId, 2));
        schuelerGeburt.setText(Students.SingelStudent(schuelerId, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(schuelerId));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(schuelerId).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(schuelerId);
        
        for(int i=0; i<= buecher.size()-4; i=i+4) {
            Object[] obj = {buecher.get(i),buecher.get(i+1),Date.ToNormal(buecher.get(i+2)),buecher.get(i+3)};
            schuelerBuecherModel.addRow(obj);
        }
        schuelerBuecherTbl.setModel(schuelerBuecherModel);  
       
        if(schuelerRow == schuelerInKlasse -1){
        schuelerWeiter.setVisible(false);
        }
    }//GEN-LAST:event_schuelerWeiterActionPerformed

    private void schuelerZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schuelerZurueckActionPerformed
        if(schuelerRow == schuelerInKlasse -1){
            schuelerWeiter.setVisible(true);
        }
        
        schuelerRow = schuelerRow -1;
        ArrayList<String> data = Classes.classList(momentaneKlasse);
        schuelerId = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(schuelerId, 1) +" " +Students.SingelStudent(schuelerId, 2));
        schuelerGeburt.setText(Students.SingelStudent(schuelerId, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(schuelerId));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(schuelerId).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(schuelerId);
        
        for(int i=0; i<= buecher.size()-4; i=i+4) {
            Object[] obj = {buecher.get(i),buecher.get(i+1),Date.ToNormal(buecher.get(i+2)),buecher.get(i+3)};
            schuelerBuecherModel.addRow(obj);
        }
        schuelerBuecherTbl.setModel(schuelerBuecherModel);  
        
        if(schuelerRow == 0){
        schuelerZurueck.setVisible(false);
        }
    }//GEN-LAST:event_schuelerZurueckActionPerformed

    private void buecherTabComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_buecherTabComponentAdded
        currentPanel = 3;
        UpdateTable(Books.BookList());
    }//GEN-LAST:event_buecherTabComponentAdded

    private void buchKlassenListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buchKlassenListMouseClicked
        currentPanel = 4;
        int index = buchKlassenList.locationToIndex(evt.getPoint());
        ListModel dlm = buchKlassenList.getModel();
        Object item = dlm.getElementAt(index);
        String buecherKlasse = item.toString();
        klassenList.ensureIndexIsVisible(index);
        ArrayList<String> buchKlasse = BookGroups.BooksList(buecherKlasse);
        UpdateTable(buchKlasse);
    }//GEN-LAST:event_buchKlassenListMouseClicked

    private void buecherKlassenTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buecherKlassenTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buecherKlassenTblMouseClicked

    private void klassenTabComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_klassenTabComponentAdded
        ArrayList<String> ids = new ArrayList();
        ids = Classes.getClassIDs();
        ArrayList<String> names = new ArrayList<>();
        for(String s: ids) {
            names.add(Classes.getClassName(s));
        }
        buchKlassenList.setListData(names.toArray());
    }//GEN-LAST:event_klassenTabComponentAdded

    private void klasseExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klasseExportBtnActionPerformed
        PDF_Export.studentClassPDF(momentaneKlasse, this);
    }//GEN-LAST:event_klasseExportBtnActionPerformed

    private void eineKopieSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eineKopieSuchenActionPerformed
        momentaneKopie = eineKopieSuchen.getText();
        ArrayList<String> kopie = Copies.Singlecopy(momentaneKopie);
        if(kopie.isEmpty() == true)
            kopieLabel.setText("Nicht ausgeliehen");
        else {
            kopieLabel.setText(kopie.get(0));
            kopieFore.setText(kopie.get(7));
            kopieSur.setText(kopie.get(8));
            kopieDistributed.setText(Date.ToNormal(kopie.get(2)));
            kopieBought.setText(kopie.get(4));
            kopiePaid.setText(kopie.get(6));
        }
        
        
    }//GEN-LAST:event_eineKopieSuchenActionPerformed

    private void kopieEinsammelnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopieEinsammelnActionPerformed
        
    }//GEN-LAST:event_kopieEinsammelnActionPerformed

    private void kopieEinsammelnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kopieEinsammelnMouseClicked
        Copies.collectCopy(momentaneKopie);
    }//GEN-LAST:event_kopieEinsammelnMouseClicked

    private void isbnSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnSucheActionPerformed
        String buchISBN = isbnSuche.getText();
        if(Books.singleBook(buchISBN,0).isEmpty() == true){
            einBuchLabel.setText("Kein Buch mit dieser ISBN");
        }else{
        einBuchLabel.setText(Books.singleBook(buchISBN,0).get(0));
        einBuchISBN.setText(Books.singleBook(buchISBN,0).get(1));
        einBuchKauf.setText(Books.singleBook(buchISBN,0).get(3));
        einBuchPreis.setText(Books.singleBook(buchISBN,0).get(2));
        }
    }//GEN-LAST:event_isbnSucheActionPerformed

    private void buecherTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buecherTblMouseClicked
        int buecherRow = buecherTbl.getSelectedRow();
        ArrayList<String> data = Books.BookList();
        String buchISBN = data.get(buecherRow *4+1);
        einBuchLabel.setText(Books.singleBook(buchISBN,0).get(0));
        einBuchISBN.setText(Books.singleBook(buchISBN,0).get(1));
        einBuchKauf.setText(Books.singleBook(buchISBN,0).get(3));
        einBuchPreis.setText(Books.singleBook(buchISBN,0).get(2));
        
        if(evt.getClickCount()==2) {
            basePanel.setSelectedIndex(4);
        }
    }//GEN-LAST:event_buecherTblMouseClicked

    private void labelSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelSucheActionPerformed
        String buchLabel = isbnSuche.getText();
        if(Books.singleBook(buchLabel,1).isEmpty() == true){
            einBuchLabel.setText("Kein Buch mir diesem Label");
        }else{
        einBuchLabel.setText(Books.singleBook(buchLabel,1).get(0));
        einBuchISBN.setText(Books.singleBook(buchLabel,1).get(1));
        einBuchKauf.setText(Books.singleBook(buchLabel,1).get(3));
        einBuchPreis.setText(Books.singleBook(buchLabel,1).get(2));
        }
    }//GEN-LAST:event_labelSucheActionPerformed

    
    
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
    public javax.swing.JTabbedPane basePanel;
    public static javax.swing.JList buchKlassenList;
    private javax.swing.JTable buecherKlassenTbl;
    private javax.swing.JPanel buecherTab;
    private javax.swing.JTable buecherTbl;
    private javax.swing.JLabel einBuchISBN;
    private javax.swing.JLabel einBuchISBNL;
    private javax.swing.JLabel einBuchKauf;
    private javax.swing.JLabel einBuchLabel;
    private javax.swing.JLabel einBuchPreis;
    private javax.swing.JPanel einBuchTab;
    private javax.swing.JPanel einKopieTab;
    private javax.swing.JPanel einSchuelerTab;
    private javax.swing.JTextField eineKopieSuchen;
    private javax.swing.JLabel freieBuecher;
    private javax.swing.JPanel homeTab;
    private javax.swing.JTextField isbnSuche;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton klasseExportBtn;
    public static javax.swing.JList klassenList;
    private javax.swing.JPanel klassenTab;
    private javax.swing.JLabel kopieBought;
    private javax.swing.JLabel kopieDistributed;
    private javax.swing.JButton kopieEinsammeln;
    private javax.swing.JLabel kopieFore;
    private javax.swing.JLabel kopieLabel;
    private javax.swing.JLabel kopiePaid;
    private javax.swing.JLabel kopieSur;
    private javax.swing.JTextField labelSuche;
    private javax.swing.JTable schuelerBuecherTbl;
    private javax.swing.JLabel schuelerCount;
    private javax.swing.JLabel schuelerGeburt;
    private javax.swing.JList schuelerKlassenList;
    private javax.swing.JLabel schuelerName;
    public javax.swing.JPanel schuelerTab;
    private javax.swing.JTable schuelerTbl;
    private javax.swing.JPanel schuelerTblPanel;
    private javax.swing.JButton schuelerWeiter;
    private javax.swing.JButton schuelerZurueck;
    private javax.swing.JLabel schuelerZurueckAnzahl;
    // End of variables declaration//GEN-END:variables
}
