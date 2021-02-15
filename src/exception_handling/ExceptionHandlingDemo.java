package exception_handling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        StackOverFlow.recursive(1);


        int i = 10;
        String s = null;

        System.out.println(s.length());
        
        try {
            int j = i / 0;

            System.out.println(j);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello");

    }
}
