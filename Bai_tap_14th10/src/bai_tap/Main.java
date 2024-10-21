package bai_tap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Class Product tổng quát
    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    // Class Phone
    public static class Phone extends Product {
        private String brand;
        
        public Phone(String name, double price, int quantity, String brand) {
            super(name, price, quantity);
            this.brand = brand;
        }
        
        public String getBrand() {
            return brand;
        }
    }

    // Class Laptop
    public static class Laptop extends Product {
        private String processor;
        
        public Laptop(String name, double price, int quantity, String processor) {
            super(name, price, quantity);
            this.processor = processor;
        }
        
        public String getProcessor() {
            return processor;
        }
    }

    // Class Book
    public static class Book extends Product {
        private String author;
        
        public Book(String name, double price, int quantity, String author) {
            super(name, price, quantity);
            this.author = author;
        }
        
        public String getAuthor() {
            return author;
        }
    }

    // Class Warehouse
    public static class Warehouse<T extends Product> {
        private List<T> products;
        
        public Warehouse() {
            this.products = new ArrayList<>();
        }
        
        public void addProduct(T product) {
            products.add(product);
            System.out.println("Đã thêm sản phẩm: " + product.getName());
        }
        
        public boolean removeProduct(String name) {
            return products.removeIf(product -> product.getName().equals(name));
        }
        
        public void printProducts() {
            if (products.isEmpty()) {
                System.out.println("Kho hàng trống!");
                return;
            }
            
            System.out.println("Danh sách sản phẩm trong kho:");
            for (T product : products) {
                System.out.println(product);
            }
        }
        
        public T findProduct(String name) {
            return products.stream()
                          .filter(product -> product.getName().equals(name))
                          .findFirst()
                          .orElse(null);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Tạo kho hàng cho từng loại sản phẩm
        Warehouse<Phone> phoneWarehouse = new Warehouse<>();
        Warehouse<Laptop> laptopWarehouse = new Warehouse<>();
        Warehouse<Book> bookWarehouse = new Warehouse<>();
        
        // Thêm các sản phẩm vào kho
        phoneWarehouse.addProduct(new Phone("iPhone 13", 999.99, 10, "Apple"));
        phoneWarehouse.addProduct(new Phone("Galaxy S21", 899.99, 15, "Samsung"));
        
        laptopWarehouse.addProduct(new Laptop("MacBook Pro", 1299.99, 5, "M1"));
        laptopWarehouse.addProduct(new Laptop("ThinkPad X1", 1199.99, 8, "Intel i7"));
        
        bookWarehouse.addProduct(new Book("Java Programming", 49.99, 20, "John Doe"));
        
        // In danh sách sản phẩm
        System.out.println("\nKho điện thoại:");
        phoneWarehouse.printProducts();
        
        System.out.println("\nKho laptop:");
        laptopWarehouse.printProducts();
        
        System.out.println("\nKho sách:");
        bookWarehouse.printProducts();
        
        // Test tìm kiếm sản phẩm
        Phone foundPhone = phoneWarehouse.findProduct("iPhone 13");
        if (foundPhone != null) {
            System.out.println("\nTìm thấy điện thoại: " + foundPhone);
        }
        
        // Test xóa sản phẩm
        if (phoneWarehouse.removeProduct("Galaxy S21")) {
            System.out.println("\nĐã xóa Galaxy S21 khỏi kho");
            System.out.println("\nKho điện thoại sau khi xóa:");
            phoneWarehouse.printProducts();
        }
    }
}