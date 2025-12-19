package app;

import app.Models.Client;
import app.Models.Pastry;
import app.Repositories.ClientRepository;
import app.Repositories.PastryRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ClientsForm extends javax.swing.JFrame
{

    private Connect query;
    private DefaultTableModel clientTableModel;
    private ClientRepository clientRepo;

    public ClientsForm()
    {
        initComponents();

        query = new Connect();
        clientRepo = new ClientRepository(query);

        clientTableModel = (DefaultTableModel) ClientTable.getModel();

        loadClientTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DeleteClientButton = new javax.swing.JButton();
        AddClientButton = new javax.swing.JButton();
        cityFilterTextField = new javax.swing.JTextField();
        CityFilterButton = new javax.swing.JButton();
        UpdateClientRow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 358));

        DeleteClientButton.setText("Delete");
        DeleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteClientButtonActionPerformed(evt);
            }
        });

        AddClientButton.setText("Add");
        AddClientButton.setMaximumSize(new java.awt.Dimension(95, 26));
        AddClientButton.setMinimumSize(new java.awt.Dimension(95, 26));
        AddClientButton.setPreferredSize(new java.awt.Dimension(95, 26));
        AddClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientButtonActionPerformed(evt);
            }
        });

        CityFilterButton.setText("Filter by city");
        CityFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFilterButtonActionPerformed(evt);
            }
        });

        UpdateClientRow.setText("Update");
        UpdateClientRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateClientRowActionPerformed(evt);
            }
        });

        ClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Adress", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        ClientTable.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(ClientTable);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Град за проверка");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateClientRow, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityFilterButton)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteClientButton)
                    .addComponent(UpdateClientRow)
                    .addComponent(BackButton))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(cityFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CityFilterButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackButtonActionPerformed
    {//GEN-HEADEREND:event_BackButtonActionPerformed
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> new ClientsForm().setVisible(true));
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
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CityFilterButton;
    private javax.swing.JTable ClientTable;
    private javax.swing.JButton DeleteClientButton;
    private javax.swing.JButton UpdateClientRow;
    private javax.swing.JTextField cityFilterTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
