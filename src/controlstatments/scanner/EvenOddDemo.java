package controlstatments.scanner;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {

        int num;//100
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();

        for(int i=1;i<=num;i++){

            if(i%2==0){
                System.out.println("Even->"+i);
            }else {
                System.out.println("Odd->"+i);
            }
        }

    }
}
