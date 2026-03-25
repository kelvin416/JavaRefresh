package labs_examples.objects_classes_methods.labs.objects;

public class PlaneController {

    public static void main(String[] args) {
        Airline airline = new Airline("Kenya Airways", "Nairobi", "London");
        Cockpit cockpit =  new Cockpit(300, "JetTure");
        Wheels wheels = new Wheels(true, "Pirelli", 8);
        Airplane airplane = new Airplane(airline, cockpit, wheels, true, 290, 30000, 25000);

        System.out.println(airplane.toString());
    }
}
