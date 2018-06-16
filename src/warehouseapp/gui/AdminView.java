/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouseapp.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import warehouseapp.CipherPswd;

/**
 *
 * @author proggy
 */
public class AdminView extends javax.swing.JFrame {

    Connection con;
    /**
     * Creates new form AdminView
     */
    public AdminView() {
        initComponents();
        fillListBoxes();
        fillComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        newUser = new javax.swing.JButton();
        deleteUsrBtn = new javax.swing.JButton();
        changePswdBtn = new javax.swing.JButton();
        suspendUsrBtn = new javax.swing.JButton();
        unlockUsrBtn = new javax.swing.JButton();
        messageLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        newUserName = new javax.swing.JTextField();
        newUserRoleCB = new javax.swing.JComboBox<>();
        newUsrSuspeded = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newUserPassword = new javax.swing.JPasswordField();
        changePswdTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userBlockedList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(userList);

        newUser.setText("New User");
        newUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserActionPerformed(evt);
            }
        });

        deleteUsrBtn.setText("Delete User");
        deleteUsrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsrBtnActionPerformed(evt);
            }
        });

        changePswdBtn.setText("Change Password");
        changePswdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePswdBtnActionPerformed(evt);
            }
        });

        suspendUsrBtn.setText("Suspend");
        suspendUsrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendUsrBtnActionPerformed(evt);
            }
        });

        unlockUsrBtn.setText("Unlock");
        unlockUsrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unlockUsrBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("New User");

        newUserRoleCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserRoleCBActionPerformed(evt);
            }
        });

        newUsrSuspeded.setText("Suspended");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Users list");

        jLabel4.setText("Name");

        jLabel5.setText("Password");

        jLabel6.setText("Role");

        changePswdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePswdTxtActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(userBlockedList);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Blocked");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suspendUsrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePswdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteUsrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unlockUsrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePswdTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(newUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(newUserRoleCB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(newUserName))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newUsrSuspeded)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteUsrBtn)
                        .addGap(18, 18, 18)
                        .addComponent(changePswdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changePswdBtn)
                        .addGap(18, 18, 18)
                        .addComponent(suspendUsrBtn)
                        .addGap(18, 18, 18)
                        .addComponent(unlockUsrBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserRoleCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUsrSuspeded)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(newUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserActionPerformed
        
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user","loginuser","loginuser");
            String encPassword = "";
            for(char c:newUserPassword.getPassword()){
                encPassword += c;
            }
            String password = CipherPswd.encodePassword(encPassword);
            
            int usrRole=3;
            switch(newUserRoleCB.getSelectedItem().toString()){
                case "Production":
                    usrRole = 3;
                    break;
                case "Manager":
                    usrRole = 2;
                    break;
                case "Admin":
                    usrRole = 1;
                    break;
            }
            
            boolean isSuspended = (newUsrSuspeded.isSelected()) ? true : false;
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO LOGINUSER.USERS (LOGIN, PASSWORD, \"ROLE\", \"BLOCKED\") \n VALUES (?, ?, ?, ?)");
            
            ps.setString(1, newUserName.getText());
            ps.setString(2, password);
            ps.setInt(3, usrRole);
            ps.setBoolean(4, isSuspended);

            ps.executeUpdate();
            ps.close();
        
            messageLbl.setText("User created");
        
        }catch (SQLIntegrityConstraintViolationException ex){
            messageLbl.setText("User already exist");
        }catch (SQLException ex) {
            messageLbl.setText("Database error, contact administrator");
            //Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }   
        fillListBoxes();
    }//GEN-LAST:event_newUserActionPerformed

    private void newUserRoleCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserRoleCBActionPerformed
        
    }//GEN-LAST:event_newUserRoleCBActionPerformed

    private void deleteUsrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsrBtnActionPerformed
        try {
            if(userList.getSelectedValue() != null){
                String deleteUser = userList.getSelectedValue().toString();

                con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user","loginuser","loginuser");

                PreparedStatement ps = con.prepareStatement("DELETE FROM LOGINUSER.USERS WHERE LOGIN = ?");

                ps.setString(1, deleteUser);

                ps.executeUpdate();
                ps.close();
                messageLbl.setText("User deleted");
            }else
                messageLbl.setText("Select user");
        } catch (SQLException ex) {
            messageLbl.setText("Database error, contact administrator");
            //Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
        fillListBoxes();
    }//GEN-LAST:event_deleteUsrBtnActionPerformed

    private void changePswdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePswdBtnActionPerformed
        try {
            if(userList.getSelectedValue() != null){
                String updateUserPassword = userList.getSelectedValue().toString();
                String encPassword = CipherPswd.encodePassword(changePswdTxt.getText());

                con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user","loginuser","loginuser");

                PreparedStatement ps = con.prepareStatement("UPDATE USERS SET PASSWORD = ? WHERE LOGIN = ?");
                
                ps.setString(1, encPassword);
                ps.setString(2, updateUserPassword);
                
                ps.executeUpdate();
                ps.close();
                messageLbl.setText("Password changed");
            }else
                messageLbl.setText("Select user");
        } catch (SQLException ex) {
            messageLbl.setText("Database error, contact administrator");
            //Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changePswdBtnActionPerformed

    private void suspendUsrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendUsrBtnActionPerformed
        changeSuspensionState(true);   
        //fillListBoxes();
    }//GEN-LAST:event_suspendUsrBtnActionPerformed

    private void unlockUsrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unlockUsrBtnActionPerformed
        changeSuspensionState(false);
        //fillListBoxes();
    }//GEN-LAST:event_unlockUsrBtnActionPerformed

    private void changePswdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePswdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePswdTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }
    
    private void fillListBoxes(){
        // TODO use table instead of list
        String name;
        boolean blocked;
        DefaultListModel usrListMdl = new DefaultListModel();
        DefaultListModel blckdListMdl = new DefaultListModel();
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user","loginuser","loginuser");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT LOGIN, BLOCKED FROM USERS");
            while(rs.next()){
                name = rs.getString(1);
                usrListMdl.addElement(name);
                blocked = rs.getBoolean(2);
                blckdListMdl.addElement(blocked);
            }
            userList.setModel(usrListMdl);
            userBlockedList.setModel(blckdListMdl);
        } catch (SQLException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void fillComboBox(){
        newUserRoleCB.addItem("Production");
        newUserRoleCB.addItem("Manager");
        newUserRoleCB.addItem("Admin");
    }
    
    private void changeSuspensionState(boolean status){
        try {
            //
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user","loginuser","loginuser");
            
            if(userList.getSelectedValue() != null){
                String blockUser = userList.getSelectedValue().toString();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT BLOCKED FROM USERS WHERE LOGIN = '"+blockUser+"'");
                
                while(rs.next()){
                    if(rs.getBoolean(1) && status == true){
                        messageLbl.setText("User is already suspended");
                        return;
                    } 
                    if(!rs.getBoolean(1) && status == false){
                        messageLbl.setText("User is not blocked");
                        return;
                    }
                }
                
                PreparedStatement ps = con.prepareStatement("UPDATE USERS SET BLOCKED = ? WHERE LOGIN = ?");

                ps.setBoolean(1, status);
                ps.setString(2, blockUser);

                ps.executeUpdate();
                ps.close();
                if(status)
                    messageLbl.setText("User blocked");
                else
                    messageLbl.setText("User unlocked");
                
                fillListBoxes();
            }else
                messageLbl.setText("Select user");
                return;
        } catch (SQLException ex) {
            messageLbl.setText("Database error, contact administrator");
            //Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePswdBtn;
    private javax.swing.JTextField changePswdTxt;
    private javax.swing.JButton deleteUsrBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JButton newUser;
    private javax.swing.JTextField newUserName;
    private javax.swing.JPasswordField newUserPassword;
    private javax.swing.JComboBox<String> newUserRoleCB;
    private javax.swing.JCheckBox newUsrSuspeded;
    private javax.swing.JButton suspendUsrBtn;
    private javax.swing.JButton unlockUsrBtn;
    private javax.swing.JList<String> userBlockedList;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}