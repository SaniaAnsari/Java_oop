package MoneyChanger;

public class Main {
        public static void main(String[] args) {
            //  Customer items and prices
            String[] items = {"Bread", "Milk", "Eggs", "Butter"};
            double[] prices = {120.0, 180.0, 240.0, 250.0};

            // Create objects
            Customer customer = new Customer(items, prices);
            Cashier cashier = new Cashier("Ali");

            //  Generate full bill with denominations
            cashier.generateBill(customer);
        }
    }


