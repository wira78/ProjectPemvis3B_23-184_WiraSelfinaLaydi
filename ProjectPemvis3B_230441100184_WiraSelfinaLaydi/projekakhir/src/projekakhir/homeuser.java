package projekakhir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


public class homeuser extends javax.swing.JFrame {
    
    Connection conn;
    private DefaultListModel listModel;
    public homeuser() {
        
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
        listModel = new DefaultListModel<>(); // Inisialisasi listModel
        jljudul.setModel(listModel);
        loadlistartikel();
        }
    
   private void loadlistartikel() {
       listModel.clear();
    try (PreparedStatement ps = conn.prepareStatement("SELECT judul FROM artikel");
         ResultSet rs = ps.executeQuery()) {
        
        while (rs.next()) {
            String tampilan = String.format("%s",
                    rs.getString("judul"));
            listModel.addElement(tampilan);
        }
    } catch (SQLException e) {
        System.out.println("Tidak bisa memuat data artikel: " + e.getMessage());
    }  
}
   
    void loadCurrentUser(String currentUsername) {
    String sql = "SELECT username FROM login WHERE username = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, currentUsername);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String username = rs.getString("username");
            opening.setText("WELCOME TO OUR WEBSITE " + username);
        } else {
            System.out.println("User not found");
        }
    } catch (SQLException e) {
        System.out.println("Tidak bisa memuat data username: " + e.getMessage());
    }
}  
   
  private void tampilanartikel(String judul) {
    String sql = "SELECT judul, judul_kedua, gambar, kategori, author, deskripsi FROM artikel WHERE judul = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, judul);

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String judul_kedua = rs.getString("judul_kedua");
                byte[] gambar = rs.getBytes("gambar");
                String kategori = rs.getString("kategori");
                String author = rs.getString("author");
                String deskripsi = rs.getString("deskripsi");

                jjudul.setText(judul);
                jjudulkedua.setText(judul_kedua);
                gambarnya.setIcon(resizeImage(gambar)); // Perbaiki pemanggilan resizeImage
                jkategori.setText(kategori+ " ,");
                jauthor.setText(author);
                jdeskripsi.setText(StrToHtml(deskripsi));
            }
        }
    } catch (SQLException e) {
        System.out.println("Tidak bisa memuat data artikel: " + e.getMessage());
    }
}
public String StrToHtml(String deskripsi){
    return "<html><p>" + deskripsi + "</p></html>";
}
public ImageIcon resizeImage(byte[] pic) {
    ImageIcon myImage = new ImageIcon(pic);
    Image img = myImage.getImage();
    Image img2 = img.getScaledInstance(gambarnya.getWidth(), gambarnya.getHeight(), Image.SCALE_SMOOTH);
    return new ImageIcon(img2);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        opening = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jljudul = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        artikelPanel = new javax.swing.JPanel();
        gambarnya = new javax.swing.JLabel();
        jjudul = new javax.swing.JLabel();
        jjudulkedua = new javax.swing.JLabel();
        jkategori = new javax.swing.JLabel();
        jauthor = new javax.swing.JLabel();
        jdeskripsi = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(243, 175, 175));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(254, 243, 243));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opening.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        opening.setText("WELCOME TO OUR WEBSITE USER");
        jPanel2.add(opening, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel5.setText("CARI REKOMENDASI TEMPAT WISATA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 520, 20));

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel6.setText("DI KOTA SUMENEP");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/11.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, -1, 270));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/10.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 270, 280));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/9.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 230, 230));

        jPanel6.setBackground(new java.awt.Color(244, 226, 226));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tahukah kalian mengenai Pulau Madura? Pulau Madura atau yang");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("dikenal sebagai pulau garam karena menjadi produsen garam terbesar");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("di Indonesia ternyata juga kaya akan budaya serta alamnya juga loh!");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fun Fact! pulau dengan kadar oksigen tertinggi di dunia ternyata ada ");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("di Madura tepatnya di Gili Iyang Kabupaten Sumenep.");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 450, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 450, 200));

        jTabbedPane1.addTab("HOME", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 241, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jljudul.setBackground(new java.awt.Color(244, 226, 226));
        jljudul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jljudul.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jljudul.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jljudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jljudulMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jljudul);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, 420));

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel15.setText("SEPUTAR MADURA");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        artikelPanel.setBackground(new java.awt.Color(251, 230, 230));
        artikelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gambarnya.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        artikelPanel.add(gambarnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, 190));

        jjudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jjudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jjudul.setText("JUDUL DISINI");
        jjudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        artikelPanel.add(jjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 570, -1));

        jjudulkedua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jjudulkedua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jjudulkedua.setText("JUDUL KEDUA DISINI");
        jjudulkedua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        artikelPanel.add(jjudulkedua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, -1));

        jkategori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jkategori.setText("Kategori");
        artikelPanel.add(jkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, -1));

        jauthor.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jauthor.setText("Authornya");
        artikelPanel.add(jauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jdeskripsi.setText("deskripsi");
        jdeskripsi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jdeskripsi.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jdeskripsi.setNextFocusableComponent(jdeskripsi);
        jdeskripsi.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        artikelPanel.add(jdeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 550, 500));
        jdeskripsi.getAccessibleContext().setAccessibleDescription("");

        jScrollPane3.setViewportView(artikelPanel);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 580, 480));

        jTabbedPane1.addTab("WHAT'S NEW", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 241, 241));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Apa saja sih yang ada di Pulau Madura?");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 630, 10));

        jLabel16.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("MENGENAL LEBIH DALAM TENTANG MADURA");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/13.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 60, 400, 360));

        jPanel7.setBackground(new java.awt.Color(248, 236, 236));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("APAKAH KALIAN MENJADI");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 193, -1));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel25.setText("TERTARIK UNTUK BERKUNJUNG?");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel21.setText("SO GIMANA??");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 260, 120));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 20));

        jPanel8.setBackground(new java.awt.Color(244, 226, 226));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("suatu alasan loh! tapi karena Kabupaten Sumenep menjadi");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Sumenep dijuluki sebagai kota keris bukan tanpa");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 330, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("penghasil keris terbanyak didunia, bahkan UNESCO telah");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 380, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("mengakuinya. Seems interesting right!");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Fun Fact! ");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 380, 150));

        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("jLabel23");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 10));

        jPanel5.setBackground(new java.awt.Color(243, 199, 199));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Last Fun Fact! ");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(" Sumenep memilik 128 pulau, salah satunya ");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("ialah pulau Gili Labak");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("salah satu hidden paradise yang kaya akan pesona bawah");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("lautnya");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30)
                        .addComponent(jLabel32))
                    .addComponent(jLabel29)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel19)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 380, 120));

        jTabbedPane1.addTab("FUN FACT AGAIN!", jPanel4);

        jPanel9.setBackground(new java.awt.Color(254, 243, 243));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(244, 226, 226));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("CONTACT US");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, -1));

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("perusahaan@gmail.com");
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, -1));

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("XXX_X0");
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 20));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("0811-11-12345");
        jPanel11.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 340, 170));

        jPanel10.setBackground(new java.awt.Color(243, 199, 199));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 80, 40));

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel37.setText("THANK YOU!");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/18.png"))); // NOI18N
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 310, 330));

        jTabbedPane1.addTab("CONTACT", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1100, 510));

        jPanel1.setBackground(new java.awt.Color(243, 196, 196));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/6.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("The Soul of Madura");
        jPanel1.add(jLabel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/8.jpg"))); // NOI18N
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jljudulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jljudulMouseClicked
        String selectedItem = jljudul.getSelectedValue();
        tampilanartikel(selectedItem);
    }//GEN-LAST:event_jljudulMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(homeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeuser().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel artikelPanel;
    private javax.swing.JLabel gambarnya;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jauthor;
    private javax.swing.JLabel jdeskripsi;
    private javax.swing.JLabel jjudul;
    private javax.swing.JLabel jjudulkedua;
    private javax.swing.JLabel jkategori;
    private javax.swing.JList<String> jljudul;
    private javax.swing.JLabel opening;
    // End of variables declaration//GEN-END:variables
}
