public class Main {
    public static void main(String[] args) {
        // Создаем объекты Product с разными параметрами
        Product product1 = new Product(10, 500.0, 0.75);
        Product product2 = new Product(5, 1000.0, 42.575);
        Product product3 = new Product(3, 2000.0, 59.1);

        // Вызываем метод calculateTotal() для каждого объекта
        System.out.println("=== Продукт 1 ===");
        product1.calculateTotal();

        System.out.println("\n=== Продукт 2 ===");
        product2.calculateTotal();

        System.out.println("\n=== Продукт 3 ===");
        product3.calculateTotal();
    }
}
