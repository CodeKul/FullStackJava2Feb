package controlstatments;

public class IfElseDemo {

    public static void main(String[] args) {


        int a=1000,b=200,c=30;

        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("C is greater");
        }


        int age =19;
        String natinality = "Indian";

        if(age>18){
            if(natinality=="Indian"){
                System.out.println("You can vote");
            }else {
                System.out.println("Not indian");
            }
        }else {
            System.out.println("You can not vote");
        }

        int i=0;
        if(i>0){
            System.out.println("i is positive");
        }else {
            System.out.println("i is zero or -ve");
        }


        String s = i>0?"i is positive":"i is zero or -ve";


        System.out.println(s);


    }
}
