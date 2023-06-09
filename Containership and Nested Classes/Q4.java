//
//class Vehicle {
//    private String vehicleName;
//    private int engineCC;
//    private String model;
//    private Owner owner;
//
//    public Vehicle(String vehicleName, int engineCC, String model) {
//        this.vehicleName = vehicleName;
//        this.engineCC = engineCC;
//        this.model = model;
//    }
//
//    public void display() {
//        System.out.println("Vehicle Name: " + vehicleName);
//        System.out.println("Engine CC: " + engineCC);
//        System.out.println("Model: " + model);
//        if (owner != null) {
//            System.out.println("Owner's Name: " + owner.getOwnerName());
//            System.out.println("CNIC: " + owner.getCnic());
//        }
//    }
//
//    static class Owner {
//        private String ownerName;
//        private String cnic;
//        private String phoneNumber;
//
//        public Owner(String ownerName, String cnic, String phoneNumber) {
//            this.ownerName = ownerName;
//            this.cnic = cnic;
//            this.phoneNumber = phoneNumber;
//        }
//
//        public String getOwnerName() {
//            return ownerName;
//        }
//
//        public void setOwnerName(String ownerName) {
//            this.ownerName = ownerName;
//        }
//
//        public String getCnic() {
//            return cnic;
//        }
//
//        public void setCnic(String cnic) {
//            this.cnic = cnic;
//        }
//
//        public String getPhoneNumber() {
//            return phoneNumber;
//        }
//
//        public void setPhoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//        }
//    }
//    public static void main(String[] args) {
//
//        Vehicle car = new Vehicle("Toyota Corolla", 1800, "2019") {
//            @Override
//            public void display() {
//                super.display();
//                if (owner != null) {
//                    System.out.println("Phone Number: " + owner.getPhoneNumber());
//                }
//            }
//        };
//        car.display();
//
//        Vehicle.Owner owner = new Vehicle.Owner("John Doe", "12345-67890-1234", "123-456-7890");
//        car.owner = owner;
//    }
//}
