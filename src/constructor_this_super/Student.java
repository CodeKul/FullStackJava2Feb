package constructor_this_super;

public class Student {

    //instance variable
    int id;
    String name;
    String add;

    public Student(int id, String name, String add) {//Local Variable
        this.id = id;
        this.name = name;
        this.add = add;
        System.out.println("In constructor");
    }

    public Student(){

    }

    private void show() {
        System.out.println("id->" + id + "name->" + name + "add->" + add);
    }


    public static void main(String[] args) {
        Student student = new Student(1,"Hari","Pune");
        Student student1 = new Student(1,"Hari","Pune");
        Student student2 = new Student(1,"Hari","Pune");
        Student student3 = new Student(1,"Hari","Pune");
        student.show();

    }


}
