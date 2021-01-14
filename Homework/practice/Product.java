package practice;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private String creator;
    private double price;
    private String dateOfUse;
    private int count;

    public Product(int id, String name, String creator, double price, String dateOfUse, int count){
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.price = price;
        this.dateOfUse = dateOfUse;
        this.count = count;

    }

    @Override
    public int compareTo(Product o) {
        int xD =((int)this.price - (int)o.price);
        return xD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator='" + creator + '\'' +
                ", price=" + price +
                ", dateOfUse='" + dateOfUse + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && count == product.count && Objects.equals(name, product.name)
                && Objects.equals(creator, product.creator) && Objects.equals(dateOfUse, product.dateOfUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creator, price, dateOfUse, count);
    }
}
