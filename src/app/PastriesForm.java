package app;

import app.Models.Pastry;
import app.Repositories.PastryRepository;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PastriesForm extends javax.swing.JFrame
{

    private Connect query;
    private DefaultTableModel pastryTableModel;
    private PastryRepository pastryRepo;

    public PastriesForm()
    {
        initComponents();

        query = new Connect();
        pastryRepo = new PastryRepository(query);

        pastryTableModel = (DefaultTableModel) PastryTable.getModel();

        loadPastryTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PastryTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PastryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PastryTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(PastryTable);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton)
                    .addComponent(UpdateButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackButtonActionPerformed
    {//GEN-HEADEREND:event_BackButtonActionPerformed
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddButtonActionPerformed
    {//GEN-HEADEREND:event_AddButtonActionPerformed
        while (true)
        {
            JTextField nameField = new JTextField();
            JTextField priceField = new JTextField();
            JTextField amountField = new JTextField();

            Object[] windowContent =
            {
                "Name", nameField, "Price", priceField, "Amount", amountField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Add pastry", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String nameText = nameField.getText().trim();
            String priceText = priceField.getText().trim();
            String amountText = amountField.getText().trim();

            if (nameText.isBlank() || priceText.isBlank() || amountText.isBlank())
            {
                JOptionPane.showMessageDialog(this, "All fields are required.");

                continue;
            }

            try
            {
                double price = Double.parseDouble(priceText);
                int amount = Integer.parseInt(amountText);
                Pastry pastry = new Pastry(nameText, price, amount);

                boolean result = pastryRepo.add(pastry);
                if (result)
                {
                    loadPastryTable();
                    JOptionPane.showMessageDialog(this, "New pastry added");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error! Could not add new pastry");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            break;
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteButtonActionPerformed
    {//GEN-HEADEREND:event_DeleteButtonActionPerformed
        int row = PastryTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a pastry first.");
            return;
        }

        String id = pastryTableModel.getValueAt(PastryTable.getSelectedRow(), 0).toString();
        int pastryId = Integer.parseInt(id);

        Object[] options =
        {
            "Delete", "Cancel"
        };

        int option = JOptionPane.showOptionDialog(this, "Delete pastry with id: " + id, "Confirm deletion?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (option == 1)
        {
            return;
        }

        try
        {
            if (pastryRepo.delete(pastryId))
            {
                pastryTableModel.removeRow(PastryTable.getSelectedRow());
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

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateButtonActionPerformed
    {//GEN-HEADEREND:event_UpdateButtonActionPerformed
        int row = PastryTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a pastry first.");
            return;
        }

        while (true)
        {
            JTextField nameField = new JTextField();
            JTextField priceField = new JTextField();
            JTextField amountField = new JTextField();

            nameField.setText(pastryTableModel.getValueAt(PastryTable.getSelectedRow(), 1).toString());
            priceField.setText(pastryTableModel.getValueAt(PastryTable.getSelectedRow(), 2).toString());
            amountField.setText(pastryTableModel.getValueAt(PastryTable.getSelectedRow(), 3).toString());

            Object[] windowContent =
            {
                "Name", nameField, "Price", priceField, "Amount", amountField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Update pastry", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String nameText = nameField.getText().trim();
            String priceText = priceField.getText().trim();
            String amountText = amountField.getText().trim();

            if (nameText.isBlank() || priceText.isBlank() || amountText.isBlank())
            {
                JOptionPane.showMessageDialog(this, "All fields are required.");

                continue;
            }

            try
            {
                double price = Double.parseDouble(priceText);
                int amount = Integer.parseInt(amountText);
                Pastry pastry = new Pastry(nameText, price, amount);

                int id = Integer.parseInt(pastryTableModel.getValueAt(PastryTable.getSelectedRow(), 0).toString());

                boolean result = pastryRepo.update(id, pastry);
                if (result)
                {
                    loadPastryTable();
                    JOptionPane.showMessageDialog(this, "Pastry updated");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error! Could not update pastry");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            break;
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

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
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PastriesForm().setVisible(true));
    }

    private void loadPastryTable()
    {
        pastryTableModel.setRowCount(0);

        try
        {
            ArrayList<Pastry> pastries
                    = pastryRepo.selectAll();
            for (Pastry pastry : pastries)
            {
                pastryTableModel.addRow(pastry.toArray());
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
    private javax.swing.JTable PastryTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
