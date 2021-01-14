package practice;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private String dateOfPublishing;
    private int numOfLabels;
    private double price;

    public Book(int id, String name, String author, String publishingHouse,
                String dateOfPublishing, int numOfLabels, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.dateOfPublishing = dateOfPublishing;
        this.numOfLabels = numOfLabels;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", dateOfPublishing='" + dateOfPublishing + '\'' +
                ", numOfLabels=" + numOfLabels +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && numOfLabels == book.numOfLabels && Double.compare(book.price, price) == 0 &&
                Objects.equals(name, book.name) && Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(dateOfPublishing, book.dateOfPublishing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, dateOfPublishing, numOfLabels, price);
    }
}
