package McDonaldsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meal implements FoodItem{

    private final List<FoodItem> foodItems;
    private final String mealName;
    private final double discount;

    public Meal(String mealName,List<FoodItem> foodItems, double discount) {
        super();
        if (Objects.isNull(foodItems) || foodItems.stream().noneMatch(Objects::nonNull)) {
            throw new IllegalArgumentException("Нельзя заказать блюдо без выбора состава этого же блюда");
        }
        this.foodItems = foodItems;
        this.mealName = mealName;
        this.discount = discount;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public String getMealName() {
        return mealName;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String name() {
        return mealName;
    }

    @Override
    public int calories() {
        int totalCalories = foodItems.stream().mapToInt(FoodItem::calories).sum();
        return totalCalories;
    }

    @Override
    public Packing packing() {
        double packingPrice = foodItems.stream().map(FoodItem::packing)
                .mapToDouble(Packing::packingPrice).sum();
        return new MultiPack(packingPrice);
    }

    @Override
    public double price() {
        return 0;
    }
}
