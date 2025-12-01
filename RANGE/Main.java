package RANGE;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        Range r1=new Range(5);
        Range r2=new Range(1,10);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("contain 6: "+r1.contains(6));
        System.out.println("contain 6: "+r2.contains(6));

        System.out.println("r1 size: "+r1.size());
        System.out.println("r2 size: "+r2.size());
    }
}
