public class Employee {
    String name;
    String salary;
           //default Constructor
    Employee(){
        System.out.println("Welcome to the Employee portal!");
    }
          //parametrized constructor
    Employee(String name ,String salary){
        this.name=name;
        this.salary=salary;
    }
    public void DisplayEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);

    }
}
