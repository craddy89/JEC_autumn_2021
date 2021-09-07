package lesson04;

public class Plane {
    private String name;
    private Engine engine;

    static class Engine {
        private String name;
        private double capacity;
        private TypeEngine type;

        enum TypeEngine {
            AeroFuel;
        }
    }
}
