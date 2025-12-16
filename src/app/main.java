package app;

import app.Models.Client;
import app.Models.Pastry;
import app.Repositories.ClientRepository;
import app.Repositories.PastryRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame
{

    private Connect query;
    private DefaultTableModel clientTableModel;
    private DefaultTableModel pastryTableModel;
    private ClientRepository clientRepo;
    private PastryRepository pastryRepo;

    public main()
    {
        initComponents();

        query = new Connect();
        clientRepo = new ClientRepository(query);
        pastryRepo = new PastryRepository(query);

        clientTableModel = (DefaultTableModel) ClientTable.getModel();
        pastryTableModel = (DefaultTableModel) PastryTable.getModel();

        loadClientTable();
        loadPastryTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PastryTable = new javax.swing.JTable();
        DeleteClientButton = new javax.swing.JButton();
        AddClientButton = new javax.swing.JButton();
        cityFilterTextField = new javax.swing.JTextField();
        CityFilterButton = new javax.swing.JButton();
        UpdateClientRow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();
        AddPastryButton = new javax.swing.JButton();
        DeletePastryButton = new javax.swing.JButton();
        UpdatePastryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 364));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 358));

        PastryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Id", "Name", "Price", "Amount"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        PastryTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(PastryTable);

        DeleteClientButton.setText("Delete Client");
        DeleteClientButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteClientButtonActionPerformed(evt);
            }
        });

        AddClientButton.setText("Add Client");
        AddClientButton.setMaximumSize(new java.awt.Dimension(95, 26));
        AddClientButton.setMinimumSize(new java.awt.Dimension(95, 26));
        AddClientButton.setPreferredSize(new java.awt.Dimension(95, 26));
        AddClientButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddClientButtonActionPerformed(evt);
            }
        });

        CityFilterButton.setText("Filter clients by city");
        CityFilterButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CityFilterButtonActionPerformed(evt);
            }
        });

        UpdateClientRow.setText("Update Client");
        UpdateClientRow.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateClientRowActionPerformed(evt);
            }
        });

        ClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Id", "Name", "Adress", "City"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        ClientTable.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(ClientTable);

        AddPastryButton.setText("Add Pastry");
        AddPastryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddPastryButtonActionPerformed(evt);
            }
        });

        DeletePastryButton.setText("Delete Pastry");
        DeletePastryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeletePastryButtonActionPerformed(evt);
            }
        });

        UpdatePastryButton.setText("Update Pastry");
        UpdatePastryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdatePastryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddClientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteClientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateClientRow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityFilterTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddPastryButton)
                            .addComponent(DeletePastryButton)
                            .addComponent(UpdatePastryButton)))
                    .addComponent(CityFilterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPastryButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteClientButton)
                            .addComponent(DeletePastryButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateClientRow)
                            .addComponent(UpdatePastryButton))
                        .addGap(13, 13, 13)
                        .addComponent(cityFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CityFilterButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteClientButtonActionPerformed

        int row = ClientTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a client first.");
            return;
        }

        String id = clientTableModel.getValueAt(ClientTable.getSelectedRow(), 0).toString();
        int clientId = Integer.parseInt(id);

        Object[] options =
        {
            "Delete", "Cancel"
        };

        int option = JOptionPane.showOptionDialog(this, "Delete client with id: " + id, "Confirm deletion?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (option == 1)
        {
            return;
        }

        try
        {
            if (clientRepo.delete(clientId))
            {
                clientTableModel.removeRow(ClientTable.getSelectedRow());
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
    }//GEN-LAST:event_DeleteClientButtonActionPerformed

    private void AddClientButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddClientButtonActionPerformed
    {//GEN-HEADEREND:event_AddClientButtonActionPerformed
        while (true)
        {
            JTextField nameField = new JTextField();
            JTextField adressField = new JTextField();
            JTextField cityField = new JTextField();

            Object[] windowContent =
            {
                "Name", nameField, "Adress", adressField, "City", cityField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "New customer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String name = nameField.getText().trim();
            String adress = adressField.getText().trim();
            String city = cityField.getText().trim();

            if (name.isBlank() || adress.isBlank() || city.isBlank())
            {
                JOptionPane.showMessageDialog(this, "All fields are required.");

                continue;
            }

            Client newClient = new Client(name, adress, city);
            try
            {
                boolean result = clientRepo.add(newClient);
                if (result)
                {
                    loadClientTable();
                    JOptionPane.showMessageDialog(this, "New client added");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error! Could not add new client");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            break;
        }
    }//GEN-LAST:event_AddClientButtonActionPerformed

    private void CityFilterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CityFilterButtonActionPerformed
    {//GEN-HEADEREND:event_CityFilterButtonActionPerformed
        String city = cityFilterTextField.getText().trim();

        if (city.isBlank())
        {
            loadClientTable();
            return;
        }

        try
        {
            loadClientTable(clientRepo.selectByCity(city));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_CityFilterButtonActionPerformed

    private void UpdateClientRowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateClientRowActionPerformed
    {//GEN-HEADEREND:event_UpdateClientRowActionPerformed
        int row = ClientTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a client first.");
            return;
        }

        while (true)
        {
            JTextField nameField = new JTextField();
            JTextField adressField = new JTextField();
            JTextField cityField = new JTextField();

            nameField.setText(clientTableModel.getValueAt(ClientTable.getSelectedRow(), 1).toString());
            adressField.setText(clientTableModel.getValueAt(ClientTable.getSelectedRow(), 2).toString());
            cityField.setText(clientTableModel.getValueAt(ClientTable.getSelectedRow(), 3).toString());

            Object[] windowContent =
            {
                "Name", nameField, "Adress", adressField, "City", cityField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Update customer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (option == 1)
            {
                return;
            }

            String name = nameField.getText().trim();
            String adress = adressField.getText().trim();
            String city = cityField.getText().trim();

            if (name.isBlank() || adress.isBlank() || city.isBlank())
            {
                JOptionPane.showMessageDialog(this, "All fields are required.");

                continue;
            }

            Client updatedClient = new Client(name, adress, city);
            try
            {
                int id = Integer.parseInt(clientTableModel.getValueAt(ClientTable.getSelectedRow(), 0).toString());

                boolean result = clientRepo.update(id, updatedClient);
                if (result)
                {
                    loadClientTable();
                    JOptionPane.showMessageDialog(this, "Client updated.");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error! Could not update client.");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            
            break;
        }
    }//GEN-LAST:event_UpdateClientRowActionPerformed

    private void AddPastryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddPastryButtonActionPerformed
    {//GEN-HEADEREND:event_AddPastryButtonActionPerformed
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
    }//GEN-LAST:event_AddPastryButtonActionPerformed

    private void DeletePastryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeletePastryButtonActionPerformed
    {//GEN-HEADEREND:event_DeletePastryButtonActionPerformed
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
            ClientTable.clearSelection();
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
    }//GEN-LAST:event_DeletePastryButtonActionPerformed

    private void UpdatePastryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdatePastryButtonActionPerformed
    {//GEN-HEADEREND:event_UpdatePastryButtonActionPerformed
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

                boolean result = pastryRepo.update(id,pastry);
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
    }//GEN-LAST:event_UpdatePastryButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> new main().setVisible(true));
    }

    private void loadClientTable()
    {
        clientTableModel.setRowCount(0);

        try
        {
            ArrayList<Client> clients
                    = clientRepo.selectAll();
            for (Client client : clients)
            {
                clientTableModel.addRow(client.toArray());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void loadClientTable(ArrayList<Client> clients)
    {
        clientTableModel.setRowCount(0);

        for (Client client : clients)
        {
            clientTableModel.addRow(client.toArray());
        }

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
    private javax.swing.JButton AddClientButton;
    private javax.swing.JButton AddPastryButton;
    private javax.swing.JButton CityFilterButton;
    private javax.swing.JTable ClientTable;
    private javax.swing.JButton DeleteClientButton;
    private javax.swing.JButton DeletePastryButton;
    private javax.swing.JTable PastryTable;
    private javax.swing.JButton UpdateClientRow;
    private javax.swing.JButton UpdatePastryButton;
    private javax.swing.JTextField cityFilterTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
