package McDonaldsBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.DoubleAdder;

public class BillPrinter {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void printItemisedBill(Order order) {
        OrderService service = order.getService();
        System.out.printf("%85s\n", "Ресторан 'МакДональдс' ");
        System.out.println("=================================================================================================================");
        System.out.printf("Сервис: %10s (%2.2f Налог)                                                         Nмя заказчика: %-20s\n", service.getName(), service.getTax(), order.getCustomerName());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s | %10s | %10s | %10s | %10s | %10s | %15s\n", "Блюдо", "Калорийность", "Подача", "Цена", "Цена пакования", "Скидка %", "Всего: ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        DoubleAdder itemTotalPrice = new DoubleAdder();
        order.getFoodItems().forEach(item -> {
            String name = item.name();
            int calories = item.calories();
            Packing packing = item.packing();
            double price = item.price();
            double packingPrice = packing.packingPrice();
            double discount = item instanceof Meal ? ((Meal) item).getDiscount() : 0.0d;
            double totalItemPrice = calculateTotalItemPrice(price, packingPrice, discount);
            System.out.printf("%25s | %10d | %10s | %10.2f | %15.2f | %10.2f | %10.2f\n", name, calories, packing.pack(), price, packing.packingPrice(), discount, totalItemPrice);
            itemTotalPrice.add(totalItemPrice);
        });
        System.out.println("=================================================================================================================");
        double billTotal = itemTotalPrice.doubleValue();
        billTotal = applyTaxes(billTotal, service);
        System.out.printf("Дата: %5s %75s %.2f\n", dtf.format(LocalDateTime.now()), "Nтоговая цена (учит. налоги):", billTotal);
        System.out.println("Приятного аппетита!\n\n\n\n");
    }

    private static double applyTaxes(double billTotal, OrderService service) {
        return billTotal + (billTotal * service.getTax()) / 100;
    }

    private static double calculateTotalItemPrice(double price, double packingPrice, double discount) {
        if (discount > 0.0d) {
            price = price - (price * discount) / 100;
        }
        return price + packingPrice;
    }
}
