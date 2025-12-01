package MethodHiding;

import java.awt.*;

public class A {
    public String name="Base";
    public  String getName(){
        return name;
    }
    public static void aClassMethod(){
        System.out.println("The class method in A. ");
    }
    public void anInstanceMethod(){
        System.out.println("The instance method in A.");
    }
}
