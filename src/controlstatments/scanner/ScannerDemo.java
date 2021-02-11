package controlstatments.scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        int num;
        String s;
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter number");
        num = scanner.nextInt();


        System.out.println(num);
    }
}
