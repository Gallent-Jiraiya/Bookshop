/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharindu
 */
public class NewOrder extends javax.swing.JFrame {

    /**
     * Creates new form NewOrder
     */
    public NewOrder() {
        initComponents();
        loadCustomerTable();
        Booktable();
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
        jLabel2 = new javax.swing.JLabel();
        txtCustomerSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboCustomerBy = new javax.swing.JComboBox<>();
        btnAddCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtBookSearch = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        txtQuantityBook = new javax.swing.JTextField();
        btnAddBookOrder = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableBooks = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make New Order");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Customer");

        txtCustomerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerSearchKeyReleased(evt);
            }
        });

        jLabel3.setText("By");

        comboCustomerBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Con. Number", " " }));

        btnAddCustomer.setText("Add New Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_NIC", "Name", "Contact_NO", "Address"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel16.setText("Book Title");

        txtBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookSearchActionPerformed(evt);
            }
        });
        txtBookSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookSearchKeyReleased(evt);
            }
        });

        btnAddBook.setText("Add New Book");

        btnAddBookOrder.setText("ADD");
        btnAddBookOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookOrderActionPerformed(evt);
            }
        });

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Auther", "Category", "Price"
            }
        ));
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblBook);

        TableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Quantity", "Prices"
            }
        ));
        TableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBooksMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TableBooks);

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel19.setText("Total Prize");

        jButton14.setText("Make Order");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Cancel Order");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCustomerBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCustomer))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantityBook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddBookOrder))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboCustomerBy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantityBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBookOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookSearchActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnAddBookOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookOrderActionPerformed
        // TODO add your handling code here:
        String ISBN=txtBookSearch.getText();
        String quan=txtQuantityBook.getText();
        DefaultTableModel tblModel=(DefaultTableModel)TableBooks.getModel();
            try {
            int quantity=Integer.parseInt(quan);
            String sql= "select ISBN,Book_Name,Price from book where ISBN='"+ISBN+"';";
            DBConnection con=new DBConnection();
            Connection connection=con.getDBConnection();
            Statement statement;
            ResultSet resultSet;
            statement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet =statement.executeQuery(sql);
            if(resultSet.next()){
                boolean dup=false;
                for (int row = 0 ; row < tblModel.getRowCount(); row++) {
                    if(ISBN.equals(tblModel.getValueAt(row, 0))) {
                        dup=true;
                        int dialogButton = JOptionPane.CLOSED_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Book has been already added","Warning",dialogButton);
                        break;
                    }
                }
                if(dup==false){
                    int price=resultSet.getInt("Price");
                    int calc=price*quantity;
                        order.addBooks(ISBN,price, quantity);
                        txtBookSearch.setText("");
                        txtQuantityBook.setText("");
                        String TbData[]={ISBN,resultSet.getString("Book_Name"),quan,calc+""};       
                        tblModel.addRow(TbData);
                        txtTotal.setText(order.getTotalPrice()+"");
                }   
            }
            else{
                int dialogButton = JOptionPane.CLOSED_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Please select the relative book from table to continue","Warning",dialogButton);
            }
            }
            catch (NumberFormatException e) {
                System.out.println("javariance.bookshop.NewOrder.btnAddBookOrderActionPerformed"+e);
                txtQuantityBook.setText("");
                int dialogButton = JOptionPane.CLOSED_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Quantity is Invalid","Warning",dialogButton);
                
            } 
            catch (Exception ex) {
                Logger.getLogger(NewOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_btnAddBookOrderActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void loadCustomerTable(){
        try{
        String sql;
        sql= "select * from customer;";
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        ResultSet resultSet;
        statement=connection.createStatement();
        statement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultSet =statement.executeQuery(sql);
        DefaultTableModel tblModel=(DefaultTableModel)tblCustomer.getModel();
        tblModel.getDataVector().removeAllElements();
        revalidate();
        if(!resultSet.next()){
        //System.out.println("0 queries");
        String TbData[]={"empty","empty","empty","empty"};       
                tblModel.addRow(TbData);
        }
        else{
            resultSet.beforeFirst();
            while(resultSet.next()){
                String NIC =resultSet.getString("Customer_NIC");
                String Name=resultSet.getString("Customer_Name");
                String Address=resultSet.getString("Customer_Address");
                String Number=resultSet.getString("Customer_Contact_Number");
          
                String TbData[]={NIC,Name,Number,Address};       
                tblModel.addRow(TbData);
            }
        }
        con.getDBConnection().close();
                connection.close();
        }
        catch(Exception e){
            System.out.println("txtSearchcustomerKeyPressed"+e);
        }
    }    
    private void Booktable(){
        try{
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        ResultSet resultSet;
        statement=connection.createStatement();
        String sql= "select A.ISBN,A.Category,A.Book_Name,A.Price,B.Author_Name from book A,author B where A.Author_ID=B.Author_ID ;";
        statement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultSet =statement.executeQuery(sql);
        DefaultTableModel tblModel=(DefaultTableModel)tblBook.getModel();
        tblModel.getDataVector().removeAllElements();
        revalidate();
        if(!resultSet.next()){
        String TbData[]={"empty","empty","empty","empty","empty"};       
                tblModel.addRow(TbData);
        }
        else{
            resultSet.beforeFirst();
            while(resultSet.next()){
                String ISBN =resultSet.getString("A.ISBN");
                String title=resultSet.getString("A.Book_Name");
                String Auther=resultSet.getString("B.Author_Name");
                String Category=resultSet.getString("A.Category");
                String Price=String.valueOf(resultSet.getInt("A.Price"));
          
                String TbData[]={ISBN,title,Auther,Category,Price};    
                tblModel.addRow(TbData);
            }                 
        }
        con.getDBConnection().close();
                connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void txtCustomerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerSearchKeyReleased
        // TODO add your handling code here:
        String txt=txtCustomerSearch.getText();
        int by=comboCustomerBy.getSelectedIndex();
        String type;
        switch(by){
            case 0:
                type="Customer_Name";
                break;
            case 1:
                type="Customer_NIC";
                break;
            default:
                type="Customer_Contact_Number";
                break;
        }
        try{
            String sql;
        sql= "select * from customer where "+type+" LIKE '%"+txt+"%';";
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        ResultSet resultSet;
        statement=connection.createStatement();
        statement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultSet =statement.executeQuery(sql);
        DefaultTableModel tblModel=(DefaultTableModel)tblCustomer.getModel();
        tblModel.getDataVector().removeAllElements();
        revalidate();
        if(!resultSet.next()){
        //System.out.println("0 queries");
        String TbData[]={"empty","empty","empty","empty"};       
                tblModel.addRow(TbData);
        }
        else{
            resultSet.beforeFirst();
            while(resultSet.next()){
                String NIC =resultSet.getString("Customer_NIC");
                String Name=resultSet.getString("Customer_Name");
                String Address=resultSet.getString("Customer_Address");
                String Number=resultSet.getString("Customer_Contact_Number");
          
                String TbData[]={NIC,Name,Number,Address};       
                tblModel.addRow(TbData);
            }
        }
        con.getDBConnection().close();
                connection.close();
        }
        catch(Exception e){
            System.out.println("txtSearchcustomerKeyPressed"+e);
        }
    }//GEN-LAST:event_txtCustomerSearchKeyReleased

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = 0;
        String CustomerNIC= source.getModel().getValueAt(row, column)+"";
        order.setCustomerNIC(CustomerNIC);
        txtCustomerSearch.setText(CustomerNIC);
        
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void txtBookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookSearchKeyReleased
        // TODO add your handling code here:
        String txt=txtBookSearch.getText();
        try{
        String sql;
        sql= "select A.ISBN,A.Category,A.Book_Name,A.Price,B.Author_Name from book A,author B where A.Author_ID=B.Author_ID AND Book_Name LIKE '%"+txt+"%';";
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        ResultSet resultSet;
        statement=connection.createStatement();
        statement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultSet =statement.executeQuery(sql);
        DefaultTableModel tblModel=(DefaultTableModel)tblBook.getModel();
        tblModel.getDataVector().removeAllElements();
        revalidate();
        if(!resultSet.next()){
        //System.out.println("0 queries");
        String TbData[]={"empty","empty","empty","empty","empty"};       
                tblModel.addRow(TbData);
        }
        else{
            resultSet.beforeFirst();
            while(resultSet.next()){
                String ISBN =resultSet.getString("A.ISBN");
                String title=resultSet.getString("A.Book_Name");
                String Auther=resultSet.getString("B.Author_Name");
                String Category=resultSet.getString("A.Category");
                String Price=String.valueOf(resultSet.getInt("A.Price"));
          
                String TbData[]={ISBN,title,Auther,Category,Price};    
                tblModel.addRow(TbData);
            }
        }
        con.getDBConnection().close();
                connection.close();
        }
        catch(Exception e){
            System.out.println("txtSearchcustomerKeyPressed"+e);
        }
    }//GEN-LAST:event_txtBookSearchKeyReleased

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = 0;
        String ISBN= source.getModel().getValueAt(row, column)+"";
        txtBookSearch.setText(ISBN);
    }//GEN-LAST:event_tblBookMouseClicked

    private void TableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBooksMouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Want to remove this raw?d","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        DefaultTableModel tblModel=(DefaultTableModel)TableBooks.getModel();
        int Price= Integer.parseInt(tblModel.getValueAt(row, 3)+"");
        tblModel.removeRow(row);
        order.removeBooks(row, Price);
        txtTotal.setText(order.getTotalPrice()+"");
            
        }
    }//GEN-LAST:event_TableBooksMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Want to Submit?d","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            order.makeOrder();
            int dialogButton2 = JOptionPane.CLOSED_OPTION;
            int dialogResult2 = JOptionPane.showConfirmDialog (null, "Submited","Warning",dialogButton);
            
            this.setVisible(false);
            this.dispose();
            
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBooks;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddBookOrder;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JComboBox<String> comboCustomerBy;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblBook;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtBookSearch;
    private javax.swing.JTextField txtCustomerSearch;
    private javax.swing.JTextField txtQuantityBook;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    AddNewOrder order=new AddNewOrder();
}
