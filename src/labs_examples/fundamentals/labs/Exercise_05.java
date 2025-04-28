package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int value1 = str.length();
        System.out.println(value1);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean value2 = str.equals(str2);
        System.out.println(value2);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println(str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        boolean str4 = str.contains("h");
        System.out.println(str4);

    }


}