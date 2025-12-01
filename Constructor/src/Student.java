public class Student {
        String name;
        String age;
        String roll_no;
             // parameterized constructor
        Student(String name, String age, String roll_no ){
            this.name =name;
            this.age = age;
            this.roll_no =roll_no;
        }
             //Copy Constructor
        Student(Student S){
            name=S.name;
            age=S.age;
            roll_no=S.roll_no;

        }
        public  void displayInfo(){
            System.out.println("Name: " +name);
            System.out.println("Age: "+ age);
            System.out.println("Roll_No: "+roll_no);

        }
}

