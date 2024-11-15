package projekakhir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/db_projekakhir";
        private static final String USER = "root";
        private static final String PASS = "";
        public static Connection getConnection() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("terkoneksi");
            } catch (SQLException e) {
                System.out.println("error bang : " + e.getMessage());
            }
            return conn;
        }
        public static void main(String[] args) {
            getConnection();
        }
    
    public ArrayList<querynya> BindTable(){
        ArrayList<querynya> list = new ArrayList<>();
        Connection con = getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `judul`, `judul_kedua`, `author`, `deskripsi`, `kategori`, `gambar` FROM `artikel`");

            querynya p;
            while(rs.next()){
                p = new querynya(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getString("judul_kedua"),
                    rs.getString("author"),
                    rs.getString("deskripsi"),
                    rs.getString("kategori"),
                    rs.getBytes("gambar")
                );
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Menutup resources
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
