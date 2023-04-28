package kiosk;

public class Menu {
    private Product[] products = {
            new Product(1, "김밥", 1000),
            new Product(2, "계란 김밥", 1500),
            new Product(3, "충무 김밥", 1000),
            new Product(4, "떡볶이", 2000)
    };

    public void printMenu() {
        for (Product product : products) {
            System.out.printf("%d) %s(%d원) ", product.getProductId(), product.getProductName(), product.getProductPrice());
        }
    }

    public Product[] getAllProduct() {return products;}
}
