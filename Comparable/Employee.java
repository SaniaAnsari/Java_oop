package Comparable;

public class Employee implements Comparable<Employee> {
    String name;
    int id;
    int Salary;

    Employee(String name,int id,int Salary){
        this.id=id;
        this.name=name;
        this.Salary=Salary;
    }
    public int compareTo(Employee E){
        return this.id-E.id;
    }

    @Override
    public String toString() {
        return "Name "+name+" id "+id+" Salary "+Salary;
    }
}
