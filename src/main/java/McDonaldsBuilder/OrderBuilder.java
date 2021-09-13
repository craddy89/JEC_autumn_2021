package McDonaldsBuilder;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

    protected static final double HAPPY_MENU_DISCOUNT = 5.0d;

    private String customerName;

    private OrderService service = OrderService.TAKE_AWAY;

    private final List<FoodItem> items = new ArrayList<>();

    public OrderBuilder() {
        super();
    }

    public OrderBuilder name(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder service(OrderService service) {
        if (service != null) {
            this.service = service;
        }
        return this;
    }

    public OrderBuilder item(FoodItem item) {
        items.add(item);
        return this;
    }

    // Комбо предложения
    public OrderBuilder vegNuggetsHappyMeal() {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new CheeseNuggets());
        foodItems.add(new Pepsi(BeverageSize.S));
        Meal meal = new Meal("Хеппи Мил Веганские Нагетсы", foodItems, HAPPY_MENU_DISCOUNT);
        return item(meal);
    }

    public OrderBuilder chickenNuggetsHappyMeal() {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new ChickenNuggets());
        foodItems.add(new CocaCola(BeverageSize.S));
        Meal meal = new Meal("Хеппи Мил Куриные Нагетсы", foodItems, HAPPY_MENU_DISCOUNT);
        return item(meal);
    }

    public OrderBuilder vegBurgerHappyMeal() {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new VegBurger());
        foodItems.add(new Pepsi(BeverageSize.S));
        Meal meal = new Meal("Хеппи Мил Веганский Бургер", foodItems, HAPPY_MENU_DISCOUNT);
        return item(meal);
    }

    public OrderBuilder chickenBurgerHappyMeal() {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new ChickenBurger());
        foodItems.add(new CocaCola(BeverageSize.S));
        Meal meal = new Meal("Хеппи Мил Куриный Бургер", foodItems, HAPPY_MENU_DISCOUNT);
        return item(meal);
    }

    public Order build() {
        Order order = new Order(service, items, customerName);
        if (!validateOrder()) {
            System.out.println("Nзвините! Заказ не может быть размещен без указания типа сервиса (Взять с собой/Кушать здесь) или без выбора хотябы одного блюда.");
            return null;
        }
        return order;
    }

    private boolean validateOrder() {
        return (service != null) && !items.isEmpty();
    }
}
