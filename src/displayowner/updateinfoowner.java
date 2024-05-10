/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayowner;

import displayadmin.*;
import AdminforApproving.Admindash;
import displayuserinfo.*;
import Cashier.CashierDash;
import Owner.OwnerDash;
import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class updateinfoowner extends javax.swing.JFrame {

    /**
     * Creates new form updateinfo
     */
    public updateinfoowner() {
        initComponents();
    }
    
    public void getData(String id){
     
         dbConnector dbc = new dbConnector();
         
         try{
             
             String query = "SELECT * FROM users WHERE id ='"+id+"' ";
             ResultSet rs = dbc.getData(query);
              if(rs.next()){

                 session sess = session.getInstance(); 
                 
                 sess.setId(rs.getInt("id"));
                 sess.setLast(rs.getString("lastname"));
                 sess.setFirst(rs.getString("firstname"));
                 sess.setMiddle(rs.getString("middlename"));
                 sess.setAdds(rs.getString("address"));
                 sess.setContac(rs.getString("contactnumber"));
                 sess.setEmail_add(rs.getString("email"));
                 sess.setGender_m(rs.getString("gender"));
         
              }
         
         
         }catch(Exception e){
         
         
         }
         
     
     
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reglast = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regfirst = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        regmid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        regadd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        regemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regcontact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        display_id = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 120, 30);

        reglast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(reglast);
        reglast.setBounds(210, 100, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 140, 120, 30);

        regfirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(regfirst);
        regfirst.setBounds(210, 140, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Middle Name : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 180, 140, 30);

        regmid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(regmid);
        regmid.setBounds(210, 180, 200, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 220, 140, 30);

        regadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaddActionPerformed(evt);
            }
        });
        jPanel1.add(regadd);
        regadd.setBounds(210, 220, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 300, 160, 30);

        regemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemailActionPerformed(evt);
            }
        });
        jPanel1.add(regemail);
        regemail.setBounds(210, 300, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contact Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 260, 170, 30);

        regcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcontactActionPerformed(evt);
            }
        });
        jPanel1.add(regcontact);
        regcontact.setBounds(210, 260, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Gender :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 340, 150, 30);

        gen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gen);
        gen.setBounds(210, 340, 200, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-return-25.png"))); // NOI18N
        jLabel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 10, 30, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("ID NO: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 40, 80, 20);

        display_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display_id.setText("D ID");
        jPanel1.add(display_id);
        display_id.setBounds(90, 40, 80, 20);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Update Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 410, 190, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-430, 0, 900, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regaddActionPerformed

    private void regemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemailActionPerformed

    private void regcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcontactActionPerformed

    private void jLabel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6AncestorAdded

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        this.dispose();
        OwnerDash ad = new OwnerDash();
            ad.setVisible(true);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        
//        session sess = session.getInstance();
//        
//        display_id.setText(""+sess.getId());
//        reglast.setText(""+sess.getLast());
//        regfirst.setText(""+sess.getFirst());
//        regmid.setText(""+sess.getMiddle());
//        regadd.setText(""+sess.getAdds());
//        regcontact.setText(""+sess.getContac());
//        regemail.setText(""+sess.getEmail_add());
//        gen.setSelectedItem(""+sess.getGender_m());
//        
        
        String idss = display_id.getText();
        String lastnames = reglast.getText();
        String firstnames = regfirst.getText();
        String middlenames = regmid.getText();  
        String addresss = regadd.getText();
        String emails = regemail.getText();
        String contactnum = regcontact.getText();
        String genders = gen.getSelectedItem().toString();
        
        
          dbConnector dbc = new dbConnector();
        
        try{
            
            if(dbc.insertData("UPDATE users SET lastname ='"+lastnames+"', "
                    + "firstname ='"+firstnames+"', middlename ='"+middlenames+"',"
                            + " address ='"+addresss+"', contactnumber ='"+contactnum+"', "
                                    + " email ='"+emails+"', gender ='"+genders+"' "
                                            + "  WHERE id ='"+idss+"' ")){
            
                JOptionPane.showMessageDialog(null, "Data Updated!");
                
                
                getData(idss);
            }
              
            this.dispose();
            OwnerDash ad = new OwnerDash();
            ad.setVisible(true);
            
            
        } catch (Exception e){
            
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         
        session sess = session.getInstance();
        
        display_id.setText(""+sess.getId());
        reglast.setText(""+sess.getLast());
        regfirst.setText(""+sess.getFirst());
        regmid.setText(""+sess.getMiddle());
        regadd.setText(""+sess.getAdds());
        regcontact.setText(""+sess.getContac());
        regemail.setText(""+sess.getEmail_add());
        gen.setSelectedItem(""+sess.getGender_m());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(updateinfoowner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateinfoowner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateinfoowner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateinfoowner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateinfoowner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel display_id;
    public javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField regadd;
    public javax.swing.JTextField regcontact;
    public javax.swing.JTextField regemail;
    public javax.swing.JTextField regfirst;
    public javax.swing.JTextField reglast;
    public javax.swing.JTextField regmid;
    // End of variables declaration//GEN-END:variables
}
