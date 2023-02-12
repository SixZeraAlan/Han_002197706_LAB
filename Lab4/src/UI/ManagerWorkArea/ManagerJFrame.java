/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.ManagerWorkArea;

import Business.Business;
import Business.UserAccount;
import UI.MainJFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan
 */
public class ManagerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagerJFrame
     */
     private Business business;
    private UserAccount userAccount;
    DefaultTableModel tableModel;
    public ManagerJFrame() {
        initComponents();
    }
    public ManagerJFrame(Business business, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
       this.userAccount = userAccount;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnOrderManage = new javax.swing.JButton();
        btnCustomerManage = new javax.swing.JButton();
        btnAgentManage = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrderManage.setText("ORDERS");
        btnOrderManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderManageActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrderManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        btnCustomerManage.setText("CUSTOMERS");
        btnCustomerManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManageActionPerformed(evt);
            }
        });
        jPanel1.add(btnCustomerManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        btnAgentManage.setText("AGENTS");
        btnAgentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentManageActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgentManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jSplitPane1.setTopComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManageActionPerformed
        // TODO add your handling code here:
         jSplitPane1.setRightComponent(new CustomerManagementJPanel(business,userAccount));
    }//GEN-LAST:event_btnCustomerManageActionPerformed

    private void btnOrderManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderManageActionPerformed
        // TODO add your handling code here:
       jSplitPane1.setRightComponent(new OrderManagementJPanel(business,userAccount));
    }//GEN-LAST:event_btnOrderManageActionPerformed

    private void btnAgentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentManageActionPerformed
        // TODO add your handling code here:
       jSplitPane1.setRightComponent(new DeliveryAgentManagementJPanel(business,userAccount));
    }//GEN-LAST:event_btnAgentManageActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new MainJFrame(this.business, this.userAccount);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentManage;
    private javax.swing.JButton btnCustomerManage;
    private javax.swing.JButton btnOrderManage;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
