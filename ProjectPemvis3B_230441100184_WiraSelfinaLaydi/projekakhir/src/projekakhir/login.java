package projekakhir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        jtpw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        tblogin = new javax.swing.JButton();
        tbregister = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 156, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Please Insert Your Username & Password!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("USERNAME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 20));

        tfusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel1.add(tfusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 40));

        jtpw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel1.add(jtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 270, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("PASSWORD :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        tblogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblogin.setText("LOGIN");
        tblogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbloginActionPerformed(evt);
            }
        });
        jPanel1.add(tblogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 80, 40));

        tbregister.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tbregister.setText("REGISTER");
        tbregister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbregisterActionPerformed(evt);
            }
        });
        jPanel1.add(tbregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 80, -1));

        showpassword.setText("Show Password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 540));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("don't have an account?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbloginActionPerformed
        String username, password, confirm_password, query, fname = null, passDb = null;
        String username_admin = "admin";
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/db_projekakhir";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if ("".equals(tfusername.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "username  is require", "Error",
                        JOptionPane.ERROR_MESSAGE);              
                
            } else if ("".equals(jtpw.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                username = tfusername.getText();
                password = jtpw.getText();

                query = "SELECT * FROM login WHERE username= '" + username + "'";

                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    passDb = rs.getString("password");
                    notFound = 1;
                }
                    

                    // Load the current user's information in the HomeFrame
                    this.dispose();
                if (notFound == 1 && password.equals(passDb)) {
                     Projekakhir.isLoggedIn = true;
                     if (username_admin.equalsIgnoreCase(tfusername.getText()) ) { 
                        homeadmin AdminFrame = new homeadmin();
                        AdminFrame.setVisible(true); 
                        AdminFrame.pack();
                        AdminFrame.setLocationRelativeTo(null); 
                        this.dispose(); 
                    }else{
                    homeuser HomeFrame = new homeuser();
                    HomeFrame.setVisible(true);
                    HomeFrame.pack();
                    HomeFrame.setLocationRelativeTo(null);
                    HomeFrame.loadCurrentUser(username);

                    this.dispose();
                     }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect username or password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    login LoginFrame = new login();
                    LoginFrame.setVisible(true);
                    LoginFrame.pack();
                    LoginFrame.setLocationRelativeTo(null); 
                    this.dispose();
                }
                jtpw.setText("");

            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }


    }//GEN-LAST:event_tbloginActionPerformed

    private void tbregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbregisterActionPerformed
        register registerFrame = new register();
        registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        this.dispose();    }//GEN-LAST:event_tbregisterActionPerformed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        if(showpassword.isSelected()){
            jtpw.setEchoChar((char)0);
        }   else{
            jtpw.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jtpw;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JButton tblogin;
    private javax.swing.JButton tbregister;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
