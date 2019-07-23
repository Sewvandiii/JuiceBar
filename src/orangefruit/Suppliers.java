/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Suppliers.java
 *
 * Created on May 20, 2018, 7:40:50 AM
 */
package orangefruit;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kushiya
 */
public class Suppliers extends javax.swing.JFrame {

    DB db = new DB();
    /** Creates new form Suppliers */
    public Suppliers() {
        initComponents();
        auto_id();
        
    }

    void auto_id() {
        int num = 0;
        try {
            ResultSet r = db.getdata("select * from suppliers order by supplierID");
            while (r.next()) {
                num = Integer.parseInt(r.getString("supplierID"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int id = num + 1;
        lbl_supID.setText("000" + id + "");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_sName = new javax.swing.JTextField();
        cmb_sName = new javax.swing.JComboBox();
        lbl_supID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_sTP = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_sAdd = new javax.swing.JTextArea();
        btn_dlt = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suppliers");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Supplier ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        txt_sName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sNameKeyReleased(evt);
            }
        });
        getContentPane().add(txt_sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 102, 332, -1));

        cmb_sName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sNameActionPerformed(evt);
            }
        });
        cmb_sName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_sNameKeyReleased(evt);
            }
        });
        getContentPane().add(cmb_sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 320, 10));
        getContentPane().add(lbl_supID, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 105, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 179, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telephone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 143, -1, -1));
        getContentPane().add(txt_sTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 140, 332, -1));

        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 61, -1));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        txt_sAdd.setColumns(20);
        txt_sAdd.setRows(5);
        jScrollPane2.setViewportView(txt_sAdd);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 179, 332, -1));

        btn_dlt.setText("Delete");
        btn_dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dltActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 63, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/800600.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
txt_sAdd.setText("");
txt_sName.setText("");
txt_sTP.setText("");
}//GEN-LAST:event_jButton2ActionPerformed

private void txt_sNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sNameKeyReleased
    try {
            ResultSet r = db.getdata("select * from suppliers where supplierName like '" + txt_sName.getText() + "%'");
            Vector v = new Vector();
            v.add("Select Name");
            while (r.next()) {

                v.add(r.getString("supplierName"));
                cmb_sName.setModel(new DefaultComboBoxModel(v));
                cmb_sName.setPopupVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
}//GEN-LAST:event_txt_sNameKeyReleased

private void cmb_sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sNameActionPerformed
    try {
            ResultSet r = db.getdata("select * from suppliers where supplierName = '" + cmb_sName.getSelectedItem().toString() + "'");
            r.next();
            lbl_supID.setText(r.getString("supplierID"));
            txt_sName.setText(r.getString("supplierName"));
            txt_sTP.setText(r.getString("supplierTP"));
            txt_sAdd.setText(r.getString("supplierAdd"));
        } catch (Exception e) {
            System.out.println(e);
        }
    btn_Add.setEnabled(false);
}//GEN-LAST:event_cmb_sNameActionPerformed

private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
    if(txt_sName.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Name!");
    else if(txt_sTP.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Telephone!");
    else if(txt_sAdd.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Address!");
    else
        try{
            db.putdata("insert into suppliers values ('"+ lbl_supID.getText() +"', '"+ txt_sName.getText() +"', '"+ txt_sTP.getText() +"', '"+ txt_sAdd.getText() +"')");
            JOptionPane.showMessageDialog(null, "Added!");
            this.dispose();
            new Suppliers().setVisible(true);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
}//GEN-LAST:event_btn_AddActionPerformed

private void cmb_sNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_sNameKeyReleased
    try {
            ResultSet r = db.getdata("select * from suppliers where supplierName = '" + cmb_sName.getSelectedItem().toString() + "'");
            r.next();
            lbl_supID.setText(r.getString("supplierID"));
            txt_sName.setText(r.getString("supplierName"));
            txt_sTP.setText(r.getString("supplierTP"));
            txt_sAdd.setText(r.getString("supplierAdd"));
        } catch (Exception e) {
            System.out.println(e);
        }
    
}//GEN-LAST:event_cmb_sNameKeyReleased

private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
    if(txt_sName.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Name!");
    else if(txt_sTP.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Telephone!");
    else if(txt_sAdd.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Address!");
    else{
        String s = lbl_supID.getText().toString();
        
        try{
            db.putdata("delete from suppliers where supplierID = '"+ s +"'");
            db.putdata("insert into suppliers values ('"+ lbl_supID.getText() +"', '"+ txt_sName.getText() +"', '"+ txt_sTP.getText() +"', '"+ txt_sAdd.getText() +"')");
            JOptionPane.showMessageDialog(null, "Edited!");
            this.dispose();
            new Suppliers().setVisible(true);
        }
        catch (Exception ex){
            System.out.println(ex);     
        }
    }
}//GEN-LAST:event_btn_editActionPerformed

private void btn_dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dltActionPerformed
    if(txt_sName.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Name!");
    else if(txt_sTP.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Telephone!");
    else if(txt_sAdd.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Insert Address!");
    else{
        String s = lbl_supID.getText().toString();
        
        try{
            db.putdata("delete from suppliers where supplierID = '"+ s +"'");
            JOptionPane.showMessageDialog(null, "Deleted!");
            this.dispose();
            new Suppliers().setVisible(true);
        }
        catch (Exception ex){
            System.out.println(ex);     
        }
    }
}//GEN-LAST:event_btn_dltActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_dlt;
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox cmb_sName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_supID;
    private javax.swing.JTextArea txt_sAdd;
    private javax.swing.JTextField txt_sName;
    private javax.swing.JTextField txt_sTP;
    // End of variables declaration//GEN-END:variables
}
