package app.Models;

public class Pastry {
    private int id;
    private String name;
    private double price;
    private int amount;

    public Pastry(int id,String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Pastry(String name, double price, int amount)
    {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Pastry() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Object[] toArray()
    {
        return new Object[]
        {
            id, name, price, amount
        };
    }
}
