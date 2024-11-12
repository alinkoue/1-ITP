import java.util.Scanner;
class Author{
    private String name;
    private String email;
    private char gender;
}
class Book{
    private String name;
    private Author author;
    private Double price;
    private Integer qty;

    public Author getAuthor() {
        return author;
    }
    public Double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public String toString() {
        return "Book: "+ this.name +" Author: "+ this.author;
    }
}