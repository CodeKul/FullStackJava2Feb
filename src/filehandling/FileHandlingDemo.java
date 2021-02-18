package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("FHdemo.txt");

            String s ="Today is Thursday";
            byte[] arr = s.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File is Written");
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("FHdemo.txt");
            int i = fileInputStream.read();

            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
//            System.out.println(i);

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }
}
