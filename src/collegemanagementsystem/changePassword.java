
package collegemanagementsystem;

import com.college.util.JDBCUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author saurabh
 */
public class changePassword extends javax.swing.JFrame {

    Connection con1;
	Statement ps;
        PreparedStatement ps1;
	ResultSet rs,rs1;
        int x=0;
        static String t,unm;
    
    /**
     * Creates new form changePassword
     */
    public changePassword(String t, String unm) {
       
        this.t = t;
        System.out.println("Default"+t);
        this.unm = unm;
        initComponents();
        jTextField1.setText(unm);
        jTextField1.setEditable(false);
        jTextField2.setText(t);
        jTextField2.setEditable(false);
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
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 22, -1, -1));

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 79, 144, -1));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 131, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setText("Old Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 169, -1, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 204, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 247, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 128, 130, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 166, 130, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 204, 130, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 244, 130, -1));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 290, -1, -1));

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 292, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1359726.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new changePassword(t,unm);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
     {
       con1=JDBCUtil.getConnection();  
        ps=con1.createStatement();
        String t1 = jTextField1.getText();
        String t2 = jTextField2.getText();
        String t3 = jTextField3.getText();
        String t4 = jTextField4.getText();
        String t5 = jTextField5.getText();
  

        if ("".equals(t3))
                    {
                    JOptionPane.showMessageDialog(this," Old Password Must Be filled", "",JOptionPane.ERROR_MESSAGE);
                    return;
                    }
        if ("".equals(t4))
                    {
                    JOptionPane.showMessageDialog(this," New Password Must Be filled", "",JOptionPane.ERROR_MESSAGE);
                    return;
                    }
        if ("".equals(t5))
                    {
                    JOptionPane.showMessageDialog(this," Confirm Password Must Be filled", "",JOptionPane.ERROR_MESSAGE);
                    return;
                    }
        
        
        String q;
        
        ps1 = con1.prepareStatement("select * from login where type='"+t2+"' and username='"+t1+"' and password='"+t3+"'");
        rs1=ps1.executeQuery();
		while(rs1.next())
		{
			x=1;
		}

                if(x==0)
                {
                    JOptionPane.showMessageDialog(this," Wrong Username or Password", "Sorry ! ",
                    JOptionPane.ERROR_MESSAGE);
                    new changePassword(t,unm);
                    this.dispose();   
        
                }
                else 
                {
                    
                    if(t4.equals(t5))
                    {
                   
                    q = "update login set password='"+t4+"' where username='"+t1+"'";
                    ps.executeUpdate(q);
                    JOptionPane.showMessageDialog(this," Updated Successfully, Please Login Again","Successfully",
                    JOptionPane.PLAIN_MESSAGE); 
                  
                    new frmLogin();
                  this.dispose();   
                }
                    else
                    {
                        JOptionPane.showMessageDialog(this," Password doesnt match", "Sorry ! ",
                    JOptionPane.ERROR_MESSAGE);
                        new changePassword(t,unm);
                  this.dispose();   
                    }
                    
                }
        System.out.println("after execute query");
        con1.close();
        
     }
       catch(Exception e)
       {
           System.out.println(e);
       }
        finally
         {
          
         }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new frmAdmin(t,unm);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                new changePassword(t,unm);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
