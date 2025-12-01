package EqualsPractice2;


public class Q4 {
    public  static void main(String []args){
       RationalNumber r1=new RationalNumber(10,5);
       RationalNumber r2=new RationalNumber(10,5);
        Object o1=r1;
        Object o2=r2;
        System.out.println(r1.equals(r2));
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(o2));
        System.out.println(o1.equals(r2));
        System.out.println(r1.equals(o1));
    }
}
