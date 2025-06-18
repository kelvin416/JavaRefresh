package labs_examples.objects_classes_methods.labs.objects;

class Airplane {
    Wheels wheels;
    EngineAssembly engineAssembly;
    Cockpit cockpit;
    Airline airline;
    private double fuelCapacity;
    private int currentFuelLevel;

    public Airplane(Wheels wheels, EngineAssembly engineAssembly, Cockpit cockpit, Airline airline, double fuelCapacity, int currentFuelLevel) {
        this.wheels = wheels;
        this.engineAssembly = engineAssembly;
        this.cockpit = cockpit;
        this.airline = airline;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public EngineAssembly getEngineAssembly() {
        return engineAssembly;
    }

    public void setEngineAssembly(EngineAssembly engineAssembly) {
        this.engineAssembly = engineAssembly;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nwheels=" + wheels.toString() +
                ", \nengineAssembly=" + engineAssembly.toString() +
                ", \ncockpit=" + cockpit.toString() +
                ", \nairline=" + airline.toString() +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class Wheels {
    private int wheelSize;
    private boolean isWheelNew;
    private String brand;

    public Wheels(int wheelSize, boolean isWheelNew, String brand) {
        this.wheelSize = wheelSize;
        this.isWheelNew = isWheelNew;
        this.brand = brand;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public boolean isWheelNew() {
        return isWheelNew;
    }

    public void setWheelNew(boolean wheelNew) {
        isWheelNew = wheelNew;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelSize=" + wheelSize +
                ", isWheelNew=" + isWheelNew +
                ", brand='" + brand + '\'' +
                '}';
    }
}

class Airline{
    private String name;
    private boolean isProfitable;
    private String homeLocation;

    public Airline(String name, boolean isProfitable, String homeLocation) {
        this.name = name;
        this.isProfitable = isProfitable;
        this.homeLocation = homeLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProfitable() {
        return isProfitable;
    }

    public void setProfitable(boolean profitable) {
        isProfitable = profitable;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", isProfitable=" + isProfitable +
                ", homeLocation='" + homeLocation + '\'' +
                '}';
    }
}

class EngineAssembly{
    private String brand;
    private int turbineNo;

    public EngineAssembly(String brand, int turbineNo) {
        this.brand = brand;
        this.turbineNo = turbineNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTurbineNo() {
        return turbineNo;
    }

    public void setTurbineNo(int turbineNo) {
        this.turbineNo = turbineNo;
    }

    @Override
    public String toString() {
        return "EngineAssembly{" +
                "brand='" + brand + '\'' +
                ", turbineNo=" + turbineNo +
                '}';
    }
}

class Cockpit{
    private String brand;
    private int yearsUsed;
    private boolean noLightShown;

    public Cockpit(String brand, int yearsUsed, boolean noLightShown) {
        this.brand = brand;
        this.yearsUsed = yearsUsed;
        this.noLightShown = noLightShown;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearsUsed() {
        return yearsUsed;
    }

    public void setYearsUsed(int yearsUsed) {
        this.yearsUsed = yearsUsed;
    }

    public boolean isNoLightShown() {
        return noLightShown;
    }

    public void setNoLightShown(boolean noLightShown) {
        this.noLightShown = noLightShown;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "brand='" + brand + '\'' +
                ", yearsUsed=" + yearsUsed +
                ", noLightShown=" + noLightShown +
                '}';
    }
}
