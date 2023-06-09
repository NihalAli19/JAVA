class CPU {
    double price;

    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        double cores;
        String manufacturer;

        public Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public double getCache() {
            return 4.2;
        }
    }

    class RAM {
        double memory;
        String manufacturer;

        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed() {
            return 5.3;
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        CPU cpu = new CPU(45000);
        CPU.Processor processor = cpu.new Processor(4,"Intel");
        System.out.println("Cache: "+processor.getCache());
        CPU.RAM ram = cpu.new RAM(8000000,"Corsair");
        System.out.println("Clock speed: "+ram.getClockSpeed());
    }
}
