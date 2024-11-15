/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
public class register extends javax.swing.JFrame {


    public register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtusername = new javax.swing.JTextField();
        jtpw = new javax.swing.JPasswordField();
        jtconfimpw = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        tbregister2 = new javax.swing.JButton();
        tblogin2 = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(640, 580));
        setPreferredSize(new java.awt.Dimension(648, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 156, 156));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Let's Make Your Account!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 630, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("USERNAME :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PASSWORD :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CONFIRM PASSWORD :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 10));

        jtusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel2.add(jtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 350, 40));

        jtpw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel2.add(jtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 350, 40));

        jtconfimpw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel2.add(jtconfimpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 350, 40));

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTER");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, -1));

        tbregister2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbregister2.setText("REGISTER");
        tbregister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbregister2ActionPerformed(evt);
            }
        });
        jPanel2.add(tbregister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 90, 40));

        tblogin2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tblogin2.setText("LOGIN");
        tblogin2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblogin2ActionPerformed(evt);
            }
        });
        jPanel2.add(tblogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 70, -1));

        showpassword.setForeground(new java.awt.Color(51, 51, 51));
        showpassword.setText("Show Password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, 20));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Already Have An Account?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/3.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 460, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblogin2ActionPerformed
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();    }//GEN-LAST:event_tblogin2ActionPerformed

    private void tbregister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbregister2ActionPerformed
        String username, password, confirm_password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/db_projekakhir";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(jtusername.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if("".equals(jtpw.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if("".equals(jtconfimpw.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Confirm Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                username = jtusername.getText(); 
                password = jtpw.getText();
                confirm_password = jtconfimpw.getText();

                if (!password.equals(confirm_password)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Password and Confirm Password do not match", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    query = "INSERT INTO login(username, password, confirm_password)"+
                            "VALUES('"+username+"', '"+password+"', '"+confirm_password+"')";

                    st.execute(query);
                    JOptionPane.showMessageDialog(null, "New account has been created successfully!");
                    login LoginFrame = new login();
                    LoginFrame.setVisible(true);
                    LoginFrame.pack();
                    LoginFrame.setLocationRelativeTo(null); 
                    this.dispose();
                }
            }
        } catch(Exception e){
            System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_tbregister2ActionPerformed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        if(showpassword.isSelected()){
            jtpw.setEchoChar((char)0);
            jtconfimpw.setEchoChar((char)0);
        }   else{
            jtpw.setEchoChar('*');
            jtconfimpw.setEchoChar('*');
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
                
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jtconfimpw;
    private javax.swing.JPasswordField jtpw;
    private javax.swing.JTextField jtusername;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JButton tblogin2;
    private javax.swing.JButton tbregister2;
    // End of variables declaration//GEN-END:variables
}
