package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try( FileWriter fileWriter =new FileWriter("FileWriter.txt")) {
            fileWriter.write("Today is Friday");
            System.out.println("File is written SuccessFully..");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("FileWriter.txt")){
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
