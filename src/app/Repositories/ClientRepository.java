package app.Repositories;

import app.Connect;
import app.Models.Client;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class ClientRepository
{

    private Connection connect;

    public ClientRepository(Connect conn)
    {
        connect = conn.getConnection();
    }

    public ArrayList<Client> selectAll() throws SQLException
    {
        CheckConnection();

        String sql = "SELECT id,Name, Adress, City FROM Client";
        ArrayList<Client> result = new ArrayList<Client>();

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql))
        {
            while (rs.next())
            {
                Client client = new Client(rs.getInt("Id"), rs.getString("Name"), rs.getString("Adress"), rs.getString("City"));

                result.add(client);
            }
        }

        return result;
    }
    
    public ArrayList<Client> selectByCity(String city) throws SQLException
    {
        CheckConnection();

        String sql = "SELECT id,Name, Adress, City FROM Client WHERE LOWER(City) LIKE LOWER(?)";
        ArrayList<Client> result = new ArrayList<Client>();

        try (PreparedStatement stmt = connect.prepareStatement(sql);)
        {
            stmt.setString(1, city);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next())
            {
                Client client = new Client(rs.getInt("Id"), rs.getString("Name"), rs.getString("Adress"), rs.getString("City"));

                result.add(client);
            }
        }

        return result;
    }

    public boolean update() throws SQLException
    {

        return false;
    }

    public boolean delete(int id) throws SQLException
    {
        CheckConnection();

        int rowsAffected = 0;

        String sql = "Delete from Client where id=?";
        try (PreparedStatement stmt = connect.prepareStatement(sql);)
        {
            stmt.setInt(1, id);
            rowsAffected = stmt.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

        }
        return rowsAffected > 0;
    }

    public boolean add(Client client) throws SQLException
    {
        CheckConnection();

        String sql = "insert into client(name, adress, city) VALUES (?,?,?)";
        int rows = 0;

        try (PreparedStatement stmt = connect.prepareStatement(sql))
        {
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getAdress());
            stmt.setString(3, client.getCity());
            rows = stmt.executeUpdate();
            System.out.println("Rows affected: " + rows);
        }

        return rows > 0;
    }

    private void CheckConnection() throws SQLException
    {
        if (connect == null)
        {
            throw new SQLException("No connection to db!");
        }
    }
}
