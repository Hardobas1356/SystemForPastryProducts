package app.Models;

public class Client {

    private int id;
    private String name;
    private String adress;
    private String city;

    public Client() {
    }

    public Client(int id, String name, String adress, String city) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object[] toArray() {
        return new Object[]{id, name, adress,city};
    }
}
