package projekakhir;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

    
public class homeadmin extends javax.swing.JFrame {
    String fname = null;
    byte[] pimage = null;
    Connection conn;

    public homeadmin() {
        if (!Projekakhir.isLoggedIn) { 
        JOptionPane.showMessageDialog(null, "Anda harus login terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose(); 
        return; 
    }
        initComponents();
        conn = koneksi.getConnection();
        populateJTable();
    }

    public void populateJTable() {
        koneksi mq = new koneksi();
        ArrayList<querynya> list = mq.BindTable();
        String[] columnName = {"ID", "JUDUL", "JUDUL KEDUA", "AUTHOR", "DESKRIPSI", "KATEGORI", "GAMBAR"};
        Object[][] rows = new Object[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getid();
            rows[i][1] = list.get(i).getjudul();
            rows[i][2] = list.get(i).getjudul_kedua();
            rows[i][3] = list.get(i).getauthor();
            rows[i][4] = list.get(i).getdeskripsi();
            rows[i][5] = list.get(i).getkategori();

            if (list.get(i).getMyImage() != null) { 
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
                        .getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                    rows[i][6] = image;
            }else { rows[i][6] = null;
            } 
        }

        themodel model = new themodel(rows, columnName);
        tbdata.setModel(model);
        tbdata.setRowHeight(120);
        tbdata.getColumnModel().getColumn(6).setPreferredWidth(150);     
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfjudul = new javax.swing.JTextField();
        tfjudulkedua = new javax.swing.JTextField();
        tfauthor = new javax.swing.JTextField();
        gambar1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadeskripsi = new javax.swing.JTextArea();
        cbkategori = new javax.swing.JComboBox<>();
        jbupload = new javax.swing.JButton();
        jbtambah = new javax.swing.JButton();
        jbedit = new javax.swing.JButton();
        jbdelete = new javax.swing.JButton();
        jbclear = new javax.swing.JButton();
        jbexit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(244, 218, 219));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WELCOME ADMIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM));

        jPanel2.setBackground(new java.awt.Color(247, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("ID :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setText("JUDUL :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setText("JUDUL KEDUA :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("AUTHOR :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setText("DESKRIPSI :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel8.setText("KATEGORI :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel9.setText("GAMBAR :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));
        jPanel2.add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 30));
        jPanel2.add(tfjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, 30));
        jPanel2.add(tfjudulkedua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 210, 30));
        jPanel2.add(tfauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 30));

        gambar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 190, 190));

        tadeskripsi.setColumns(20);
        tadeskripsi.setRows(5);
        jScrollPane2.setViewportView(tadeskripsi);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 440, 190));

        cbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sejarah", "Nature", "Kuliner", "Lainnya" }));
        jPanel2.add(cbkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 30));

        jbupload.setText("UPLOAD");
        jbupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuploadActionPerformed(evt);
            }
        });
        jPanel2.add(jbupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 80, -1));

        jbtambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtambah.setText("INSERT");
        jbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtambahActionPerformed(evt);
            }
        });
        jPanel2.add(jbtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 30));

        jbedit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbedit.setText("EDIT");
        jbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditActionPerformed(evt);
            }
        });
        jPanel2.add(jbedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, 30));

        jbdelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbdelete.setText("DELETE");
        jbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 210, 30));

        jbclear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbclear.setText("CLEAR");
        jbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclearActionPerformed(evt);
            }
        });
        jPanel2.add(jbclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 200, 30));

        jbexit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbexit.setText("EXIT");
        jbexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexitActionPerformed(evt);
            }
        });
        jPanel2.add(jbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 230, 30));

        jTabbedPane1.addTab("Tambah Artikel", jPanel2);

        jPanel3.setBackground(new java.awt.Color(247, 242, 242));

        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "JUDUL", "JUDUL KEDUA", "AUTHOR", "DESKRIPSI", "KATEGORI", "GAMBAR"
            }
        ));
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbdata);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabel Laporan", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 1090, 480));

        jPanel1.setBackground(new java.awt.Color(221, 210, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/6.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("The Soul of Madura");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexitActionPerformed
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();    }//GEN-LAST:event_jbexitActionPerformed

    private void jbuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuploadActionPerformed
        JFileChooser fchoser = new JFileChooser();
        fchoser.showOpenDialog(null);
        File f = fchoser.getSelectedFile();
        fname = f.getAbsolutePath();
        try {
            File image = new File(fname);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum; (readnum = fis.read(buf)) !=-1;)
            {            
                baos.write(buf,0,readnum);                
            }
            pimage = baos.toByteArray();
            gambar1.setIcon(resizeImage(fname, buf));
        } catch (Exception e) {
        }           }//GEN-LAST:event_jbuploadActionPerformed

    private void jbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtambahActionPerformed
    String judul = tfjudul.getText(); 
    String judul_kedua = tfjudulkedua.getText(); 
    String author = tfauthor.getText(); 
    String deskripsi = tadeskripsi.getText(); 
    String kategori = (String) cbkategori.getSelectedItem(); 
    try {    
         if (judul.isEmpty() || judul_kedua.isEmpty() || author.isEmpty() || deskripsi.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Semua bidang harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
             return;
        }
        if (conn == null || conn.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String q= "INSERT INTO `artikel`(`judul`, `judul_kedua`, `author`, `deskripsi`, `kategori`, `gambar`) VALUES (?,?,?,?,?,?)";               
        PreparedStatement pst = conn.prepareStatement(q);                
        pst.setString(1, judul);
        pst.setString(2, judul_kedua);
        pst.setString(3, author);
        pst.setString(4, deskripsi);
        pst.setString(5, kategori);
        if (pimage == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Image is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pst.setBytes(6, pimage);                
        pst.executeUpdate(); 
        JOptionPane.showMessageDialog(this, "artikel berhasil dibuat");
        populateJTable();
        tfjudul.setText("");
        tfjudulkedua.setText("");
        tadeskripsi.setText("");
        tfauthor.setText("");
        cbkategori.setSelectedItem("-");
        gambar1.setIcon(null);
        
        jbtambah.setEnabled(true);
        jbedit.setEnabled(false);
        jbdelete.setEnabled(false);
    } catch (Exception e) {
        // Tampilkan pesan error
        JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    }//GEN-LAST:event_jbtambahActionPerformed

    private void jbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditActionPerformed
    try {
        if (pimage == null) {
            JOptionPane.showMessageDialog(this, "Gambar harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "UPDATE artikel SET judul = ?, judul_kedua = ?, author = ?, deskripsi = ?, kategori = ?, gambar = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfjudul.getText());
        ps.setString(2, tfjudulkedua.getText());
        ps.setString(3, tfauthor.getText());
        ps.setString(4, tadeskripsi.getText());
        ps.setString(5, (String) cbkategori.getSelectedItem());
        ps.setBytes(6, pimage);
        ps.setInt(7, Integer.parseInt(tfid.getText()));
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Data berhasil diedit");
        
        populateJTable();
        
        // Bersihkan field input setelah penyimpanan berhasil
        tfid.setText("");
        tfjudul.setText("");
        tfjudulkedua.setText("");
        tadeskripsi.setText("");
        tfauthor.setText("");
        cbkategori.setSelectedItem("-");
        gambar1.setIcon(null);
        
        jbtambah.setEnabled(true);
        jbedit.setEnabled(false);
        jbdelete.setEnabled(false);
    } catch (SQLException e) {
        System.out.println("Gagal menyimpan data: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    }//GEN-LAST:event_jbeditActionPerformed

    private void jbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeleteActionPerformed
        try  {
          String sql = "DELETE FROM artikel WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(tfid.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "data berhasil dihapus");
          populateJTable();
          tfid.setText("");
          tfjudul.setText("");
          tfjudulkedua.setText("");
          tadeskripsi.setText("");
          tfauthor.setText("");
          cbkategori.setSelectedItem("-");
          gambar1.setIcon(null);
          
          jbtambah.setEnabled(true);
        jbedit.setEnabled(true);
        jbdelete.setEnabled(true);

     } catch (SQLException e) {
          System.out.println("gagal menyimpan data" + e.getMessage());
      }    }//GEN-LAST:event_jbdeleteActionPerformed

    private void jbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclearActionPerformed
          jbtambah.setEnabled(true);
            jbedit.setEnabled(true);
            jbdelete.setEnabled(true);
          tfid.setText("");
          tfjudul.setText("");
          tfjudulkedua.setText("");
          tadeskripsi.setText("");
          tfauthor.setText("");
          cbkategori.setSelectedItem("-");
          gambar1.setIcon(null);    }//GEN-LAST:event_jbclearActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
      tfid.setText(tbdata.getValueAt(tbdata.getSelectedRow(), 0).toString());
      tfjudul.setText(tbdata.getValueAt(tbdata.getSelectedRow(), 1).toString());
      tfjudulkedua.setText(tbdata.getValueAt(tbdata.getSelectedRow(), 2).toString());
      tfauthor.setText(tbdata.getValueAt(tbdata.getSelectedRow(), 3).toString());
      tadeskripsi.setText(tbdata.getValueAt(tbdata.getSelectedRow(), 4).toString());
      cbkategori.setSelectedItem(tbdata.getValueAt(tbdata.getSelectedRow(), 5).toString());     
      jbtambah.setEnabled(false);
      jbedit.setEnabled(true);
      jbdelete.setEnabled(true);
    }//GEN-LAST:event_tbdataMouseClicked

    public ImageIcon resizeImage(String imagePath, byte[] pic) {
        ImageIcon myImage;

        if (imagePath != null) {
            myImage = new ImageIcon(imagePath);
        } else {
            myImage = new ImageIcon(pic);
        }

        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(gambar1.getWidth(), gambar1.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(img2);
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
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JLabel gambar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbclear;
    private javax.swing.JButton jbdelete;
    private javax.swing.JButton jbedit;
    private javax.swing.JButton jbexit;
    private javax.swing.JButton jbtambah;
    private javax.swing.JButton jbupload;
    private javax.swing.JTextArea tadeskripsi;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField tfauthor;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfjudul;
    private javax.swing.JTextField tfjudulkedua;
    // End of variables declaration//GEN-END:variables
}
