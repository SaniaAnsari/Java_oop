package N_DimensionalVector;

import java.util.Scanner;

public class Main {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Ask user for dimension
        System.out.print("Enter the dimension of the vector: ");
        int n = sc.nextInt();

        //Create vector with given size
        vector v1 = new vector(n);

        //Take input for v1
        System.out.println("Enter " + n + " elements of vector v1:");
        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            v1.set(i, value);
        }

        //Create another vector
        vector v2 = new vector(n);
        System.out.println("Enter " + n + " elements of vector v2:");
        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            v2.set(i, value);
        }

        // Print vectors
        System.out.println("Vector v1: " + v1);
        System.out.println("Vector v2: " + v2);

        //Add vectors
        vector sum = v1.add(v2);
        System.out.println("Sum of v1 and v2: " + sum);

        //Clone v1
        vector v1clone=v1.clone();
        System.out.println("Cloned v1: "+v1clone);

        //Check equality
        System.out.println("v1 equals v2? "+v1.equals(v2));
        System.out.println("v1 equals v1clone? "+v1.equals(v1clone));

        //For-each loop to print elements of v1
        System.out.print("Elements of v1 using for-each: ");
        for (double value : v1) {
            System.out.print(value + " ");
        }
    }
}


