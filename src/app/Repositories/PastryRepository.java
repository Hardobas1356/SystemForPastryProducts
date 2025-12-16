package app.Repositories;

import app.Connect;
import app.Models.Pastry;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PastryRepository
{
    private Connection connect;

    public PastryRepository(Connect conn)
    {
        connect = conn.getConnection();
    }

    public ArrayList<Pastry> selectAll() throws SQLException
    {
        CheckConnection();

        String sql = "SELECT id,Name, Price, Amount FROM Pastry";
        ArrayList<Pastry> result = new ArrayList<Pastry>();

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql))
        {
            while (rs.next())
            {
                Pastry pastry = new Pastry(rs.getInt("Id"), rs.getString("Name"), rs.getDouble("Price"),rs.getInt("Amount"));

                result.add(pastry);
            }
        }

        return result;
    }
    
    public boolean update(int id, Pastry updatedPastry) throws SQLException
    {
        CheckConnection();
        
        int rows = 0;
        String sql = "UPDATE client SET name=?, price=?,amount=? where id=?";
        
        try(PreparedStatement stmt = connect.prepareStatement(sql))
        {
            stmt.setString(1, updatedPastry.getName());
            stmt.setDouble(2, updatedPastry.getPrice());
            stmt.setInt(3, updatedPastry.getAmount());
            stmt.setInt(4, id);
            
            rows = stmt.executeUpdate();
            System.out.println("Rows affected: " + rows);
        }
        
        return rows > 0;
    }

    public boolean delete(int id) throws SQLException
    {
        CheckConnection();

        int rowsAffected = 0;

        String sql = "Delete from Pastry where id=?";
        try (PreparedStatement stmt = connect.prepareStatement(sql);)
        {
            stmt.setInt(1, id);
            
            rowsAffected = stmt.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

        }
        return rowsAffected > 0;
    }

    public boolean add(Pastry pastry) throws SQLException
    {
        CheckConnection();

        String sql = "insert into pastry(name, price, amount) VALUES (?,?,?)";
        int rows = 0;

        try (PreparedStatement stmt = connect.prepareStatement(sql))
        {
            stmt.setString(1, pastry.getName());
            stmt.setDouble(2, pastry.getPrice());
            stmt.setInt(3, pastry.getAmount());
            
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
