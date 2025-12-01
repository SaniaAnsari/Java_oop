package TestSuff;

public class Q3 {
    public static void main (String[]args){
        stuff s=new stuff("in",5);
        System.out.println(s);

        double doubleValue=2.5;
        s.doSomething(doubleValue);
        s=new stuff("more",3);
        String str="words";

        System.out.println(s.changeSomething(str));
        System.out.println(s);
        System.out.println(str);
    }
}
