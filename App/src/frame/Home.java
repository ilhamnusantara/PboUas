/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Controller.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author khoirul-06990
 */
public class Home extends java.awt.Frame {

    /**
     * Creates new form baru
     */
    public Home() {
        initComponents();
        ControllerHome.RemovePanel(MainPanel);
        buttonGroupPembelian.add(Mod);
        buttonGroupPembelian.add(Pod);
        buttonGroupPembelian.add(FreeBase);
        buttonGroupPembelian.add(SaltNic);
        ControllerProduk.AddItems();
        IconStore.setIcon(ControllerHome.icon(100, 100));
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPembelian = new javax.swing.ButtonGroup();
        PanelProfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonData = new javax.swing.JButton();
        ButtonPembelian = new javax.swing.JButton();
        IconStore = new javax.swing.JLabel();
        PanelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PanelData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        comboProduk = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        PanelPembelian = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldNamaPembeli = new javax.swing.JTextField();
        Mod = new javax.swing.JRadioButton();
        Pod = new javax.swing.JRadioButton();
        Cmb = new javax.swing.JComboBox<>();
        Jumlah = new javax.swing.JSpinner();
        FreeBase = new javax.swing.JRadioButton();
        SaltNic = new javax.swing.JRadioButton();
        Beli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Cetak = new javax.swing.JButton();
        pembayaran = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Struk = new javax.swing.JTextArea();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        PanelProfil.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setText("Nama Toko");

        ButtonData.setText("Data");
        ButtonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDataActionPerformed(evt);
            }
        });

        ButtonPembelian.setText("Pembelian");
        ButtonPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPembelianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProfilLayout = new javax.swing.GroupLayout(PanelProfil);
        PanelProfil.setLayout(PanelProfilLayout);
        PanelProfilLayout.setHorizontalGroup(
            PanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfilLayout.createSequentialGroup()
                .addGroup(PanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProfilLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(PanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelProfilLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(IconStore)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        PanelProfilLayout.setVerticalGroup(
            PanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfilLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(IconStore)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(ButtonData)
                .addGap(36, 36, 36)
                .addComponent(ButtonPembelian)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Selamat Datang Di Nama Store");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        tblData.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Jenis", "Harga", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel5.setText("Cari Kategori");

        comboProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mod", "Pod", "Liquid FreeBase", "Liquid Saltnic" }));
        comboProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdukActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu Light", 1, 36)); // NOI18N
        jLabel11.setText("LAYANI CLIENT DENGAN SENYUMAN");

        javax.swing.GroupLayout PanelDataLayout = new javax.swing.GroupLayout(PanelData);
        PanelData.setLayout(PanelDataLayout);
        PanelDataLayout.setHorizontalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(comboProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(221, 221, 221))))
        );
        PanelDataLayout.setVerticalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDataLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jLabel7.setText("Kategori");

        jLabel8.setText("Jenis");

        jLabel9.setText("Nama Pembeli");

        jLabel10.setText("Jumlah");

        Mod.setText("Mod");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        Pod.setText("Pod");
        Pod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PodActionPerformed(evt);
            }
        });

        FreeBase.setText("FreeBase");
        FreeBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreeBaseActionPerformed(evt);
            }
        });

        SaltNic.setText("Salt Nic");
        SaltNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaltNicActionPerformed(evt);
            }
        });

        Beli.setText("Beli");
        Beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Jenis Poduk", "Jumlah", "Harga @", "Harga Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        Cetak.setBackground(new java.awt.Color(53, 204, 118));
        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });

        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Pembayaran");

        Struk.setColumns(20);
        Struk.setRows(5);
        jScrollPane3.setViewportView(Struk);

        javax.swing.GroupLayout PanelPembelianLayout = new javax.swing.GroupLayout(PanelPembelian);
        PanelPembelian.setLayout(PanelPembelianLayout);
        PanelPembelianLayout.setHorizontalGroup(
            PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPembelianLayout.createSequentialGroup()
                .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPembelianLayout.createSequentialGroup()
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPembelianLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPembelianLayout.createSequentialGroup()
                                        .addComponent(Mod)
                                        .addGap(30, 30, 30)
                                        .addComponent(Pod)
                                        .addGap(28, 28, 28)
                                        .addComponent(FreeBase)
                                        .addGap(27, 27, 27)
                                        .addComponent(SaltNic))
                                    .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldNamaPembeli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPembelianLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(Beli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(PanelPembelianLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cetak)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPembelianLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        PanelPembelianLayout.setVerticalGroup(
            PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPembelianLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldNamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPembelianLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Mod)
                            .addComponent(Pod)
                            .addComponent(FreeBase)
                            .addComponent(SaltNic))
                        .addGap(25, 25, 25)
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(Beli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(Cetak)
                        .addGap(30, 30, 30))
                    .addGroup(PanelPembelianLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1077, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 801, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
            .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void ButtonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDataActionPerformed
        ControllerHome.RemovePanel(PanelHome);
        ControllerHome.AddPanel(PanelHome, PanelData);
    }//GEN-LAST:event_ButtonDataActionPerformed

    private void ButtonPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPembelianActionPerformed
        ControllerHome.RemovePanel(PanelHome);
        ControllerHome.AddPanel(PanelHome, PanelPembelian);
    }//GEN-LAST:event_ButtonPembelianActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {                                    
        ControllerHome.AddCmb(Cmb, ControllerProduk.getMod());
        Mod.setActionCommand("Mod");
    }                                     
    
    private void PodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PodActionPerformed
        ControllerHome. AddCmb(Cmb, ControllerProduk.getPod());
        Pod.setActionCommand("Pod");
    }//GEN-LAST:event_PodActionPerformed

    private void BeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliActionPerformed
        if((Integer)Jumlah.getValue()>0)
        {
            ControllerPembelian.Add(buttonGroupPembelian.getSelection().getActionCommand(), fieldNamaPembeli.getText(), (String)Cmb.getSelectedItem(), (Integer)Jumlah.getValue());
            ControllerPembelian.AddTablePembelian(Table, pembayaran);
            ControllerHome.addRadioName(buttonGroupPembelian);            
        }
