package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Exe01 {
}

class Animal{

    private String sound;
    private String movement;
    private int noOfLegs;

    public Animal(String sound, String movement, int noOfLegs) {
        this.sound = sound;
        this.movement = movement;
        this.noOfLegs = noOfLegs;
    }
}
class Dog extends Animal{

    private String breed;

    public Dog(String sound, String movement, int noOfLegs, String breed) {
        super(sound, movement, noOfLegs);
        this.breed = breed;
    }
}
class GermanShepherd extends Dog{

    private String name;
    private int age;


    public GermanShepherd(String sound, String movement, int noOfLegs, String breed, String name, int age) {
        super(sound, movement, noOfLegs, breed);
        this.name = name;
        this.age = age;
    }
}
