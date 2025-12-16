package app;

import app.Models.Client;
import app.Repositories.ClientRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame
{

    private Connect query;
    private DefaultTableModel clientTableModel;
    private ClientRepository clientRepo;

    public main()
    {

        initComponents();

        query = new Connect();
        clientRepo = new ClientRepository(query);
        clientTableModel = (DefaultTableModel) ClientTable.getModel();

        main.this.loadClientTable();
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
        cityFilterButton = new javax.swing.JButton();
        UpdateClientRow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();

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

        DeleteClientButton.setText("Delete row");
        DeleteClientButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteClientButtonActionPerformed(evt);
            }
        });

        AddClientButton.setText("Add");
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

        cityFilterButton.setText("Filter by name");
        cityFilterButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cityFilterButtonActionPerformed(evt);
            }
        });

        UpdateClientRow.setText("Update row");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AddClientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteClientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateClientRow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityFilterTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cityFilterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteClientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateClientRow)
                        .addGap(13, 13, 13)
                        .addComponent(cityFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityFilterButton))
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

        int row = PastryTable.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a client first.");
            return;
        }

        String id = clientTableModel.getValueAt(PastryTable.getSelectedRow(), 0).toString();
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
                clientTableModel.removeRow(PastryTable.getSelectedRow());
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

            Client newClient = new Client(name, adress, city);
            try
            {
                boolean result = clientRepo.add(newClient);
                if (result)
                {
                    JOptionPane.showMessageDialog(this, "New client added");
                    loadClientTable();
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

    private void cityFilterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cityFilterButtonActionPerformed
    {//GEN-HEADEREND:event_cityFilterButtonActionPerformed
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
    }//GEN-LAST:event_cityFilterButtonActionPerformed

    private void UpdateClientRowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateClientRowActionPerformed
    {//GEN-HEADEREND:event_UpdateClientRowActionPerformed
        int row = PastryTable.getSelectedRow();
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

            nameField.setText(clientTableModel.getValueAt(PastryTable.getSelectedRow(), 1).toString());
            adressField.setText(clientTableModel.getValueAt(PastryTable.getSelectedRow(), 2).toString());
            cityField.setText(clientTableModel.getValueAt(PastryTable.getSelectedRow(), 3).toString());

            Object[] windowContent =
            {
                "Name", nameField, "Adress", adressField, "City", cityField
            };

            Object[] options =
            {
                "Enter", "Cancel"
            };

            int option = JOptionPane.showOptionDialog(this, windowContent, "Enter data", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

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
                int id = Integer.parseInt(clientTableModel.getValueAt(PastryTable.getSelectedRow(), 0).toString());

                boolean result = clientRepo.update(id, updatedClient);
                if (result)
                {
                    JOptionPane.showMessageDialog(this, "Client updated.");
                    loadClientTable();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClientButton;
    private javax.swing.JTable ClientTable;
    private javax.swing.JButton DeleteClientButton;
    private javax.swing.JTable PastryTable;
    private javax.swing.JButton UpdateClientRow;
    private javax.swing.JButton cityFilterButton;
    private javax.swing.JTextField cityFilterTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
