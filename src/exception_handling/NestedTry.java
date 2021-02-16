package exception_handling;

public class NestedTry {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            try {
                int k = i / j;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exc=>" + e);
            }
            String s = null;
            System.out.println(s.length());

            String s1 = "S";
            int l = Integer.parseInt(s1);
        } catch (ArithmeticException e) {
            System.out.println("Arith=>" + e);
        } catch (NullPointerException e) {
            e.printStackTrace();
//            System.out.println("Nullpointer =>" + e);
        } catch (Exception e) {
            System.out.println("parent Exception=>"+e);
        } finally {
            System.out.println("Finnaly Printed");
        }


    }
}
