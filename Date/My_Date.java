package Date;
import java.util.Scanner;

// MyDate class
public class My_Date {
        // Attributes
        int date;
        int month;
        int year;

        // Default constructor
        My_Date() {
            date = 1;
            month = 1;
            year = 1;
        }

        // Parameterized constructor
        My_Date(int year, int date, int month) {
            this.date = date;
            this.month = month;
            this.year = year;
        }

        // Method to set the date
        void set() {
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter year : ");
                year = sc.nextInt();
                System.out.print("Enter date (1-31): ");
                date = sc.nextInt();
                System.out.print("Enter month (1-12): ");
                 month = sc.nextInt();

        }



        // Display UK format: DD/MM/YYYY
        void displayUKDate() {
            System.out.println("UK Date: " + String.format("%02d/%02d/%04d", date, month, year));
        }
        // Display US format: MM/DD/YYYY
        void displayUSDate() {
            System.out.println("US Date: " + String.format("%02d/%02d/%04d", month, date, year));
        }
    }


