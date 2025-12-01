package MethodHiding;

public  class B extends A{
    public String name="Sub";
    public  String getName(){
        return name;
    }
    public static void aClassMethod(){
        System.out.println("The class method in B. ");
    }
    public void anInstanceMethod(){
        System.out.println("The instance method in B.");
    }
    
}
