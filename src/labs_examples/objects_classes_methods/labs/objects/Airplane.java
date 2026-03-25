package labs_examples.objects_classes_methods.labs.objects;

class Airplane {

    Airline airline;
    Cockpit cockpit;
    Wheels wheels;
    private boolean isLegal;
    private double noOfPassengers;
    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(Airline airline, Cockpit cockpit,
                    Wheels wheels, boolean isLegal,
                    double noOfPassengers, double fuelCapacity, double currentFuelLevel) {
        this.airline = airline;
        this.cockpit = cockpit;
        this.wheels = wheels;
        this.isLegal = isLegal;
        this.noOfPassengers = noOfPassengers;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public boolean isLegal() {
        return isLegal;
    }

    public void setLegal(boolean legal) {
        isLegal = legal;
    }

    public double getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(double noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nairline=" + airline +
                ", \ncockpit=" + cockpit +
                ", \nwheels=" + wheels +
                ", \nisLegal=" + isLegal +
                ", \nnoOfPassengers=" + noOfPassengers +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class Airline{
    private String name;
    private String airlineOrigin;
    private String airlineDestination;

    public Airline(String name, String airlineOrigin, String airlineDestination) {
        this.name = name;
        this.airlineOrigin = airlineOrigin;
        this.airlineDestination = airlineDestination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirlineOrigin() {
        return airlineOrigin;
    }

    public void setAirlineOrigin(String airlineOrigin) {
        this.airlineOrigin = airlineOrigin;
    }

    public String getAirlineDestination() {
        return airlineDestination;
    }

    public void setAirlineDestination(String airlineDestination) {
        this.airlineDestination = airlineDestination;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", airlineOrigin='" + airlineOrigin + '\'' +
                ", airlineDestination='" + airlineDestination + '\'' +
                '}';
    }
}

class Wheels{
    private boolean replacedWheels;
    private String wheelsBrand;
    private int noOfWheels;


    public Wheels(boolean replacedWheels, String wheelsBrand, int noOfWheels) {
        this.replacedWheels = replacedWheels;
        this.wheelsBrand = wheelsBrand;
        this.noOfWheels = noOfWheels;
    }

    public boolean isReplacedWheels() {
        return replacedWheels;
    }

    public void setReplacedWheels(boolean replacedWheels) {
        this.replacedWheels = replacedWheels;
    }

    public String isWheelsBrand() {
        return wheelsBrand;
    }

    public void setWheelsBrand(String wheelsBrand) {
        this.wheelsBrand = wheelsBrand;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "replacedWheels=" + replacedWheels +
                ", wheelsBrand=" + wheelsBrand +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}

class Cockpit{
    private int seats;
    private String cockpitBrand;

    public Cockpit(int seats, String cockpitBrand) {
        this.seats = seats;
        this.cockpitBrand = cockpitBrand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCockpitBrand() {
        return cockpitBrand;
    }

    public void setCockpitBrand(String cockpitBrand) {
        this.cockpitBrand = cockpitBrand;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "seats=" + seats +
                ", cockpitBrand='" + cockpitBrand + '\'' +
                '}';
    }
}

