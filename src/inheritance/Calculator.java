package inheritance;

public class Calculator {

    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();
        subtraction.i=6;
        subtraction.j=8;

        subtraction.add();
        System.out.println("Addition =>"+subtraction.k);

        subtraction.sub();
        System.out.println("Subtraction=>"+subtraction.k);

    }
}

class Addition{

    int i,j,k,l;

    public void add(){
        k=i+j;
    }
}

class Subtraction extends Addition{

    public void sub(){
        k=i-j;
    }
}
class Multiplication extends Addition{

    public void multi(){
        k=i*j;
    }
}


