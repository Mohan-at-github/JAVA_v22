package Java_8.EmployeeDemo;

public class Client {
    public static void main(String[] args) {
        //With out Java-8
        Employee employee=new SoftwareEngineer();
        System.out.println(employee.getName());

        //with Java-8
        //no need Interface Impl class
        Employee se = () -> "Software Engineer";
        System.out.println(se.getName());
        Employee auditor=()->"Auditor";
        System.out.println(auditor.getName());
    }
}
