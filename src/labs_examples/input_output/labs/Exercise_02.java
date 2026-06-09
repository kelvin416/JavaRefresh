package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */


class Exercise2{
    public static void main(String[] args) {
        System.out.println("This class encrypts text written");

        String inputPath = "src/labs_examples/input_output/files/char_data.txt";
        String outputPath = "src/labs_examples/input_output/labs/encrypted_data.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath))){

            int character;

            while ((character = bufferedReader.read()) != -1){

                char originalChar = (char) character;
                char encryptedChar = originalChar;

                if (originalChar == 'a'){
                    encryptedChar = '~';
                } else if (originalChar == 'e') {
                    encryptedChar = '@';
                }
                bufferedWriter.write(encryptedChar);
            }

            System.out.println("Encryption Complete...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
