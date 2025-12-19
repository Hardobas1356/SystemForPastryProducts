package app;

import app.Models.Client;
import app.Models.Pastry;
import app.Models.Sale;
import app.Repositories.ClientRepository;
import app.Repositories.PastryRepository;
import app.Repositories.SalesRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SalesForm extends javax.swing.JFrame
{

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SalesForm.class.getName());

    private Connect query;
    private DefaultTableModel salesTableModel;
    private ClientRepository clientRepo;
    private PastryRepository pastryRepo;
    private SalesRepository salesRepo;

    public SalesForm()
    {
        initComponents();
        query = new Connect();
        salesTableModel = (DefaultTableModel) SalesTable.getModel();
        clientRepo = new ClientRepository(query);
        pastryRepo = new PastryRepository(query);
        salesRepo = new SalesRepository(query);

        loadSaleTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "id", "Id of Client", "Id of Pastry", "Amount", "Price"
            }
        ));
        jScrollPane1.setViewportView(SalesTable);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(510, 510, 510))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton)
                    .addComponent(UpdateButton)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackButtonActionPerformed
    {//GEN-HEADEREND:event_BackButtonActionPerformed
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int row = SalesTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a sale first.");
            return;
        }

        String id = salesTableModel.getValueAt(SalesTable.getSelectedRow(), 0).toString();
        int saleId = Integer.parseInt(id);

        Object[] options =
        {
            "Delete", "Cancel"
        };

        int option = JOptionPane.showOptionDialog(this, "Delete sale with id: " + id, "Confirm deletion?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (option == 1)
        {
            return;
        }

        try
        {
            if (salesRepo.delete(saleId))
            {
                salesTableModel.removeRow(SalesTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error! Could not deleted selected row");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        int row = SalesTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a sale first.");
            return;
        }

        while (true)
        {
            JTextField amountField = new JTextField();

            amountField.setText(salesTableModel.getValueAt(SalesTable.getSelectedRow(), 3).toString());

            Object[] windowContent =
            {
                "Amount", amountField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Update sale", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String amount = amountField.getText().trim();

            if (amount.isBlank() && Integer.parseInt(amount) >= 0)
            {
                JOptionPane.showMessageDialog(this, "Invalid!");

                continue;
            }

            Sale updatedSale = new Sale();
            Sale currentSale = new Sale();

            updatedSale.setAmount(Integer.parseInt(amount));

            int saleId = Integer.parseInt(salesTableModel.getValueAt(SalesTable.getSelectedRow(), 0).toString());
            int currentAmount = Integer.parseInt(salesTableModel.getValueAt(SalesTable.getSelectedRow(), 3).toString());
            int pastryId = Integer.parseInt(salesTableModel.getValueAt(SalesTable.getSelectedRow(), 2).toString());

            updatedSale.setPastryId(pastryId);
            currentSale.setPastryId(pastryId);

            currentSale.setAmount(currentAmount);
            try
            {
                boolean result = salesRepo.update(saleId, currentSale, updatedSale);
                if (result)
                {
                    loadSaleTable();
                    JOptionPane.showMessageDialog(this, "Sale updated.");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error! Could not update the sale.");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            break;
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddButtonActionPerformed
    {//GEN-HEADEREND:event_AddButtonActionPerformed
        while (true)
        {
            JTextField clientIdField = new JTextField();
            JTextField pastryIdField = new JTextField();
            JTextField amountField = new JTextField();

            Object[] windowContent =
            {
                "Client Id", clientIdField, "Pastry Id", pastryIdField, "Amount", amountField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Add Sale", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String clientIdText = clientIdField.getText().trim();
            String pastryIdText = pastryIdField.getText().trim();
            String amountText = amountField.getText().trim();

            if (clientIdText.isBlank() || pastryIdText.isBlank() || amountText.isBlank())
            {
                JOptionPane.showMessageDialog(this, "All fields are required.");

                continue;
            }

            try
            {
                Client client = clientRepo.getClientById(Integer.parseInt(clientIdText));
                if (client == null)
                {
                    JOptionPane.showMessageDialog(this, "Client does not exist.");
                    continue;
                }

                Pastry pastry = pastryRepo.getPastryById(Integer.parseInt(pastryIdText));
                if (pastry == null)
                {
                    JOptionPane.showMessageDialog(this, "Pastry does not exist.");
                    continue;
                }

                int amount = Integer.parseInt(amountText);

                if (pastry.getAmount() < amount)
                {
                    JOptionPane.showMessageDialog(this, "Not enough pastries in storage.");
                    continue;
                }
                
                pastry.setAmount(pastry.getAmount() - amount);

                Sale newSale = new Sale();
                newSale.setAmount(amount);
                newSale.setClientId(Integer.parseInt(clientIdText));
                newSale.setPastryId(Integer.parseInt(pastryIdText));
                newSale.setFinalPrice(newSale.getAmount() * pastry.getPrice());
                
                salesRepo.add(newSale);
                pastryRepo.update(pastry.getId(), pastry);
                
                loadSaleTable();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            break;
        }
    }//GEN-LAST:event_AddButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new SalesForm().setVisible(true));
    }

    private void loadSaleTable()
    {
        salesTableModel.setRowCount(0);

        try
        {
            ArrayList<Sale> sales
                    = salesRepo.selectAll();
            for (Sale sale : sales)
            {
                salesTableModel.addRow(sale.toArray());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable SalesTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
