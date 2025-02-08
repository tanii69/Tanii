public class OnlineStore {
    public static void main(String[] args) {
        User user = new User("Tanisha Singh", "tanisha1808@gmail.com");

        Product laptop = new Electronics("Laptop", 999.99, 1, "Acer", "ModelY");
        Product shirt = new Clothing("T-Shirt", 19.99, 2, "M", "Blue");
        Product book = new Book("Ikigai", 29.99, 1, "Author A", "123456789");

        user.addToCart(laptop);
        user.addToCart(shirt);
        user.addToCart(book);

        user.viewCart();
        user.finalizeCart();
    }
}