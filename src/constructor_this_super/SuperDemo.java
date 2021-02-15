package constructor_this_super;

public class SuperDemo {

    public static void main(String[] args) {

        B b = new B(1);
    }
}

class A {//base class/parent class

    public A() {
        System.out.println("In A Cont");
    }
    public A(int i){
        System.out.println("In parameter A");
    }
}

class B extends A{//derived class  / child class
    public B() {
        System.out.println("In B cont");
    }

    public B(int i){
        super(i);

        System.out.println("In parameter B");
    }
}
