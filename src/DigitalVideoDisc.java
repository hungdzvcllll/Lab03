import java.time.LocalDate;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDisc;
    private int ID;
    private String title;
    private String category;
    private String director;
    private int length;
    private double price;

    // Constructor for all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float price) {
        DigitalVideoDisc.setNbDigitalVideoDisc(nbDigitalVideoDisc + 1);
        this.ID = DigitalVideoDisc.getNbDigitalVideoDisc();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.price = price;

    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    // Setter method for nbDigitalVideoDisc
    public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {
        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc; // Use the class name to set the static variable
    }

    public int getID() {
        return ID;
    }

    // Setter method for ID
    public void setID(int ID) {
        this.ID = ID;
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