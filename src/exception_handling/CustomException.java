package exception_handling;

public class CustomException {


    public static void main(String[] args) {
        int i=1;

        if(i>0){
            try {
                throw new MyException("i is greater than 0");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

class MyException extends Exception{

    public MyException(String msg){
        super(msg);
    }
}