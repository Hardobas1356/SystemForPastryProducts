package app.Repositories;

import app.Connect;
import app.Models.Client;
import app.Models.Pastry;
import app.Models.Sale;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class SalesRepository
{

    private Connection connect;
    private Connect query;
    public PastryRepository pastryRepo;

    public SalesRepository(Connect conn)
    {
        connect = conn.getConnection();
        query = new Connect();
        pastryRepo = new PastryRepository(query);
    }

    public ArrayList<Sale> selectAll() throws SQLException
    {
        CheckConnection();

        String sql = "SELECT * FROM Sale";
        ArrayList<Sale> result = new ArrayList<Sale>();

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql))
        {
            while (rs.next())
            {
                Sale sale = new Sale(rs.getInt("Id"), rs.getInt("ClientId"), rs.getInt("PastryId"), rs.getInt("Amount"), rs.getDouble("FinalPrice"));

                result.add(sale);
            }
        }

        return result;
    }

    public boolean update(int saleId, Sale currentSale, Sale updatedSale) throws SQLException
    {
        CheckConnection();

        Pastry pastry = pastryRepo.getPastryById(updatedSale.getPastryId());

        int rows = 0;

        if (pastry.getAmount() < updatedSale.getAmount())
        {
            return false;
        }

        double finalPrice = 0;
        int pastryAmount = pastry.getAmount();

        pastryAmount += currentSale.getAmount() - updatedSale.getAmount();

        pastry.setAmount(pastryAmount);
        finalPrice = updatedSale.getAmount() * pastry.getPrice();
        pastryRepo.update(pastry.getId(), pastry);

        String sql = "UPDATE sale SET Amount=?, FinalPrice=? where id=?";

        try (PreparedStatement stmt = connect.prepareStatement(sql))
        {
            stmt.setInt(1, updatedSale.getAmount());
            stmt.setDouble(2, finalPrice);
            stmt.setInt(3, saleId);
            rows = stmt.executeUpdate();
            System.out.println("Rows affected: " + rows);
        }

        return rows > 0;
    }

    public boolean add(Sale newSale) throws SQLException
    {
        CheckConnection();

        String sql = "insert into sale(clientId,pastryId, amount, finalPrice) VALUES (?,?,?,?)";
        
        int rows = 0;

        try (PreparedStatement stmt = connect.prepareStatement(sql))
        {
            stmt.setInt(1, newSale.getClientId());
            stmt.setInt(2, newSale.getPastryId());
            stmt.setInt(3, newSale.getAmount());
            stmt.setDouble(4, newSale.getFinalPrice());
            
            rows = stmt.executeUpdate();
            System.out.println("Rows affected: " + rows);
        }

        return rows > 0;
    }

    public boolean delete(int id) throws SQLException
    {
        CheckConnection();

        int rowsAffected = 0;

        String sql = "Delete from Sale where id=?";
        try (PreparedStatement stmt = connect.prepareStatement(sql);)
        {
            stmt.setInt(1, id);
            rowsAffected = stmt.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

        }
        return rowsAffected > 0;
    }

    private void CheckConnection() throws SQLException
    {
        if (connect == null)
        {
            throw new SQLException("No connection to db!");
        }
    }
}
