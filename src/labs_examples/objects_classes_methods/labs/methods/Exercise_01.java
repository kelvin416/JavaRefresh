package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int a = 8;
        int b = 4;

        int multi = multiply(a, b);
        int divide = divide(a, b);

        int argsExample = countArgs("hello", "world");

        System.out.println(multi);
        System.out.println(divide);
        System.out.println(joke());
        System.out.println(argsExample);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    static boolean joke(){
        System.out.println("That cat got scared from a pin drop.");
        return false;
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    static int secondsInYears(int years){
        return years * 365 * 24 * 60 * 60;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed

    static int countArgs (String... args){
        int count = 0;
        for(String length : args){
            count ++;
        }

        return count;
    }






}
