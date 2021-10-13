package practical;

public class Product {
    String proName;
    int price;

    public Product()
    {

    }
    public Product(String name,int price)
    {
        this.proName=name;
        this.price=price;
    }
    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
