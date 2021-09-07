package lesson04;

public class Car {
    private String name;
    private String number;
    private Engine engine;
    private Salon salon;
    private Transmission transmission;

    public static class FactoryEngine {
        public static Car.Engine getEngine(Complect complect) {
            return switch (complect) {
                case Trend -> new Engine("TDI",
                        Engine.TypeEngine.Diesel, 100);
                case Lux -> new Engine("Electron100",
                        Engine.TypeEngine.Electric, 100);
                default -> throw new IllegalArgumentException("No such complect");
            };
        }
    }

    static class Engine {
        private final String name;
        private final TypeEngine type;
        private final double capacity;

        public Engine() {
            this("Base", TypeEngine.Gas, 90);
        }

        public Engine(String name, TypeEngine type, double capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }


        public String getName() {
            return name;
        }

        public TypeEngine getType() {
            return type;
        }

        public double getCapacity() {
            return capacity;
        }

        enum TypeEngine {
            Gasoline, Diesel, Gas, Electric
        }

        @Override
        public String toString() {
            return "Engine{" +
                   "name='" + name + '\'' +
                   ", type=" + type +
                   ", capacity=" + capacity +
                   '}';
        }
    }

    enum Complect {
        Trend, Lux
    }

    static class Salon {
        private String type;
    }

    enum Transmission {
        Mechanic, Automatic
    }

    public Car(String name, String number, Complect complect) {
        this.name = name;
        this.number = number;
        this.engine = FactoryEngine.getEngine(complect);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
