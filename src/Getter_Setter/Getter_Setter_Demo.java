package Getter_Setter;
/*Getter and setter
private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.*/

/*diff between constructor and getter,setter
When you extend a class having private data members ,
then getters and setters method will help you to access that data members in subclass.
While constructor only initialize the data members. Constructor is used to initialize object.
 */
public class Getter_Setter_Demo {
    public static class student{

        private int id;
        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        private String email;
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        private int psp;
    }

    public static void main(String[] args) {
        student s1=new student();
        //s1.id=10; this is not a good approach always we shld use method to set values to attributes of obj
        s1.setId(20);
        System.out.println(s1.getId());
        System.out.println(s1.getEmail());
    }
}
