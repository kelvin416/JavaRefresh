package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Exercise1{
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        String inputPath = "src/labs_examples/input_output/files/byte_data";
        String outputPath = "src/labs_examples/input_output/labs/byte_data_copy";

        try{
            fileInputStream = new FileInputStream(inputPath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream(outputPath);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer,0,bytesRead));
                bufferedOutputStream.write(buffer, 0 , bytesRead);
            }

            System.out.println();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}