/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import com.college.util.JDBCUtil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author saurabh
 */
public class empProfile extends javax.swing.JFrame {

    static String unm="";static String type="";

    Connection con;
    Statement s;
    PreparedStatement ps;
    ResultSet rs;
    String q;
    
    /**
     * Creates new form empProfile
     */
    public empProfile(String t,String u) {
        type=t;
        unm=u;
        con = JDBCUtil.getConnection();
        initComponents();
        sets();
        setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Employee Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 59, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 94, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 55, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 93, 100, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Emp Code");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 132, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 131, 100, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 383, -1, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 383, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 189, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 224, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 151, 100, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Contact Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 336, 200, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("Email ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 337, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 229, 100, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 191, 100, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 267, 100, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("District");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 192, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("State");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("PinCode");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 268, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 153, 100, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 154, -1, -1));

        jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton3.setText("Insert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 383, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1359726.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new frmAdmin(type,unm);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        String aaa = (String) jComboBox1.getSelectedItem();
        
        if(aaa.equals("Select"))
        {
            jTextArea1.setText("");
            jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField4.setText("");
            jTextField5.setText("");jTextField6.setText("");jTextField7.setText("");jTextField8.setText("");
            
            
        }
        else
        {
        try{
        ps = con.prepareStatement("select * from empProfile where name='"+aaa+"'");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    jTextField2.setText(rs.getString(1));
                    jTextField3.setText(rs.getString(3));
                    jTextArea1.setText(rs.getString(4));
                    jTextField4.setText(rs.getString(5));
                    jTextField5.setText(rs.getString(6));
                    jTextField6.setText(rs.getString(7));
                    jTextField7.setText(rs.getString(8));
                    jTextField8.setText(rs.getString(9));
                }
        }catch(Exception e)   {}}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String a = jTextField1.getText();String b = jTextField2.getText();String c = jTextField3.getText();
        String d = jTextArea1.getText();String e = jTextField4.getText();String f = jTextField5.getText();
        String g = jTextField6.getText();String h = jTextField7.getText();String i = jTextField8.getText();
        
        if(a.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Name", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(c.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Contact Number", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(d.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Address", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(e.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter City", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(f.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter District", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(g.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter State", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(h.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Pincode", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(i.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter email", "",JOptionPane.ERROR_MESSAGE);return;
        }
        
        
        try
        {
            q = "update empProfile set name='"+a+"',number='"+c+"',address='"+d+"',city='"+e+"',district='"+f+"',state='"+g+"',pincode='"+h+"',email='"+i+"' where code='"+b+"'";
            s = con.createStatement();
            s.executeUpdate(q);
            JOptionPane.showMessageDialog(this,"Updated Successfully", "",JOptionPane.PLAIN_MESSAGE);
            new frmAdmin(type,unm);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(empProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String a = jTextField1.getText();String b = jTextField2.getText();String c = jTextField3.getText();
        String d = jTextArea1.getText();String e = jTextField4.getText();String f = jTextField5.getText();
        String g = jTextField6.getText();String h = jTextField7.getText();String i = jTextField8.getText();
        
        if(a.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Name", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(c.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Contact Number", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(d.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Address", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(e.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter City", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(f.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter District", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(g.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter State", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(h.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter Pincode", "",JOptionPane.ERROR_MESSAGE);return;
        }
        if(i.equals(""))
        {
             JOptionPane.showMessageDialog(this," Enter email", "",JOptionPane.ERROR_MESSAGE);return;
        }
        
        
        try
        {
            q = "insert into empProfile values('"+b+"','"+a+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
            s = con.createStatement();
            s.executeUpdate(q);
            JOptionPane.showMessageDialog(this,"Inserted Successfully", "",JOptionPane.PLAIN_MESSAGE);
            new frmAdmin(type,unm);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(empProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(empProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                new empProfile(type,unm);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void sets() {
        
        if(type.equals("Admin"))
        {
            jTextField1.setVisible(false);jLabel3.setVisible(false);
            jTextField2.setText("");jTextField2.setEditable(false);
            jButton1.setVisible(false);
            jButton3.setVisible(false);
            
            jTextField2.setEditable(false);jTextField3.setEditable(false);
            jTextField4.setEditable(false);jTextField5.setEditable(false);
            jTextField6.setEditable(false);jTextField7.setEditable(false);
            jTextField8.setEditable(false);jTextArea1.setEditable(false);
            
                try
                {
                ps = con.prepareStatement("select * from empProfile");
            rs = ps.executeQuery();
            while (rs.next()) {
                String hg = rs.getString(2);
                jComboBox1.addItem(hg);
            }

                }catch(Exception e){}
        
            
        }
        
        else if(type.equals("Employee"))
        {
            jTextField2.setEditable(false);
            jComboBox1.setVisible(false);jLabel2.setVisible(false);
            jTextField2.setText(unm);
            
            try
            {
                
                con = JDBCUtil.getConnection();
                ps = con.prepareStatement("select * from empProfile where code='"+unm+"'");
                rs = ps.executeQuery();
                int y = 0;
                while(rs.next())
                {
                    y = 1;
                }
                
                if(y == 1)
                {
                    jButton3.setVisible(false);
                    ps = con.prepareStatement("select * from empProfile where code='"+unm+"'");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    jTextField1.setText(rs.getString(2));
                    jTextField3.setText(rs.getString(3));
                    jTextArea1.setText(rs.getString(4));
                    jTextField4.setText(rs.getString(5));
                    jTextField5.setText(rs.getString(6));
                    jTextField6.setText(rs.getString(7));
                    jTextField7.setText(rs.getString(8));
                    jTextField8.setText(rs.getString(9));
                }
               
                
                }
                else
                {
                    jButton1.setVisible(false);
                    jTextField1.setText("");jTextField3.setText("");jTextField4.setText("");
                    jTextField5.setText("");jTextField6.setText("");jTextField7.setText("");
                    jTextField8.setText("");jTextArea1.setText("");
                    
                    JOptionPane.showMessageDialog(this," Profile Not Available, Create now", "",JOptionPane.ERROR_MESSAGE);return;
                    
                }
                
                        
                
            }
            catch(Exception e){}
            
            
        }
        else
        {
            new frmLogin();this.dispose();
        }
        
    }
}
