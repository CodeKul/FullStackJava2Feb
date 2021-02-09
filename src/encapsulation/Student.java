package encapsulation;

public class Student {

    private int id=1;
    private String name="Rahul";
    private String add="Pune";

    public static void main(String[] args) {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

}

class Main{

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getId());
        System.out.println(student.getAdd());
        System.out.println(student.getName());
    }
}

class Main1{
    public static void main(String[] args) {
        Student student =new Student();

        System.out.println(student.getId());
    }

}