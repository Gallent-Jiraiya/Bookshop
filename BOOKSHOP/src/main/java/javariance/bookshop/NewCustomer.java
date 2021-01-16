/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tharindu
 */
public class NewCustomer extends javax.swing.JFrame {
    
    public NewCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lbl_CustomerNIC = new javax.swing.JLabel();
        Lbl_Adress = new javax.swing.JLabel();
        Lbl_Name = new javax.swing.JLabel();
        Lbl_ContactNumber = new javax.swing.JLabel();
        Txt_Name = new javax.swing.JTextField();
        Txt_CustomerNIC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Address = new javax.swing.JTextArea();
        Txt_ContactNumber = new javax.swing.JTextField();
        Btn_ADD = new javax.swing.JButton();
        Btn_Clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Customer");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 41));

        Lbl_CustomerNIC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Lbl_CustomerNIC.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_CustomerNIC.setText("Customer NIC");
        getContentPane().add(Lbl_CustomerNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 95, 90, 25));

        Lbl_Adress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Lbl_Adress.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Adress.setText("Address");
        getContentPane().add(Lbl_Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 131, 78, 25));

        Lbl_Name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Lbl_Name.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Name.setText("Name");
        getContentPane().add(Lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 59, 78, 25));

        Lbl_ContactNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Lbl_ContactNumber.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_ContactNumber.setText("Contact Number");
        getContentPane().add(Lbl_ContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 218, -1, 23));

        Txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 59, 168, -1));

        Txt_CustomerNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CustomerNICActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_CustomerNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 97, 166, -1));

        Txt_Address.setColumns(20);
        Txt_Address.setRows(5);
        jScrollPane1.setViewportView(Txt_Address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 131, 170, 70));

        Txt_ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ContactNumberActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_ContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 218, 166, 25));

        Btn_ADD.setBackground(new java.awt.Color(204, 255, 204));
        Btn_ADD.setText("ADD");
        Btn_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ADDActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 261, 60, -1));

        Btn_Clear.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Clear.setText("Clear");
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 261, 60, -1));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_CustomerNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CustomerNICActionPerformed

    
    }//GEN-LAST:event_Txt_CustomerNICActionPerformed

    private void Txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NameActionPerformed
        
    }//GEN-LAST:event_Txt_NameActionPerformed

    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
    Txt_Name.setText("");
    Txt_CustomerNIC.setText("");
    Txt_Address.setText("");
    Txt_ContactNumber.setText("");
    
    
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void Btn_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ADDActionPerformed
        String Name = Txt_Name.getText();
        String CustomerNIC = Txt_CustomerNIC.getText();
        String Address = Txt_Address.getText();
        String ContactNumber = Txt_ContactNumber.getText();
        
        try{
            DBConnection connection=new DBConnection();
            Connection conn=connection.getDBConnection();
            Statement statement;
            ResultSet resultSet;
            statement=conn.createStatement();
        
        
       String query  = "INSERT INTO customer (Customer_NIC, Customer_Name, Customer_Address, Customer_Contact_Number)"+"VALUES ('"+CustomerNIC+"' , '"+Name+"' , '"+Address+"' , '"+ContactNumber+"')";
       Statement stmt = conn.createStatement();
       stmt.executeUpdate(query);
        
        JOptionPane.showMessageDialog(this,"You have successfully added it!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_Btn_ADDActionPerformed

    private void Txt_ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ContactNumberActionPerformed
    
    }//GEN-LAST:event_Txt_ContactNumberActionPerformed

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
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ADD;
    private javax.swing.JButton Btn_Clear;
    private javax.swing.JLabel Lbl_Adress;
    private javax.swing.JLabel Lbl_ContactNumber;
    private javax.swing.JLabel Lbl_CustomerNIC;
    private javax.swing.JLabel Lbl_Name;
    private javax.swing.JTextArea Txt_Address;
    private javax.swing.JTextField Txt_ContactNumber;
    private javax.swing.JTextField Txt_CustomerNIC;
    private javax.swing.JTextField Txt_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
