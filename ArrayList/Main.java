package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args){
        ArrayList <Point> pArrayList = new ArrayList<>();//ERROR ArrayList pArrayList = new ArrayList<>();
        pArrayList.add(new Point(10, 20));
        pArrayList.add(new Point(5, 10));
        // Print the x-coordinate of the 2nd element (index 1)
        System.out.println("X-coordinate of 2nd element: " + pArrayList.get(1).x);
    }
}

