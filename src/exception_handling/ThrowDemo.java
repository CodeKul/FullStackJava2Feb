package exception_handling;

public class ThrowDemo {

    public static void main(String[] args) throws Exception {

        int i =19;

        if(i<18){
            System.out.println("You can not vote");
        }else {
            throw new Exception("You can vote");
        }
    }
}
