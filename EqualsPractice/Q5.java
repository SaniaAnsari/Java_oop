package EqualsPractice;

public class Q5 {
    public  static void main(String []args){
        RationalNumber r1=new RationalNumber(10,9);
        RationalNumber r2=new RationalNumber(10,9);
         Object o1=r1;
         Object o2=r2;
        System.out.println(r1.equals(r2));
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(o2));
        System.out.println(o1.equals(r2));
        System.out.println(r1.equals(o1));

        Object o3=null;
        System.out.println(r1.equals(o3));



    }
}
