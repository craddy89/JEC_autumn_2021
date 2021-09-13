package McDonaldsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private final List<FoodItem> foodItems;

    private String customerName;
    private final OrderService service;

    public Order(OrderService service, List<FoodItem> foodItems, String customerName) {
        super();
        if (Objects.isNull(service)) {
            throw new IllegalArgumentException(
                    "Блюдо не может быть заказано без выбора сервиса 'Взять с собой' или 'Кушать здесь'");
        }
        if (Objects.isNull(foodItems) || foodItems.stream().noneMatch(Objects::nonNull)) {
            throw new IllegalArgumentException(
                    "Блюдо не может быть заказано без выбора хотя бы одного блюда");
        }
        this.service = service;
        this.foodItems = new ArrayList<>(foodItems);
        this.customerName = customerName;
        if (this.customerName == null) {
            this.customerName = "Без имени";
        }
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderService getService() {
        return service;
    }

}
