package exception_handling;

public class StackOverFlow {

    public static void recursive(int i) {
        System.out.println("i->" + i);
        if (i == 0) {
            return;
        } else {
            recursive(i);
        }
    }


    public static void main(String[] args) {

        recursive(1);
    }
}
