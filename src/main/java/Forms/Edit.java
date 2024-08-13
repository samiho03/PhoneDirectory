/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;



/**
 *
 * @author sakun
 */
public class Edit extends javax.swing.JFrame {
    private Main mainForm;
    private Contact contact;
    /**
     * Creates new form Edit
     */
    public Edit(){
         initComponents();
        
    }
    public Edit(Main mainForm, Contact contact) {
        this.mainForm = mainForm;
        this.contact = contact;
        initComponents();
        loadData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorRectangle2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorRectangle2D();
        txtfirstname = new app.bolivia.swing.JCTextField();
        txtlastname = new app.bolivia.swing.JCTextField();
        txtphoneno = new app.bolivia.swing.JCTextField();
        txtemail = new app.bolivia.swing.JCTextField();
        txtrelation = new app.bolivia.swing.JCTextField();
        btnupdate = new rojerusan.RSMaterialButtonRectangle();
        btnback = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfirstname.setBackground(new java.awt.Color(239, 239, 239));
        txtfirstname.setBorder(null);
        getContentPane().add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 87, 160, 20));

        txtlastname.setBackground(new java.awt.Color(239, 239, 239));
        txtlastname.setBorder(null);
        getContentPane().add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 132, 160, 20));

        txtphoneno.setBackground(new java.awt.Color(239, 239, 239));
        txtphoneno.setBorder(null);
        getContentPane().add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 181, 160, 20));

        txtemail.setBackground(new java.awt.Color(239, 239, 239));
        txtemail.setBorder(null);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 227, 160, 20));

        txtrelation.setBackground(new java.awt.Color(239, 239, 239));
        txtrelation.setBorder(null);
        getContentPane().add(txtrelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 274, 160, 20));

        btnupdate.setBackground(new java.awt.Color(134, 112, 197));
        btnupdate.setBorder(null);
        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 322, 160, 40));

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setBorder(null);
        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 379, 70, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void loadData() {
        txtfirstname.setText(contact.getFirstName());
        txtlastname.setText(contact.getLastName());
        txtphoneno.setText(contact.getPhoneNumber());
        txtrelation.setText(contact.getRelation());
        txtemail.setText(contact.getEmail());
    }

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {
        if (txtfirstname.getText().length() == 2) {
            loadData();
        }
    }
    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (contact != null) {
        contact.setFirstName(txtfirstname.getText());
        contact.setLastName(txtlastname.getText());
        contact.setPhoneNumber(txtphoneno.getText());
        contact.setRelation(txtrelation.getText());
        contact.setEmail(txtemail.getText());

        if (mainForm != null) {
            mainForm.updateContact(contact);
        }
        
    } else {
        // Handle the null case, perhaps show an error message
        System.out.println("Error: Contact is null");
    }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
   
      
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnback;
    private rojerusan.RSMaterialButtonRectangle btnupdate;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorRectangle2D evaluatorRectangle2D1;
    private javax.swing.JLabel jLabel1;
    private app.bolivia.swing.JCTextField txtemail;
    private app.bolivia.swing.JCTextField txtfirstname;
    private app.bolivia.swing.JCTextField txtlastname;
    private app.bolivia.swing.JCTextField txtphoneno;
    private app.bolivia.swing.JCTextField txtrelation;
    // End of variables declaration//GEN-END:variables
}
