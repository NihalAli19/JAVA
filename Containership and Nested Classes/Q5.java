class Car {
    String carName, carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    private String getCarname() {
        return carName;
    }

    class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public void check() {
            if (carType.equals("4T")) {
                if (carName.equals("Mehran")) {
                    setEngineType("Small");
                }
                else {
                    setEngineType("Bigger");
                }
            }
        }
    }
}
public class Q5 {
    public static void main(String[] args) {

        Car car = new Car("Mehran", "4T");
        Car.Engine engine = car.new Engine("Medium");
        engine.check();
        System.out.println("Engine type: "+engine.getEngineType());

    }
}
