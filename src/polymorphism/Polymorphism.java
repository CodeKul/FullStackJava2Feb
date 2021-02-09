package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.add(1.8f,8));
//        System.out.println(polymorphism.add(1,8,9));
    }

    public float add(float i,int j){
       return i+j;
    }


    public float add(float i,int j,int k){
        return i+j;
    }



}


