package eksempel2;

//Produkt er et leaf, "har ingen børn"
public class Product implements Order{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return price;
    }

    public String toString(){
        return name + price + " DK ";
    }
}
