

package sbv;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Oberflaeche extends javax.swing.JFrame {
    
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
        tabPanel = new javax.swing.JTabbedPane();
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
                .addContainerGap(323, Short.MAX_VALUE))
        );

        tabPanel.addTab("Home", homeTab);

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

        javax.swing.GroupLayout schuelerTabLayout = new javax.swing.GroupLayout(schuelerTab);
        schuelerTab.setLayout(schuelerTabLayout);
        schuelerTabLayout.setHorizontalGroup(
            schuelerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(schuelerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(schuelerTblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(72, 72, 72))
        );

        tabPanel.addTab("Schüler", schuelerTab);

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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
        );

        tabPanel.addTab("Einzelner Schueler", einSchuelerTab);

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
        jScrollPane1.setViewportView(buecherTbl);

        javax.swing.GroupLayout buecherTabLayout = new javax.swing.GroupLayout(buecherTab);
        buecherTab.setLayout(buecherTabLayout);
        buecherTabLayout.setHorizontalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        buecherTabLayout.setVerticalGroup(
            buecherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        tabPanel.addTab("Bücher", buecherTab);

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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
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

        tabPanel.addTab("Klassen", klassenTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String id = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(id, 1) +" " +Students.SingelStudent(id, 2));
        schuelerGeburt.setText(Students.SingelStudent(id, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(id));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(id).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(id);
        
        for(int i=0; i<= buecher.size()-4; i=i+4) {
            Object[] obj = {buecher.get(i),buecher.get(i+1),Date.ToNormal(buecher.get(i+2)),buecher.get(i+3)};
            schuelerBuecherModel.addRow(obj);
        }
        schuelerBuecherTbl.setModel(schuelerBuecherModel);  
        
        if(evt.getClickCount()==2) {
            tabPanel.setSelectedIndex(2);
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
        int row = schuelerTbl.getSelectedRow();
        ArrayList<String> data = Classes.classList(momentaneKlasse);
        String id = data.get(row*4+3);
        PDF_Export.studentPDF(id);
    }//GEN-LAST:event_jButton2MouseClicked

    private void schuelerWeiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schuelerWeiterActionPerformed
        if(schuelerRow == 0){
            schuelerZurueck.setVisible(true);
        }
        
        schuelerRow = schuelerRow +1;
        ArrayList<String> data = Classes.classList(momentaneKlasse);
        String id = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(id, 1) +" " +Students.SingelStudent(id, 2));
        schuelerGeburt.setText(Students.SingelStudent(id, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(id));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(id).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(id);
        
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
        String id = data.get(schuelerRow*4+3);
        schuelerName.setText(Students.SingelStudent(id, 1) +" " +Students.SingelStudent(id, 2));
        schuelerGeburt.setText(Students.SingelStudent(id, 3));
        schuelerZurueckAnzahl.setText(Students.CopiesToReturn(id));
        schuelerKlassenList.setListData(Students.SingelStudentClasses(id).toArray());
        
        String col[] = {"Label", "Gekauft", "Ausgegeben", "Bezahlt"};
        DefaultTableModel schuelerBuecherModel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
        };
        
        ArrayList<String> buecher = Students.BookList(id);
        
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
    public static javax.swing.JList buchKlassenList;
    private javax.swing.JTable buecherKlassenTbl;
    private javax.swing.JPanel buecherTab;
    private javax.swing.JTable buecherTbl;
    private javax.swing.JPanel einSchuelerTab;
    private javax.swing.JLabel freieBuecher;
    private javax.swing.JPanel homeTab;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public static javax.swing.JList klassenList;
    private javax.swing.JPanel klassenTab;
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
    public javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}
