/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ManagerWorkArea;

import Business.Business;
import Business.UserAccount;
import Business.UserAccountDirectory;
import Customer.Customer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan
 */
public class CustomerManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManagementJPanel
     */
    private Business business;
    private UserAccount userAccout;
    DefaultTableModel tableModel;
    public CustomerManagementJPanel() {
        initComponents();
    }

    public CustomerManagementJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccout = userAccount;
        this.tableModel = (DefaultTableModel)jTable1.getModel();

        populate();
    }

    public void populate(){
        tableModel.setRowCount(0);
        for(Customer c:this.business.getCustomerDirectory().getCustomerList()){
              UserAccount u = this.business.getUserAccountDirectory().findById(c.getPersonId());
              Object[] row = new Object[4];
              row[0] = c.getPersonId();
              row[1] = c.getName();
              row[2] = u.getUsername();
              row[3] = u.getPassword();
              tableModel.addRow(row);
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

        fieldName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        fieldAge = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JTextField();
        fieldUsername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        btnAdd.setText("ADD CUSTOMER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));
        add(fieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, -1));
        add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));
        add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel1.setText("Username");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory ua = this.business.getUserAccountDirectory();
        if(ua.accountExists(fieldUsername.getText(), fieldPassword.getText(), "customer")){
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        } else{
            UserAccount user = this.business.getUserAccountDirectory().createUserAccount(fieldUsername.getText(), fieldPassword.getText(), "customer");
            this.business.getCustomerDirectory().createCustomer(user.getAccountId(), fieldName.getText(), fieldAge.getText());
            populate();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
