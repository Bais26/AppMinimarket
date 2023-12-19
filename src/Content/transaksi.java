package Content;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    

public class transaksi extends javax.swing.JPanel {

    private Connection c;
    
    public transaksi() {
        initComponents();
        c = Koneksi.getConnection();
        getData();
    }
    
        private void getData() {
            DefaultTableModel model = (DefaultTableModel) TblData.getModel();
            model.setRowCount(0);
            
            try {
            String sql = "SELECT * FROM detail_transaksi";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String namaBarang    = rs.getString("nama_barang");
                String Harga         = rs.getString("harga");
                String qty           = rs.getString("qty");
                String totalHarga    = rs.getString("total_Harga");
                
                Object[] rowData = {namaBarang,Harga,qty,totalHarga};
                model.addRow(rowData);
                
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T_totalH = new javax.swing.JTextField();
        T_Tunai = new javax.swing.JTextField();
        T_Kembalian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        T_Scan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        T_qty = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("PENJUALAN BARANG");

        TblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Deskripsi", "Harga", "Qty", "TotalHarga"
            }
        ));
        jScrollPane1.setViewportView(TblData);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setText("TOTAL HARGA");

        jLabel3.setText("TUNAI");

        jLabel4.setText("KEMBALIAN");

        T_totalH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_totalHActionPerformed(evt);
            }
        });

        T_Tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_TunaiActionPerformed(evt);
            }
        });

        T_Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_KembalianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(T_totalH))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(T_Tunai, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(T_Kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(T_totalH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(T_Tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(T_Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Scan");

        T_Scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_ScanActionPerformed(evt);
            }
        });

        jLabel6.setText("Qty");

        T_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_qtyActionPerformed(evt);
            }
        });

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnreset))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T_Scan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(T_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(T_Scan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(T_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnreset))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void T_totalHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_totalHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_totalHActionPerformed

    private void T_TunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_TunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_TunaiActionPerformed

    private void T_KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_KembalianActionPerformed

    private void T_ScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_ScanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_ScanActionPerformed

    private void T_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_qtyActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        DefaultTableModel model = (DefaultTableModel) TblData.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String Barcode = T_Scan.getText();
        int quantity = Integer.parseInt(T_qty.getText());
    
    if (Barcode.isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua kolom harus di isi","Peringatan!!", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Lakukan pencarian barang berdasarkan kode
        String sql = "SELECT * FROM Barang WHERE Kode_Barcode = ?";
        PreparedStatement st = c.prepareStatement(sql);
        st.setString(1, Barcode);
        ResultSet rs = st.executeQuery();
        
        // Jika barang ditemukan, simpan transaksi ke Detail Transaksi dan update stok barang
        if (rs.next()) {
            String namaBarang = rs.getString("Nama_Barang");
            int hargaBarang = rs.getInt("Harga");
            int stokSekarang = rs.getInt("Stok");
            DefaultTableModel model = (DefaultTableModel) TblData.getModel();
            
            if (stokSekarang >= quantity) { // Pastikan stok mencukupi untuk transaksi
                int totalHarga = hargaBarang * quantity;

                String sqlTrans = "INSERT INTO detail_transaksi (nama_barang, qty, total_harga, harga, tanggal_transaksi) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = c.prepareStatement(sqlTrans);
                
                ps.setString(1, namaBarang);
                ps.setInt(2, quantity);
                ps.setInt(3, totalHarga);
                ps.setInt(4, hargaBarang);
                ps.setDate(5, new java.sql.Date(System.currentTimeMillis())); // Contoh: Menggunakan tanggal saat ini

                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    // Update stok barang setelah transaksi
                    String updateStok = "UPDATE Barang SET Stok = ? WHERE Kode_Barcode = ?";
                    PreparedStatement stUpdate = c.prepareStatement(updateStok);
                    stUpdate.setInt(1, stokSekarang - quantity);
                    stUpdate.setString(2, Barcode);
                    stUpdate.executeUpdate();

                    ResetForm();
                    getData();
                }
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Stok tidak mencukupi untuk transaksi ini.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Barang tidak ditemukan.");
        }
        rs.close();
        st.close();
    } catch (Exception e) {
       Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE,null, e);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T_Kembalian;
    private javax.swing.JTextField T_Scan;
    private javax.swing.JTextField T_Tunai;
    private javax.swing.JTextField T_qty;
    private javax.swing.JTextField T_totalH;
    private javax.swing.JTable TblData;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void ResetForm() {
    T_Scan.setText("");
    T_qty.setText("");
    }


}
