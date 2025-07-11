package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class DaysController{

    private DaysOfWeek daysOfWeek;

    public DaysController(DaysOfWeek daysOfWeek){
        this.daysOfWeek = daysOfWeek;
    }

    public boolean isWeekend(){
        return this.daysOfWeek == DaysOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        DaysController daysController = new DaysController(DaysOfWeek.SUNDAY);
        System.out.println("Is it a weekend? " +daysController.isWeekend() );
    }
}

// Below is enums with value usage

enum PizzaSize{
    SMALL(8),
    MEDIUM(12),
    LARGE(16),
    EXTRA_LARGE(20);

    private final int DIAMETERININCHES;

    PizzaSize(int diameter) {
        this.DIAMETERININCHES = diameter;
    }
}

class PizzaSizeController{
    private PizzaSize pizzaSize;

    public PizzaSizeController(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void displaySize(int pizzaSize){
        System.out.println("Select size: " + pizzaSize);
        System.out.println("Diameter in inches: " + getPizzaSize());
    }

    public static void main(String[] args) {
        PizzaSizeController order = new PizzaSizeController(PizzaSize.MEDIUM);
        order.displaySize(20);
    }
}