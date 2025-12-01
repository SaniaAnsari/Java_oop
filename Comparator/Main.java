package Comparator;

import java.util.Arrays;

public class Main {
    public  static void main(String[]args){
        Employee[]empArr=new Employee[4];
        empArr[0]=new Employee("Sania",127,20000);
        empArr[1]=new Employee("zoha",128,50000);
        empArr[2]=new Employee("ayesha",129,40000);
        empArr[3]=new Employee("laiba",130,60000);

        Arrays.sort(empArr,new SortByName());
       System.out.println(Arrays.toString(empArr));
    }
}
