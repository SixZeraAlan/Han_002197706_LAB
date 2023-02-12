/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ManagerWorkArea;

import Business.Business;
import Business.UserAccount;
import Restaurant.DeliveryAgent;
import Services.Order;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan
 */
public class OrderManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderManagementJPanel
     */
    private Business business;
    private UserAccount userAccout;
    DefaultTableModel tableModel;
    public OrderManagementJPanel() {
        initComponents();
    }

    public OrderManagementJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccout = userAccount;
        this.tableModel = (DefaultTableModel)jTable1.getModel();

        populateDp();
        populate();
    }

    public void populate(){
        tableModel.setRowCount(0);
        for(Order o : this.business.getAllOrders().getOrderList()){
            Object[] row = new Object[3];
            row[0] = o;
            row[1] = o.getCustomer().getPersonId();
            row[2] = o.getAgent().getPersonId();

            tableModel.addRow(row);
        }
    }

    public void populateDp(){
       jComboBox1.removeAllItems();
       for(DeliveryAgent d : this.business.getDeliveryAgentDirectory().getAgentList()){
           jComboBox1.addItem(d);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Customer", "Delivery Man"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 400));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 180, -1));

        btnAssign.setText("ASSIGN");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        DeliveryAgent agent = (DeliveryAgent)jComboBox1.getSelectedItem();
      
        int selectedRow = jTable1.getSelectedRow();
        Order o = (Order)jTable1.getValueAt(selectedRow, 0);
        o.setAgent(agent);
        agent.addDeliveryOrder(o);

        populate();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
