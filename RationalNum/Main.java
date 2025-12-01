package RationalNum;

public class Main {
    public static  void main(String[]args){
        Rational_num r1=new Rational_num(1,3);
        Rational_num r2=new Rational_num(1,5);

        System.out.println("r1: "+ r1);
        System.out.println("r2: "+ r2);

        System.out.println("r1+r2="+r1.add(r2));
        System.out.println("r1-r2="+r1.subtract(r2));
    }
}
