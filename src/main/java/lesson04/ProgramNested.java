package lesson04;

import java.util.Locale;

public class ProgramNested {
    public static void main(String[] args) {
        Car.Engine engineBMW = new Car.Engine();
        Car.Engine.TypeEngine typeEngine = Car.Engine.TypeEngine.Electric;
        System.out.println(engineBMW.toString().toUpperCase(Locale.ROOT));

    }
}
