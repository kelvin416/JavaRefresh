package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {
    public static void main(String[] args) {
        Airline airline = new Airline("Kenya Airways", false, "Kenya");
        Cockpit cockpit = new Cockpit("Airbus", 3, true);
        EngineAssembly engineAssembly = new EngineAssembly("Airbus", 4);
        Wheels wheels = new Wheels(56,true, "Pirelli");
        Airplane airplane = new Airplane(wheels, engineAssembly, cockpit, airline, 32000, 23000);

        System.out.println(airplane);
    }
}
