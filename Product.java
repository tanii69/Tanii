abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, int quantity, String brand, String model) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
}

class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(String name, double price, int quantity, String size, String color) {
        super(name, price, quantity);
        this.size = size;
        this.color = color;
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
}

class Book extends Product {
    private String author;
    private String isbn;

    public Book(String name, double price, int quantity, String author, String isbn) {
        super(name, price, quantity);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
}


