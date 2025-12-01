package MoneyChanger;

class Customer extends Person {
        private String[] items;
        private double[] prices;

        public Customer(String[] items, double[] prices) {
            super(); // Anonymous customer
            this.items = items;
            this.prices = prices;
        }

        public void showItems() {
            System.out.println("Items Purchased:");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-15s Rs. %.2f\n", items[i], prices[i]);
            }
        }
    public double calculateTotal() {
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        return total;
    }


    }

