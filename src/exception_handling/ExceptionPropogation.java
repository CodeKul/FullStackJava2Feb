package exception_handling;

public class ExceptionPropogation {
    public static void main(String[] args) throws Exception {
        ExceptionPropogation e = new ExceptionPropogation();
        e.c();
    }

    public void a() throws Exception{
        int i=10/0;
    }

    public void b() throws Exception {
        this.a();
    }

    public void c() throws Exception {
//        try {
            this.b();
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}

