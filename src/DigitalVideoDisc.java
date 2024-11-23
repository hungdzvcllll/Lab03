import java.time.LocalDate;

public class DigitalVideoDisc {

    private String title;
    private String category;
    private String director;
    private int length;
    private double price;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor for category, title, and price
    public DigitalVideoDisc(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    // Constructor for director, category, title, and price
    public DigitalVideoDisc(String title, String category, String director, float price) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.price = price;
    }

    // Constructor for all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float price) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and setter for addedDate
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getter and setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}