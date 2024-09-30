import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            System.out.println("How many pennies do you have? ");
            int penny = keyboard.nextInt();

            System.out.println("With " + penny + " pennies, you can receive:");
        int dollars = penny/ 100;
        penny %= 100;
        int quarters = penny / 25;
        penny %= 25;
        int dimes = penny / 10;
        penny %= 10;
        int nickels = penny / 5;
        penny %= 5;
        int pennies = penny;

        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + pennies);
    }
}