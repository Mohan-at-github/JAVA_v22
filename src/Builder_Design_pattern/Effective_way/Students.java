package Builder_Design_pattern.Effective_way;

public class Students {
    String name;
    String email;
    String phone;
    int age;

   private Students(Builder b) throws Exception{ //private because every one shld use only build to create object

//        if(b.age<18)
//        {
//            throw new Exception("Age count is <18");
//        }
        this.age=b.age;
        this.email=b.email;
        this.name=b.name;
        this.phone=b.phone;

        }
    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
        String name;
        String email;
        String phone;
        int age;

        public Builder setName(String name) {
            this.name = name;
            return this;//what ever object I am changing here I will return back same object
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public  Students build() throws Exception { //it return the student object and also we can perform validation
            if(this.age<18) {
               throw new Exception("Age count is <18");
           }
            if(this.name == null || this.email == null){
                throw  new Exception("Email or name is missing");
            }
            return new Students(this); //this means builder is passing itself to student and builder class the constructor of student
        }
    }
}
