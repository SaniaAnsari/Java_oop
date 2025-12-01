//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1= new Book("java programming","SA",999);
        b1.displayBook();
        System.out.println("-------------------------------------");

        Employee e1=new Employee();
        Employee e2=new Employee("Ali","60000");
        e1.DisplayEmployee();
        e2.DisplayEmployee();
        System.out.println("--------------------------------------");

        Student s1= new Student("Sara","20","201");
        Student s2= new Student(s1);
        s1.displayInfo();
        System.out.println("Copy Constructor");
        s2.displayInfo();
    }
}

