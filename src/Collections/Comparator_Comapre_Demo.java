package Collections;

import Strings.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyCompartor implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

 class MyCompartor1 implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    class StringCompartor1 implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
           return o1.length()-o2.length();
        }
    }

class StringCompartor2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
    class Student{
        String name;
        double cgp;

        public Student(String str, double v) {
            this.name=str;
            this.cgp=v;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCgp() {
            return cgp;
        }

        public void setCgp(double cgp) {
            this.cgp = cgp;
        }
    }

    public  class Comparator_Comapre_Demo {
        public void main(String[] args) {
            //Example:1
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            list1.add(8);
            list1.add(3);
            list1.add(90);
            System.out.println(list1);
            list1.sort(null); //default natural order (asc order)
            System.out.println(list1);

            list1.sort(new MyCompartor()); //default natural order (asc order) using comparator
            System.out.println(list1);

            list1.sort(new MyCompartor1()); //default natural order (asc order) using comparator
            System.out.println(list1);

            //Example:2
            List<String> list2=new ArrayList<>();
            list2.add("Banana");
            list2.add("Apple");
            list2.add("PineApple");
            list2.sort(new StringCompartor1()); //asc order
            System.out.println(list2);

            list2.sort(new StringCompartor2()); //desc order
            System.out.println(list2);

            //using Lambda exp
            list2.sort((a,b)->a.length()-b.length());
            System.out.println(list2);
            list2.sort((a,b)->b.length()-a.length());
            System.out.println(list2);

            //Example:3
            List<Student> studentList=new ArrayList<>();
            studentList.add(new Student("raj",9.8));
            studentList.add(new Student("mohan",9.8));
            studentList.add(new Student("Suhas",6.8));
            studentList.add(new Student("Lohith",8.8));
            for(Student std:studentList){
                System.out.println(std.getName()+" "+std.getCgp());
            }
            System.out.println();
           // studentList.sort((a,b)-> (int) (b.getCgp()-a.getCgp())); //natural order but it's not possible
            // because it doesn't know on what bases we need to sort,
            // so we need to use comparable interface
            studentList.sort((a,b)->{
                    if((b.getCgp()-a.getCgp())>1){
                    return 1;
                }
               else if((b.getCgp()-a.getCgp())<1){
                    return -1;
                }
               else {
                   return 0;
                    }
                });
            for(Student std:studentList){
                System.out.println(std.getName()+" "+std.getCgp());
            }

            System.out.println();
            Comparator<Student> studentComparator = Comparator.comparing(Student::getCgp);
            studentList.sort(studentComparator);
            for(Student std:studentList){
                System.out.println(std.getName()+" "+std.getCgp());
            }

            System.out.println();
            Comparator<Student> studentComparator1 = Comparator.comparing(Student::getCgp).reversed().thenComparing(Student::getName);
            studentList.sort(studentComparator1);
            for(Student std:studentList){
                System.out.println(std.getName()+" "+std.getCgp());
            }
        }
    }

