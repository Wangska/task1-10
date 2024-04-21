/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginandRegister;

import config.dbConnector;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }
    
     public static String email_user, user_name;
    
    public boolean emailcheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM users WHERE username ='"+reguser.getText()+"' AND email ='"+regemail.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                email_user = resultSet.getString("email");  
                if(email_user.equals(regemail.getText())){
                    JOptionPane.showMessageDialog(null, "Email Already exist!");
                    regemail.setText("");
                }
                user_name = resultSet.getString("username");
                if(user_name.equals(reguser.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    reguser.setText("");
                }
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
        }
        
    }
    
    public boolean usercheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM users WHERE username ='"+reguser.getText()+"' AND email ='"+regemail.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                user_name = resultSet.getString("username");
                if(user_name.equals(reguser.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    reguser.setText("");
                }
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
        }
        
    }
    
    public static String passwordHash(String password){
        
        try{
        
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder sb = new StringBuilder();
            
            for(byte b: rbt){
                
                sb.append(String.format("%02x", b));
            
            }
            return sb.toString();
        
        }catch(Exception e){
        
        
        }
        return null;
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        reg_formpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regemail = new javax.swing.JTextField();
        regcontact = new javax.swing.JTextField();
        reguser = new javax.swing.JTextField();
        reglast = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regfirst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        accnt_type = new javax.swing.JComboBox<>();
        jloginbtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        regmid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        regadd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        regconfirmpass = new javax.swing.JPasswordField();
        regpass = new javax.swing.JPasswordField();
        spass2 = new javax.swing.JCheckBox();
        spass1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reg_formpanel.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(740, 490, 140, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contact Number :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 260, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name : ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 100, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(590, 180, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 350, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Have an Account?");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 470, 200, 30);

        regemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemailActionPerformed(evt);
            }
        });
        jPanel3.add(regemail);
        regemail.setBounds(590, 210, 290, 30);

        regcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcontactActionPerformed(evt);
            }
        });
        jPanel3.add(regcontact);
        regcontact.setBounds(30, 290, 270, 30);

        reguser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(reguser);
        reguser.setBounds(30, 380, 270, 30);

        reglast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(reglast);
        reglast.setBounds(30, 130, 270, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name : ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(340, 100, 130, 30);

        regfirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(regfirst);
        regfirst.setBounds(340, 130, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(340, 350, 170, 30);

        accnt_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accnt_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Owner", "Cashier" }));
        jPanel3.add(accnt_type);
        accnt_type.setBounds(590, 290, 290, 30);

        jloginbtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jloginbtn1.setText("Login");
        jloginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(jloginbtn1);
        jloginbtn1.setBounds(150, 510, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Account Type :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(590, 260, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Middle Name : ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(590, 100, 140, 30);

        regmid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(regmid);
        regmid.setBounds(590, 130, 290, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 180, 170, 30);

        regadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaddActionPerformed(evt);
            }
        });
        jPanel3.add(regadd);
        regadd.setBounds(30, 210, 510, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirm Password :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(590, 350, 210, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register Form");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(330, 30, 250, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(340, 260, 150, 30);

        gen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(gen);
        gen.setBounds(340, 290, 200, 30);
        jPanel3.add(regconfirmpass);
        regconfirmpass.setBounds(590, 380, 290, 30);
        jPanel3.add(regpass);
        regpass.setBounds(340, 380, 200, 30);

        spass2.setForeground(new java.awt.Color(255, 255, 255));
        spass2.setText("Show Password");
        spass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spass2ActionPerformed(evt);
            }
        });
        jPanel3.add(spass2);
        spass2.setBounds(770, 420, 140, 23);

        spass1.setForeground(new java.awt.Color(255, 255, 255));
        spass1.setText("Show Password");
        spass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spass1ActionPerformed(evt);
            }
        });
        jPanel3.add(spass1);
        spass1.setBounds(430, 420, 140, 23);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/real.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(-130, 0, 1050, 610);

        reg_formpanel.add(jPanel3);
        jPanel3.setBounds(0, 0, 920, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reg_formpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reg_formpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Register Button
        
        

        if(regfirst.getText().isEmpty() || reglast.getText().isEmpty()
            || regemail.getText().isEmpty() || regcontact.getText().isEmpty()
            || reguser.getText().isEmpty() || regpass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else if(emailcheck()){
            System.out.println("Duplicate Exist!");

        }else if(regcontact.getText().length() != 11 ){
            JOptionPane.showMessageDialog(null, "Contact Number should be 11");
            regcontact.setText("");

        }else if(usercheck()){
            System.out.println("Duplicate Exist!");

        }else if(regpass.getText().length() <8){
            JOptionPane.showMessageDialog(null, "Password Should be 8!");
            regpass.setText("");

        }else if(!regpass.getText().equals(regconfirmpass.getText())){
            JOptionPane.showMessageDialog(null, "Password doesn't Match!");
            regconfirmpass.setText("");
        
        
        }else{
            dbConnector dbc = new dbConnector();
            
            String password = passwordHash(regpass.getText());

            if(dbc.insertData("INSERT INTO users(lastname, firstname, middlename, "
                    + "address, email, contactnumber, gender, account_type, username, password, status)"
                + "Values ('"+reglast.getText()+"', '"+regfirst.getText()+"', "
                        + "'"+regmid.getText()+"', '"+regadd.getText()+"', '"+regemail.getText()+"',"
                + " '"+regcontact.getText()+"', '"+gen.getSelectedItem()+"', "
                        + "'"+accnt_type.getSelectedItem()+"', '"+reguser.getText()+"', '"+password+"',"
                + " 'Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Registration Successfully");
            LoginForm log = new LoginForm();
            log.setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void regemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemailActionPerformed

    private void regcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcontactActionPerformed

    private void jloginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginbtn1ActionPerformed
        // TODO add your handling code here:
        LoginForm ads = new LoginForm();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jloginbtn1ActionPerformed

    private void regaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regaddActionPerformed

    private void spass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spass2ActionPerformed
        // TODO add your handling code here:
        if (spass2.isSelected()){
            regconfirmpass.setEchoChar((char)0);
        }else{
            regconfirmpass.setEchoChar('*');

        }
    }//GEN-LAST:event_spass2ActionPerformed

    private void spass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spass1ActionPerformed
        // TODO add your handling code here:
        
        if (spass1.isSelected()){
            regpass.setEchoChar((char)0);
        }else{
            regpass.setEchoChar('*');

        }
    }//GEN-LAST:event_spass1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accnt_type;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jloginbtn1;
    private javax.swing.JPanel reg_formpanel;
    private javax.swing.JTextField regadd;
    private javax.swing.JPasswordField regconfirmpass;
    private javax.swing.JTextField regcontact;
    private javax.swing.JTextField regemail;
    private javax.swing.JTextField regfirst;
    private javax.swing.JTextField reglast;
    private javax.swing.JTextField regmid;
    private javax.swing.JPasswordField regpass;
    private javax.swing.JTextField reguser;
    private javax.swing.JCheckBox spass1;
    private javax.swing.JCheckBox spass2;
    // End of variables declaration//GEN-END:variables
}