//        ControllerPembelian.Add(buttonGroupPembelian.getSelection().getActionCommand(), fieldNamaPembeli.getText(), (String)Cmb.getSelectedItem(), (Integer)Jumlah.getValue());
//        ControllerPembelian.AddTablePembelian(Table, pembayaran);
//        ControllerHome.addRadioName(buttonGroupPembelian);
    }//GEN-LAST:event_BeliActionPerformed


    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        try{
            ControllerPembelian.StrukPembelian(Struk,pembayaran.getText());
            ControllerHome.update(Table, (Integer)Jumlah.getValue());
        }catch(IndexOutOfBoundsException e)
        {
            JOptionPane.showInternalMessageDialog(Cetak, "Data Masiih Kosong", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println("index di luar jangkauan");
        }
    }//GEN-LAST:event_CetakActionPerformed

    private void FreeBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreeBaseActionPerformed
        ControllerHome.AddCmb(Cmb, ControllerProduk.getFreebase());
        FreeBase.setActionCommand("FreeBase");
    }//GEN-LAST:event_FreeBaseActionPerformed

    private void SaltNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaltNicActionPerformed
        ControllerHome.AddCmb(Cmb, ControllerProduk.getSaltnic());
        SaltNic.setActionCommand("SaltNic");
    }//GEN-LAST:event_SaltNicActionPerformed

    private void comboProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdukActionPerformed

          ControllerHome.addTbl(tblData,(String)comboProduk.getSelectedItem());
        System.out.println((String)comboProduk.getSelectedItem());
    }//GEN-LAST:event_comboProdukActionPerformed

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pembayaranActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beli;
    private javax.swing.JButton ButtonData;
    private javax.swing.JButton ButtonPembelian;
    private javax.swing.JButton Cetak;
    private javax.swing.JComboBox<String> Cmb;
    private javax.swing.JRadioButton FreeBase;
    private javax.swing.JLabel IconStore;
    private javax.swing.JSpinner Jumlah;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton Mod;
    private javax.swing.JPanel PanelData;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelPembelian;
    private javax.swing.JPanel PanelProfil;
    private javax.swing.JRadioButton Pod;
    private javax.swing.JRadioButton SaltNic;
    private javax.swing.JTextArea Struk;
    private javax.swing.JTable Table;
    private javax.swing.ButtonGroup buttonGroupPembelian;
    private javax.swing.JComboBox<String> comboProduk;
    private javax.swing.JTextField fieldNamaPembeli;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
