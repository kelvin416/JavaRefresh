package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[][] irregularArray = {
                {2,4,1,2},
                {23,23},
                {2,4,6,89,90,30,20}};

        for (int[] x : irregularArray){
            for (int minutes : x){
                System.out.println(minutes + " ");
            }
        }
    }

}
