package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileWriter = new FileWriter("FileWriter.txt");
            fileWriter.write("Today is Friday");
            System.out.println("File is written SuccessFully..");
            fileWriter.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


        try {
            fileReader = new FileReader("FileWriter.txt");
            int i = fileReader.read();

            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


    }
}
