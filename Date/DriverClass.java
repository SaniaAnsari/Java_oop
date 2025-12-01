package Date;

import java.util.Scanner;

// Driver class
public class DriverClass {
    public static void main(String[]args){
                // Using default constructor
                My_Date date1 = new My_Date();
                System.out.println("Default date:");
                date1.displayUKDate();
                date1.displayUSDate();

                // Using parameterized constructor
                My_Date date2 = new My_Date(2025, 5, 11); // year=2025, date=5, month=11
                System.out.println("\nParameterized date:");
                date2.displayUKDate();
                date2.displayUSDate();

                // Using set method
                My_Date date3 = new My_Date();
                System.out.println("\nSet new date:");
                date3.set();
                date3.displayUKDate();
                date3.displayUSDate();
            }
        }



