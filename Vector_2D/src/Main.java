

public class Main {
    public static void main(String[] args) {

        Vector v1= new Vector(4,3);
        Vector v2= new Vector(2,4);

        System.out.println("v1="+" "+v1);
        System.out.println("v2="+" "+v2);


        System.out.println("Addition "+ v1.add(v2));
        System.out.println("Subtraction "+v1.subtract(v2));
        System.out.println("DotProduct "+v1.DotProduct(v2));
        System.out.println("Magnitude "+v1.magnitude(v2));




    }
}