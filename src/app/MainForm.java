package app;

public class MainForm extends javax.swing.JFrame
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainForm.class.getName());

    public MainForm()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ToClientsButton = new javax.swing.JButton();
        ToPastriesButton = new javax.swing.JButton();
        ToSalesButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ToClientsButton.setText("To Clients");
        ToClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToClientsButtonActionPerformed(evt);
            }
        });

        ToPastriesButton.setText("To Pastries");
        ToPastriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToPastriesButtonActionPerformed(evt);
            }
        });

        ToSalesButton.setText("To Sales");
        ToSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToSalesButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ToPastriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ToClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ToSalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitButton)
                        .addGap(159, 159, 159))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(ToClientsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToPastriesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToSalesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExitButtonActionPerformed
    {//GEN-HEADEREND:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ToClientsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ToClientsButtonActionPerformed
    {//GEN-HEADEREND:event_ToClientsButtonActionPerformed
        ClientsForm clientForm = new ClientsForm();
        clientForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ToClientsButtonActionPerformed

    private void ToPastriesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ToPastriesButtonActionPerformed
    {//GEN-HEADEREND:event_ToPastriesButtonActionPerformed
        PastriesForm pastriesForm = new PastriesForm();
        pastriesForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ToPastriesButtonActionPerformed

    private void ToSalesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ToSalesButtonActionPerformed
    {//GEN-HEADEREND:event_ToSalesButtonActionPerformed
        SalesForm salesForm = new SalesForm();
        salesForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ToSalesButtonActionPerformed

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ToClientsButton;
    private javax.swing.JButton ToPastriesButton;
    private javax.swing.JButton ToSalesButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
