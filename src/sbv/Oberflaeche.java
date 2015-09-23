

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
    static int speichern = 0;
    static int skBearbeiten = 0;
    Connection conn = null;
    
    private void UpdateTable(ArrayList<String> data) {
        
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
        
        
        
        if(currentPanel == 5) {
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
        buecherInKlasseTbl.setModel(buecherKlasseModel);
        }
        
        
        
        if(currentPanel == 6) {
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
        buecherFKlassenTbl.setModel(buecherModel);
        }
    }
    
    public Oberflaeche() {
        initComponents();
        schuelerCount.setText(Home.StudentsCount());
        freieBuecher.setText(Home.CauchtCopyCount());
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
        neuKlasseFeld = new javax.swing.JTextField();
        neuKlasseBtn = new javax.swing.JButton();
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
        jScrollPane8 = new javax.swing.JScrollPane();
        schuelerKlassenListNeu = new javax.swing.JList();
        schuelerKlassenBearbeiten = new javax.swing.JButton();
        ausgebenIDFeld = new javax.swing.JTextField();
        ausgeben = new javax.swing.JButton();
        ausgebenKaufenFeld = new javax.swing.JTextField();
        buecherSchuelerTblAkt = new javax.swing.JButton();
        buecherTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buecherTbl = new javax.swing.JTable();
        buecherTblAkt = new javax.swing.JButton();
        einBuchTab = new javax.swing.JPanel();
        einBuchISBNL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        isbnSuche = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        labelSuche = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        neuKopieBtn = new javax.swing.JButton();
        neuKopieAnzahl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        buchNeu = new javax.swing.JButton();
        buchBearbeiten = new javax.swing.JButton();
        buchLöschen = new javax.swing.JButton();
        einBuchISBNFeld = new javax.swing.JTextField();
        einBuchKaufFeld = new javax.swing.JTextField();
        einBuchPreisFeld = new javax.swing.JTextField();
        einBuchLabelFeld = new javax.swing.JTextField();
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
        kopieLöschen = new javax.swing.JButton();
        klassenTab = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        buchKlassenList = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        buecherKlassenTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        buchKlassenList1 = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        buecherInKlasseTbl = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        buecherFKlassenTbl = new javax.swing.JTable();

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
                        .addGap(300, 300, 300)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schuelerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(freieBuecher, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeTabLayout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(323, Short.MAX_VALUE))
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

        neuKlasseBtn.setText("Hinzufügen");
        neuKlasseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neuKlasseBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout schuelerTabLayout = new javax.swing.GroupLayout(schuelerTab);
        schuelerTab.setLayout(schuelerTabLayout);
        schuelerTabLayout.setHorizontalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(neuKlasseFeld)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(schuelerTabLayout.createSequentialGroup()
                        .addComponent(neuKlasseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(klasseExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(schuelerTblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klasseExportBtn)
                    .addComponent(neuKlasseFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neuKlasseBtn))
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

        schuelerKlassenListNeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schuelerKlassenListNeuMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(schuelerKlassenListNeu);

        schuelerKlassenBearbeiten.setText("Bearbeiten");
        schuelerKlassenBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schuelerKlassenBearbeitenActionPerformed(evt);
            }
        });

        ausgebenIDFeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ausgebenIDFeldActionPerformed(evt);
            }
        });

        ausgeben.setText("Ausgeben");
        ausgeben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ausgebenActionPerformed(evt);
            }
        });

        ausgebenKaufenFeld.setText("0");

        buecherSchuelerTblAkt.setText("Aktualisieren");
        buecherSchuelerTblAkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buecherSchuelerTblAktActionPerformed(evt);
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schuelerWeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(einSchuelerTabLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(schuelerKlassenBearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5))))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(einSchuelerTabLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ausgeben, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ausgebenIDFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einSchuelerTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einSchuelerTabLayout.createSequentialGroup()
                        .addComponent(ausgebenKaufenFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einSchuelerTabLayout.createSequentialGroup()
                        .addComponent(buecherSchuelerTblAkt)
                        .addGap(344, 344, 344))))
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
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schuelerKlassenBearbeiten)
                        .addGap(74, 74, 74)
                        .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schuelerZurueck)
                            .addComponent(schuelerWeiter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buecherSchuelerTblAkt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(einSchuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(ausgebenIDFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ausgeben))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ausgebenKaufenFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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

        buecherTblAkt.setText("Aktualisieren");
        buecherTblAkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buecherTblAktActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buecherTabLayout = new javax.swing.GroupLayout(buecherTab);
        buecherTab.setLayout(buecherTabLayout);
        buecherTabLayout.setHorizontalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buecherTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buecherTblAkt)
                .addGap(601, 601, 601))
        );
        buecherTabLayout.setVerticalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buecherTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buecherTblAkt)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        basePanel.addTab("Bücher", buecherTab);

        einBuchISBNL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchISBNL.setText("ISBN:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Kaufbuch:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("Preis:");

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

        neuKopieBtn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        neuKopieBtn.setText("Neue Kopie erstellen");
        neuKopieBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neuKopieBtnMouseClicked(evt);
            }
        });

        neuKopieAnzahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neuKopieAnzahlActionPerformed(evt);
            }
        });

        jLabel18.setText("Anzahl an neuen Kopien");

        buchNeu.setText("Neues Buch");
        buchNeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buchNeuActionPerformed(evt);
            }
        });

        buchBearbeiten.setText("Buch bearbeiten");
        buchBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buchBearbeitenActionPerformed(evt);
            }
        });

        buchLöschen.setText("Buch löschen");
        buchLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buchLöschenActionPerformed(evt);
            }
        });

        einBuchISBNFeld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchISBNFeld.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        einBuchKaufFeld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchKaufFeld.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        einBuchPreisFeld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchPreisFeld.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        einBuchLabelFeld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        einBuchLabelFeld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        einBuchLabelFeld.setText("- - -");

        javax.swing.GroupLayout einBuchTabLayout = new javax.swing.GroupLayout(einBuchTab);
        einBuchTab.setLayout(einBuchTabLayout);
        einBuchTabLayout.setHorizontalGroup(
            einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einBuchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(einBuchTabLayout.createSequentialGroup()
                        .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(isbnSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(429, 1089, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einBuchTabLayout.createSequentialGroup()
                        .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, einBuchTabLayout.createSequentialGroup()
                                .addComponent(labelSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260)
                                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(einBuchTabLayout.createSequentialGroup()
                                        .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(einBuchISBNL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(einBuchLabelFeld)))
                            .addGroup(einBuchTabLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(einBuchTabLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(neuKopieAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(neuKopieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(einBuchPreisFeld, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(einBuchKaufFeld, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(einBuchISBNFeld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))))
                        .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(einBuchTabLayout.createSequentialGroup()
                                    .addGap(365, 365, 365)
                                    .addComponent(buchNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einBuchTabLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buchBearbeiten)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einBuchTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buchLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
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
                    .addComponent(labelSuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(einBuchLabelFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(41, 41, 41)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(einBuchISBNL)
                    .addComponent(buchNeu)
                    .addComponent(einBuchISBNFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(buchBearbeiten)
                    .addComponent(einBuchKaufFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(buchLöschen)
                    .addComponent(einBuchPreisFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(neuKopieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(einBuchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuKopieAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
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

        kopieLöschen.setText("Löschen");
        kopieLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopieLöschenActionPerformed(evt);
            }
        });

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
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, einKopieTabLayout.createSequentialGroup()
                .addComponent(kopieLöschen)
                .addGap(475, 475, 475))
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
                .addGap(97, 97, 97)
                .addComponent(kopieLöschen)
                .addGap(59, 59, 59))
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

        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        buchKlassenList1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        buchKlassenList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buchKlassenList1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(buchKlassenList1);

        buecherInKlasseTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(buecherInKlasseTbl);

        buecherFKlassenTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(buecherFKlassenTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addGap(61, 61, 61))))
        );

        basePanel.addTab("Klassen Bearbeiten", jPanel1);

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
        buchKlassenList1.setListData(names.toArray());
        schuelerKlassenListNeu.setListData(names.toArray());
        schuelerKlassenListNeu.setEnabled(false);
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
        buchKlassenList1.ensureIndexIsVisible(index);
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

        kopieLabel.setText(kopie.get(0));
            kopieFore.setText(kopie.get(7));
            kopieSur.setText(kopie.get(8));
            kopieDistributed.setText(Date.ToNormal(kopie.get(2)));
            kopieBought.setText(kopie.get(4));
            kopiePaid.setText(kopie.get(6));   
    }//GEN-LAST:event_eineKopieSuchenActionPerformed

    private void kopieEinsammelnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopieEinsammelnActionPerformed
        
    }//GEN-LAST:event_kopieEinsammelnActionPerformed

    private void kopieEinsammelnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kopieEinsammelnMouseClicked
        Copies.collectCopy(momentaneKopie);
        eineKopieSuchen.setText("");
    }//GEN-LAST:event_kopieEinsammelnMouseClicked

    private void isbnSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnSucheActionPerformed
        String buchISBN = isbnSuche.getText();
        if(Books.singleBook(buchISBN,0).isEmpty() == true){
            einBuchLabelFeld.setText("Kein Buch mit dieser ISBN");
            einBuchISBNFeld.setText("");
            einBuchKaufFeld.setText("");
            einBuchPreisFeld.setText("");
        }else{
        einBuchLabelFeld.setText(Books.singleBook(buchISBN,0).get(0));
        einBuchISBNFeld.setText(Books.singleBook(buchISBN,0).get(1));
        einBuchKaufFeld.setText(Books.singleBook(buchISBN,0).get(3));
        einBuchPreisFeld.setText(Books.singleBook(buchISBN,0).get(2));
        }
    }//GEN-LAST:event_isbnSucheActionPerformed

    private void buecherTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buecherTblMouseClicked
        int buecherRow = buecherTbl.getSelectedRow();
        ArrayList<String> data = Books.BookList();
        String buchISBN = data.get(buecherRow *4+1);
        einBuchLabelFeld.setText(Books.singleBook(buchISBN,0).get(0));
        einBuchISBNFeld.setText(Books.singleBook(buchISBN,0).get(1));
        einBuchKaufFeld.setText(Books.singleBook(buchISBN,0).get(3));
        einBuchPreisFeld.setText(Books.singleBook(buchISBN,0).get(2));
        
        if(evt.getClickCount()==2) {
            basePanel.setSelectedIndex(4);
        }
    }//GEN-LAST:event_buecherTblMouseClicked

    private void labelSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelSucheActionPerformed
        String buchLabel = isbnSuche.getText();
        if(Books.singleBook(buchLabel,1).isEmpty() == true){
            einBuchLabelFeld.setText("Kein Buch mir diesem Label");
            einBuchISBNFeld.setText("");
            einBuchKaufFeld.setText("");
            einBuchPreisFeld.setText("");
        }else{
        einBuchLabelFeld.setText(Books.singleBook(buchLabel,1).get(0));
        einBuchISBNFeld.setText(Books.singleBook(buchLabel,1).get(1));
        einBuchKaufFeld.setText(Books.singleBook(buchLabel,1).get(3));
        einBuchPreisFeld.setText(Books.singleBook(buchLabel,1).get(2));
        }
    }//GEN-LAST:event_labelSucheActionPerformed

    private void neuKopieBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neuKopieBtnMouseClicked
        int anz = Integer.parseInt(neuKopieAnzahl.getText());
        int id = Copies.newID();
        if(id == 0){
            neuKopieBtn.setText("Error");
        }else{
            try{
                PDF_Export.barcodePDF(id, anz);
            }catch(Exception e){System.out.println(e + "barcodePDF");} 
            for(int i=0; i<anz; i++){
                Copies.addCopy(Books.singleBook(einBuchISBNFeld.getText(), 0).get(4), id+i);
            }
        }
    }//GEN-LAST:event_neuKopieBtnMouseClicked

    private void neuKopieAnzahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neuKopieAnzahlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neuKopieAnzahlActionPerformed

    private void schuelerKlassenListNeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schuelerKlassenListNeuMouseClicked
        int index = schuelerKlassenListNeu.locationToIndex(evt.getPoint());
        ListModel dlm = schuelerKlassenListNeu.getModel();
        Object item = dlm.getElementAt(index);
        schuelerKlassenListNeu.ensureIndexIsVisible(index);
        Students.addToClass(schuelerId, item.toString());
    }//GEN-LAST:event_schuelerKlassenListNeuMouseClicked

    private void buchNeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buchNeuActionPerformed
        if(speichern == 0){
            einBuchLabelFeld.setText("");
            einBuchISBNFeld.setText("");
            einBuchKaufFeld.setText("");
            einBuchPreisFeld.setText("");
            buchNeu.setText("Speichern");
            buchBearbeiten.setVisible(false);
            buchLöschen.setVisible(false);
            speichern = 1;
        }else{
            Books.newBook(einBuchLabelFeld.getText(), einBuchISBNFeld.getText(), einBuchPreisFeld.getText(), einBuchKaufFeld.getText());
            buchNeu.setText("Neues Buch");
            buchBearbeiten.setVisible(true);
            buchLöschen.setVisible(true);
            speichern = 0;
        }
    }//GEN-LAST:event_buchNeuActionPerformed

    private void buchLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buchLöschenActionPerformed
        
    }//GEN-LAST:event_buchLöschenActionPerformed

    private void buchBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buchBearbeitenActionPerformed
        if(speichern == 0){
            buchBearbeiten.setText("Speichern");
            buchNeu.setVisible(false);
            buchLöschen.setVisible(false);
            speichern = 1;
        }else{
            
            Books.editBook(Books.singleBook(einBuchISBNFeld.getText(),0).get(4),einBuchLabelFeld.getText(), einBuchISBNFeld.getText(), einBuchPreisFeld.getText(), einBuchKaufFeld.getText());
            buchBearbeiten.setText("Buch bearbeiten");
            buchNeu.setVisible(true);
            buchLöschen.setVisible(true);
            speichern = 0;
        }
    }//GEN-LAST:event_buchBearbeitenActionPerformed

    private void schuelerKlassenBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schuelerKlassenBearbeitenActionPerformed
        if(skBearbeiten == 0){
            schuelerKlassenListNeu.setEnabled(true);
            schuelerKlassenBearbeiten.setText("Speichern");
            skBearbeiten = 1;
        }else{
            schuelerKlassenListNeu.setEnabled(false);
            schuelerKlassenBearbeiten.setText("Bearbeiten");
            skBearbeiten = 0;
        }
    }//GEN-LAST:event_schuelerKlassenBearbeitenActionPerformed

    private void ausgebenIDFeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ausgebenIDFeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ausgebenIDFeldActionPerformed

    private void buchKlassenList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buchKlassenList1MouseClicked
        currentPanel = 5;
        int index = buchKlassenList1.locationToIndex(evt.getPoint());
        ListModel dlm = buchKlassenList1.getModel();
        Object item = dlm.getElementAt(index);
        String buecherKlasse = item.toString();
        buchKlassenList1.ensureIndexIsVisible(index);
        ArrayList<String> buchKlasse = BookGroups.BooksList(buecherKlasse);
        UpdateTable(buchKlasse);
    }//GEN-LAST:event_buchKlassenList1MouseClicked

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        currentPanel = 6;
        UpdateTable(Books.BookList());
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void kopieLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopieLöschenActionPerformed
        Copies.deleteCopy(momentaneKopie);
    }//GEN-LAST:event_kopieLöschenActionPerformed

    private void ausgebenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ausgebenActionPerformed
        //Kopie in DB ausgeben
        Copies.distributeCopy(ausgebenIDFeld.getText(), schuelerId, ausgebenKaufenFeld.getText());
        ausgebenIDFeld.setText("");
    }//GEN-LAST:event_ausgebenActionPerformed

    private void buecherSchuelerTblAktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buecherSchuelerTblAktActionPerformed
        //Tabelle auf Oberfläche aktualisieren
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
    }//GEN-LAST:event_buecherSchuelerTblAktActionPerformed

    private void buecherTblAktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buecherTblAktActionPerformed
        currentPanel = 3;
        UpdateTable(Books.BookList());
    }//GEN-LAST:event_buecherTblAktActionPerformed

    private void neuKlasseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neuKlasseBtnMouseClicked
        String klasse = neuKlasseFeld.getText();
        if(klasse.isEmpty()){
           
        }else{
            Classes.newClass(klasse);
        }
    }//GEN-LAST:event_neuKlasseBtnMouseClicked

    
    
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
    private javax.swing.JButton ausgeben;
    private javax.swing.JTextField ausgebenIDFeld;
    private javax.swing.JTextField ausgebenKaufenFeld;
    public javax.swing.JTabbedPane basePanel;
    private javax.swing.JButton buchBearbeiten;
    public static javax.swing.JList buchKlassenList;
    public static javax.swing.JList buchKlassenList1;
    private javax.swing.JButton buchLöschen;
    private javax.swing.JButton buchNeu;
    private javax.swing.JTable buecherFKlassenTbl;
    private javax.swing.JTable buecherInKlasseTbl;
    private javax.swing.JTable buecherKlassenTbl;
    private javax.swing.JButton buecherSchuelerTblAkt;
    private javax.swing.JPanel buecherTab;
    private javax.swing.JTable buecherTbl;
    private javax.swing.JButton buecherTblAkt;
    private javax.swing.JTextField einBuchISBNFeld;
    private javax.swing.JLabel einBuchISBNL;
    private javax.swing.JTextField einBuchKaufFeld;
    private javax.swing.JTextField einBuchLabelFeld;
    private javax.swing.JTextField einBuchPreisFeld;
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
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton klasseExportBtn;
    public static javax.swing.JList klassenList;
    private javax.swing.JPanel klassenTab;
    private javax.swing.JLabel kopieBought;
    private javax.swing.JLabel kopieDistributed;
    private javax.swing.JButton kopieEinsammeln;
    private javax.swing.JLabel kopieFore;
    private javax.swing.JLabel kopieLabel;
    private javax.swing.JButton kopieLöschen;
    private javax.swing.JLabel kopiePaid;
    private javax.swing.JLabel kopieSur;
    private javax.swing.JTextField labelSuche;
    private javax.swing.JButton neuKlasseBtn;
    private javax.swing.JTextField neuKlasseFeld;
    private javax.swing.JTextField neuKopieAnzahl;
    private javax.swing.JButton neuKopieBtn;
    private javax.swing.JTable schuelerBuecherTbl;
    private javax.swing.JLabel schuelerCount;
    private javax.swing.JLabel schuelerGeburt;
    private javax.swing.JButton schuelerKlassenBearbeiten;
    private javax.swing.JList schuelerKlassenList;
    private javax.swing.JList schuelerKlassenListNeu;
    private javax.swing.JLabel schuelerName;
    public javax.swing.JPanel schuelerTab;
    private javax.swing.JTable schuelerTbl;
    private javax.swing.JPanel schuelerTblPanel;
    private javax.swing.JButton schuelerWeiter;
    private javax.swing.JButton schuelerZurueck;
    private javax.swing.JLabel schuelerZurueckAnzahl;
    // End of variables declaration//GEN-END:variables
}
