package vehicles;

public static class Engine extends Vehicle {
    
    public Engine(String model) {
    super(model);
}
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public void setMake(String make) {
    MAKE = make;
    }

    
    // Nested static class
    public static class Engine {

        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Getter untuk MAKE
        public static String getMake() {
            return MAKE;
        }

        // Getter untuk CAPACITY
        public static int getCapacity() {
            return CAPACITY;
        }
    }


    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;

        System.out.println("Vehicle manufactured");
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE
                + "\nThe model type is " + model
                + "\nThe chassis number is " + chassisNo
                + "\nThe engine make is " + Engine.getMake()
                + "\nThe engine capacity is " + Engine.getCapacity();
    }
}
