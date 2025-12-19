package app.Models;

public class Sale {
    private int id;
    private int clientId;
    private int pastryId;
    private int amount;
    private double finalPrice;

    public Sale() {
    }

    public Sale(int id, int clientId, int pastryId, int amount, double finalPrice) {
        this.id = id;
        this.clientId = clientId;
        this.pastryId = pastryId;
        this.amount = amount;
        this.finalPrice = finalPrice;
    }

    public int getAmount() {
        return amount;
    }
    
    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public int getPastryId() {
        return pastryId;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setPastryId(int pastryId) {
        this.pastryId = pastryId;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Object[] toArray()
    {
        return new Object[]
        {
            id, clientId, pastryId, amount, finalPrice
        };
    }
}
