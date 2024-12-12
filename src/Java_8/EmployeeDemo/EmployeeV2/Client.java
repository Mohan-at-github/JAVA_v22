package Java_8.EmployeeDemo.EmployeeV2;

public class Client {
    public static void main(String[] args) {
        //without Java-8
        Employee employee = new EmployeeImpl();
        System.out.println(employee.getName("Mohan"));

        //with Java-8
        //here no need any separate object of Impl class to pass the para and execute
        //we can directly use the Functional Interface and Lambda Expression
        Employee employee1=name->(name);
        System.out.println(employee1.getName("Lohith"));
    }
}

