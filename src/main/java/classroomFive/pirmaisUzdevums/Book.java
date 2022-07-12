package classroomFive.pirmaisUzdevums;

public class Book {
    public String name;
    public Author author;
//    public double price;
    public Cena price;

    public Book(String name, Author author, Cena price) { //constructor
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() { //generate -> to string
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}
