package Dice_Roller;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dice dice = new dice();

        System.out.println("Welcome to dice roller!");
        String choice;
        do {
            int number = dice.Roll();//method call
            System.out.println("You rolled:" + number);

            System.out.println("Do you want to roll again?(Yes/No)");
            choice = input.next().toLowerCase();
        }
            while (choice.equalsIgnoreCase("Yes"));
                System.out.println("Thanks for playing");
    }
}
