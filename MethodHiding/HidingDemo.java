package MethodHiding;

public class HidingDemo {
    public static void main(String []args){
        B b=new B();
        A a=b;
        A.aClassMethod();
        a.anInstanceMethod();

        System.out.println(b.name);
        System.out.println(a.name);
    }

}
