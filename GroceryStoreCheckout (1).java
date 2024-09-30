import java.util.Scanner;

/*
 * This is a program written by Amy Gomez
 * as a deliverable of Programming Assignment 1
 * for COP2210 - Fall 2024
 * Date: 09/10/2024
 */

public class GroceryStoreCheckout {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //enable scanner

        System.out.println("Welcome to the checkout system of Awesome Grocery Store!"); //saluting user
        System.out.print("Enter the weight of rice (in pounds): ");  //tell user to input weight

        double pounds =  keyboard.nextDouble(); //input by user, quantity of rice

        System.out.print("Enter the number of dozens of eggs: "); //instructions for user

        double dozens = keyboard.nextDouble(); //input by user, dozens of eggs

        System.out.print("Enter the number of loaves of French bread: ");

        double loaves = keyboard.nextDouble(); //user inputs loaves of bread

        /* calculate inputs with cost of each item */
        double riceCost = pounds * 1.25;
        double eggsCost = dozens * 14.75;
        double breadCost = loaves * 2.75;

        /* now, calculate total cost by adding tax and subtotal */
        double subtotal =  riceCost + eggsCost + breadCost;
        double tax = 6.75/100 * subtotal;
        double total = subtotal + tax;

        System.out.println("Here is your receipt: "); // provide user with accurate results
        System.out.println("**********************\nSubtotal: $ " + String.format("%.2f", subtotal));
        System.out.println("Tax: $ " + String.format("%.2f", tax));
        System.out.println("Total: $ "+ String.format("%.2f", total));

    }
}