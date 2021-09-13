package McDonaldsBuilder;

public class Main {
    public static void main(String[] args) {
        OrderBuilder builder1 = new OrderBuilder();

        Order meal1 = builder1.name("Ivan").service(OrderService.TAKE_AWAY).item(new ChickenBurger())
                .item(new Pepsi(BeverageSize.M)).vegNuggetsHappyMeal().build();
        BillPrinter.printItemisedBill(meal1);

        OrderBuilder builder2 = new OrderBuilder();
        Order meal2 = builder2.name("Micheal").service(OrderService.EAT_HERE).item(new ChickenNuggets())
                .item(new CheeseNuggets()).item(new CocaCola(BeverageSize.L)).chickenBurgerHappyMeal()
                .item(new HotChocolate(BeverageSize.M)).vegBurgerHappyMeal().build();
        BillPrinter.printItemisedBill(meal2);
    }
}
