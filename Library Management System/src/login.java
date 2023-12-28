
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import javafx.scene.paint.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class login extends javax.swing.JFrame {

    private PreparedStatement pst;

    
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jBtnlogin = new javax.swing.JButton();
        jBtnexit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnreg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("USER NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 130, 30));

        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 298, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 298, -1));

        jBtnlogin.setBackground(new java.awt.Color(204, 204, 255));
        jBtnlogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log in-min.png"))); // NOI18N
        jBtnlogin.setText("Log In");
        jBtnlogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnloginActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 140, 60));

        jBtnexit.setBackground(new java.awt.Color(204, 204, 255));
        jBtnexit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jBtnexit.setText("Exit");
        jBtnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnexitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 150, 60));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -150, -1, -1));

        jBtnreg.setBackground(new java.awt.Color(204, 204, 255));
        jBtnreg.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg.png"))); // NOI18N
        jBtnreg.setText("Register");
        jBtnreg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnregActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 180, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("FORGOT PASSWORD?? CLICK HERE....");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, 380, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib login.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnloginActionPerformed
        
        PreparedStatement st;
        ResultSet rs;
        
        String username= userName.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        
        String query = "SELECT * FROM `register` WHERE `username` = ? AND `password`= ?";
        
        if(userName.getText().equals("")|| jPasswordField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Some fields are empty");
            
        }else{
        try{
                Connection con = ConnectionProvider.getCon();
                st = con.prepareStatement(query);
                
                st.setString(1, username);
                st.setString(2, password);
                
                rs= st.executeQuery();
                
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Successfully LogIn");
                        setVisible(false);
                        new menupage().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Incorrect UserName or Password");
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid");
        }
        }
        
    }//GEN-LAST:event_jBtnloginActionPerformed

    private void jBtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnexitActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void jBtnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnregActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new register().setVisible(true);
    }//GEN-LAST:event_jBtnregActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new forgotpassword().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnexit;
    private javax.swing.JButton jBtnlogin;
    private javax.swing.JButton jBtnreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
