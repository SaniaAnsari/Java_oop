package MoneyChanger;

import java.text.SimpleDateFormat;
import java.util.Date;

class Cashier extends Person {
    public Cashier(String name) {
       super(name);
    }

    public void generateBill(Customer c) {
        double total = c.calculateTotal();

        //  Bill Header
        System.out.println("=====================================");
        System.out.println("           SMART MART RECEIPT       ");
        System.out.println("=====================================");
        System.out.println("Cashier: " + name);
        System.out.println("Date: " + new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date()));
        System.out.println("-------------------------------------");

        // Items Section
        c.showItems();

        System.out.println("-------------------------------------");
        System.out.printf("%-15s Rs. %.2f\n", "Total Bill:", total);
        System.out.println("=====================================");

        //  Handle denominations
        handleDenominations(total);

        // Thank You message
        System.out.println("=====================================");
        System.out.println("      THANK YOU FOR SHOPPING! 🛒");
        System.out.println("=====================================");
    }


    // Denomination method
    public void handleDenominations(double amount) {
        System.out.println("\nDenominations Breakdown for Rs. " + String.format("%.2f", amount) + ":");
        int[] notes = {1000, 500, 100, 50, 20, 10};
        double remaining = amount;

        for (int note : notes) {
            int count = (int) (remaining / note);
            if (count > 0) {
                System.out.println(count + " x Rs." + note + " notes");
                remaining = remaining % note;
            }
        }
        if (remaining > 0) {
            System.out.println("Remaining coins: Rs. " + String.format("%.2f", remaining));
        }
    }
}

