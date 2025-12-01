package Interface_error;

public class Q7 {
    public static void main (String [] args){
        //1)Instantiate F (concrete)
        F f=new F();
        System.out.println("f.m()="+f.m());
        System.out.println("f.n()="+f.n());
        System.out.println("f.o()="+f.o());
        //2)Use E reference to E object
        E e= new E() ;

        System.out.println("e.m()="+e.m());
        System.out.println("e.n()="+e.n());
        System.out.println("e.o()="+e.o());
        //2)Use interface type C to refer to F
        C c=new F();

        System.out.println("c.m()="+c.m());
        System.out.println("c.n()="+c.n());
        System.out.println("c.o()="+(((E)c).o()));

    }
}
