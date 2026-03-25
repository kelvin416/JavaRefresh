package labs_examples.arrays.labs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class  Exercise_03 {

    public static void main(String[] args) {

        int[][] arrays2 = new int[5][5];

        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                arrays2[i][j] = i * j;
            }
        }

//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <=5; j++){
//                System.out.println(arrays2[i][j]);
//            }
//        }

        for (int[] outer : arrays2){
            for (int inner : outer){
                System.out.println(inner);
            }
        }

        getTime();
        
    }

    public static String getTime(){
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return time;
    }
}
