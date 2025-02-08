class User {
    private String username;
    private String email;
    private ShoppingCart shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.shoppingCart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        try {
            shoppingCart.addProduct(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart for " + username + ":");
        for (Product product : shoppingCart.getProducts()) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity() + " - Total Price: $" + product.calculateTotalPrice());
        }
        System.out.println("Total Amount: $" + shoppingCart.calculateTotal());
    }

    public void finalizeCart() {
        System.out.println("Finalizing cart for " + username + "...");
        // Here you can implement payment processing or order confirmation logic
        shoppingCart = new ShoppingCart(); // Clear the cart after finalizing
    }
}