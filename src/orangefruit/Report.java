/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Report.java
 *
 * Created on May 23, 2018, 10:14:52 PM
 */
package orangefruit;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kushiya
 */
public class Report extends javax.swing.JFrame {

    DB db = new DB();
    /** Creates new form Report */
    public Report() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_income = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_expenses = new javax.swing.JTable();
        btn_income = new javax.swing.JButton();
        btn_expenses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_incometot = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_expensestot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_income.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Number", "Date", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_income);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 376, 481));

        tbl_expenses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN Number", "Date", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_expenses);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 72, 376, 481));

        btn_income.setText("Get Report");
        btn_income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incomeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_income, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        btn_expenses.setText("Get Report");
        btn_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expensesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_expenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 31, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Monthly Total");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 571, -1, -1));
        getContentPane().add(lbl_incometot, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 571, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Monthly Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 571, -1, -1));
        getContentPane().add(lbl_expensestot, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 571, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/report800.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btn_incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incomeActionPerformed

        try {
            ResultSet r = db.getdata("select * from invoicetot ");
            DefaultTableModel d = (DefaultTableModel) tbl_income.getModel();
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("invoiceID"));
                v.add(r.getString("date"));
                v.add(r.getString("total"));
                
                d.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
        double total = 0;
        DefaultTableModel d2 = (DefaultTableModel) tbl_income.getModel();
        int rowc = d2.getRowCount();
    
            for(int i=0 ; i<rowc ; i++){
                double tot = Double.parseDouble((d2.getValueAt(i, 2)).toString());
                total = total + tot;
            }
            lbl_incometot.setText(String.valueOf(total));
    } catch (Exception e) {
            System.out.println(e);
    }
}//GEN-LAST:event_btn_incomeActionPerformed

private void btn_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expensesActionPerformed

        try {
            ResultSet r = db.getdata("select * from grntot ");
            DefaultTableModel d = (DefaultTableModel) tbl_expenses.getModel();
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("grnID"));
                v.add(r.getString("date"));
                v.add(r.getString("total"));
                
                d.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
        double total = 0;
        DefaultTableModel d2 = (DefaultTableModel) tbl_expenses.getModel();
        int rowc = d2.getRowCount();
    
            for(int i=0 ; i<rowc ; i++){
                double tot = Double.parseDouble((d2.getValueAt(i, 2)).toString());
                total = total + tot;
            }
            lbl_expensestot.setText(String.valueOf(total));
    } catch (Exception e) {
            System.out.println(e);
    }
}//GEN-LAST:event_btn_expensesActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_expenses;
    private javax.swing.JButton btn_income;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_expensestot;
    private javax.swing.JLabel lbl_incometot;
    private javax.swing.JTable tbl_expenses;
    private javax.swing.JTable tbl_income;
    // End of variables declaration//GEN-END:variables
}
