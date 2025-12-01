package Comparator;


    public class Employee  {
        String name;
        int id;
        int Salary;

        Employee(String name,int id,int Salary){
            this.id=id;
            this.name=name;
            this.Salary=Salary;
        }


        @Override
        public String toString() {
            return "Name "+name+" id "+id+" Salary "+Salary;
        }
    }


