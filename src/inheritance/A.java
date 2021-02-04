package inheritance;

public class A {
    //Parent class , Super Class , base class

    int i;
    int j;
    int k;

    public void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {
        A a = new A();
        a.i=1;
        a.j=2;
    }
}

class B extends A{
    //Child class derived claas, sub class

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class C extends B{

    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}