package test2;

import test.Employee;

public class Sample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id=1;
        employee.add="Pune";
        employee.name="Yogesh";

        System.out.println("Id is "+employee.id+" Name is "+employee.name+" Add is "+employee.add);

    }
}
