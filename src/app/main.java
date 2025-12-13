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
    private DefaultTableModel tableModel;
    private ClientRepository clientRepo;

    public main()
    {

        initComponents();

        query = new Connect();
        clientRepo = new ClientRepository(query);
        tableModel = (DefaultTableModel) jTable1.getModel();

        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DeleteClientButton = new javax.swing.JButton();
        AddClientButton = new javax.swing.JButton();
        cityFilterTextField = new javax.swing.JTextField();
        cityFilterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 358));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        DeleteClientButton.setText("Delete");
        DeleteClientButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteClientButtonActionPerformed(evt);
            }
        });

        AddClientButton.setText("Add");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityFilterTextField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityFilterButton)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(AddClientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteClientButton)
                .addGap(18, 18, 18)
                .addComponent(cityFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityFilterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
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

        int row = jTable1.getSelectedRow();
        if (row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a client first.");
            return;
        }

        String id = tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
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
                tableModel.removeRow(jTable1.getSelectedRow());
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

            Client newClient = new Client(name, adress, city);
            try
            {
                boolean result = clientRepo.add(newClient);
                if (result)
                {
                    JOptionPane.showMessageDialog(this, "New client added");
                    loadTable();
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
            loadTable();
            return;
        }

        try
        {
            loadTable(clientRepo.selectByCity(city));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cityFilterButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> new main().setVisible(true));
    }

    private void loadTable()
    {
        tableModel.setRowCount(0);

        try
        {
            ArrayList<Client> clients
                    = clientRepo.selectAll();
            for (Client client : clients)
            {
                tableModel.addRow(client.toArray());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void loadTable(ArrayList<Client> clients)
    {
        tableModel.setRowCount(0);

        for (Client client : clients)
        {
            tableModel.addRow(client.toArray());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClientButton;
    private javax.swing.JButton DeleteClientButton;
    private javax.swing.JButton cityFilterButton;
    private javax.swing.JTextField cityFilterTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
