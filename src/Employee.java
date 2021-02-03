public class Employee {

    int id;
    String emp_name;
    String email;
    int mobile;

    public static String show(){
        return "Hello";
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.email="vaibhav@gmail.com";
        employee.emp_name="Vaibhav";
        employee.mobile=43424323;
        System.out.println(employee.id);
    }
}
