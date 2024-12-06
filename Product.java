import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс Product описывает товар с количеством, ценой и скидкой.
 * Содержит метод для подсчета общей суммы покупки.
 */
public class Product {
    /** Количество товаров */
    private int quantity;
    /** Цена одного товара */
    private double price;
    /** Скидка на товар в процентах (0-100) */
    private double discount;

    /**
     * Конструктор для создания объекта Product.
     *
     * @param quantity количество товаров
     * @param price цена одного товара
     * @param discount скидка на товар в процентах
     */
    public Product(int quantity, double price, double discount) {
        if (quantity <= 0 || price <= 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Параметры должны быть положительными, скидка от 0 до 100%");
        }
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для вычисления общей стоимости товаров.
     * Выводит на экран общую сумму покупки без скидки и сумму со скидкой (округлённые до 2 знаков).
     */
    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100);

        // Округление до 2 знаков
        totalWithoutDiscount = roundToTwoDecimals(totalWithoutDiscount);
        totalWithDiscount = roundToTwoDecimals(totalWithDiscount);

        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
    }

    /**
     * Метод округления значения до двух знаков после запятой.
     *
     * @param value значение для округления
     * @return округлённое значение
     */
    private double roundToTwoDecimals(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
