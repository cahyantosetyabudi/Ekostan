/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.adsi.ekostan;

import id.ac.unikom.adsi.ekostan.dao.PenyewaDAO;
import id.ac.unikom.adsi.ekostan.daoimpl.PenyewaDAOImpl;
import id.ac.unikom.adsi.ekostan.entity.Penyewa;
import id.ac.unikom.adsi.ekostan.tablemodel.PenyewaTM;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zmart D3viL
 */
public class FormCariPenyewa extends javax.swing.JFrame {

    /**
     * Creates new form FormCariPenyewa
     */
    
    private Penyewa penyewa;
    private ArrayList<Penyewa> arrayPenyewa;
    
    public Penyewa getPenyewa() {
        return penyewa;
    }
    
    public FormCariPenyewa() {
        initComponents();
        refreshData();
    }
    
    private void getData(String nama) {
        PenyewaDAO penyewaDAO = new PenyewaDAOImpl();
        arrayPenyewa = penyewaDAO.getPenyewa(nama);
        
        PenyewaTM penyewaTM = new PenyewaTM();
        penyewaTM.setArrayPenyewa(arrayPenyewa);
        
        tableAnggota.setModel(penyewaTM);
        
    }
    
    private void refreshData() {
        getData(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPilih2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAnggota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldCari = new javax.swing.JTextField();
        buttonPilih = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonPilih1 = new javax.swing.JButton();
        buttonPilih3 = new javax.swing.JButton();

        buttonPilih2.setText("Tambah Penyewa");
        buttonPilih2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPilih2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAnggota.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePenyewaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAnggota);

        jLabel2.setText("Cari Nama");

        buttonPilih.setText("Hapus");
        buttonPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Penyewa");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        buttonPilih1.setText("Tambah Penyewa");
        buttonPilih1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahPenyewaActionPerformed(evt);
            }
        });

        buttonPilih3.setText("Ubah Penyewa");
        buttonPilih3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPilih3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(497, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(buttonPilih1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPilih3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPilih1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPilih3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(buttonPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePenyewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePenyewaMouseClicked
        int baris = tableAnggota.getSelectedRow();
        penyewa = arrayPenyewa.get(baris);
    }//GEN-LAST:event_tablePenyewaMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed

        int baris = tableAnggota.getSelectedRow();
        penyewa = arrayPenyewa.get(baris);
        PenyewaDAO penyewaDAO = new PenyewaDAOImpl();

        if (baris >= 0) {
            int p = JOptionPane.showConfirmDialog(this, "Anda yakin ingin "
                    + "menghapus penyewa " + penyewa.getNamaPenyewa(), "Hapus Penyewa", JOptionPane.YES_NO_OPTION);
            if (p == JOptionPane.YES_OPTION) {
                boolean berhasil = penyewaDAO.delete(penyewa.getIdPenyewa());
                if (berhasil) {
                    JOptionPane.showMessageDialog(this, "Penyewa Berhasil Di Hapus");
                    getData(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Penyewa Gagal Di Hapus");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Penyewa Yang Akan Di Hapus");
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        //Ambil Namanya
        String nama = fieldCari.getText();
        
        //Validasi nama jangan lupa dilengkapi
        
        //Proses Pencarian
        getData(nama);
    }//GEN-LAST:event_buttonCariActionPerformed

    private void tambahPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahPenyewaActionPerformed
        // TODO add your handling code here:
        FormTambahPenyewa formTambahPenyewa = new FormTambahPenyewa();
        formTambahPenyewa.setLocationRelativeTo(null);
        formTambahPenyewa.setVisible(true);
    }//GEN-LAST:event_tambahPenyewaActionPerformed

    private void buttonPilih2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPilih2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPilih2ActionPerformed

    private void buttonPilih3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPilih3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPilih3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormCariPenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCariPenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCariPenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCariPenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCariPenyewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPilih;
    private javax.swing.JButton buttonPilih1;
    private javax.swing.JButton buttonPilih2;
    private javax.swing.JButton buttonPilih3;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAnggota;
    // End of variables declaration//GEN-END:variables
}
