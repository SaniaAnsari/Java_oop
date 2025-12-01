package Complex_numbers;

public class Main {
    public static  void main(String[]args) throws CloneNotSupportedException {
        ComplexNum c1= new ComplexNum(3,4);
        ComplexNum c2= new ComplexNum(1,-5);
        ComplexNum c3= new ComplexNum(3,4);
        //ComplexNum c4= (ComplexNum)c1.clone();
        System.out.println("ComplexNum c1="+c1);
        System.out.println("ComplexNum c2="+c2);
        System.out.println("ComplexNum clone of c1="+c3);

        System.out.println("c1+c2="+ComplexNum.add(c1,c2));
        System.out.println("c1-c2="+ComplexNum.subtract(c1,c2));
        System.out.println("c1*c2="+ComplexNum.multiply(c1,c2));
        System.out.println("Conjugate of c1"+ComplexNum.conjugate(c1));
        System.out.println("check c1 equals c2: "+c1.equals(c2));
        System.out.println("check c1 equals c3: "+c1.equals(c3));
    }
}
