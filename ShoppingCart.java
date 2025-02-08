import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) throws IllegalArgumentException {
        if (product == null || product.getQuantity() <= 0) {
            throw new IllegalArgumentException("Invalid product or quantity.");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}