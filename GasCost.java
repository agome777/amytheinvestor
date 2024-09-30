import java.util.Scanner;

public class GasCost {
    public GasCost() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the gas price (cents per gallon): ");
        int pricePerGallon = scanner.nextInt();
        System.out.print("Enter the amount of gas needed (in gallons): ");
        double gallons = scanner.nextDouble();
        double totalCostCents = (double)pricePerGallon * gallons;
        double totalCostDollars = totalCostCents / 100.0;
        System.out.println("Total cost of gas: $" + totalCostDollars);
        scanner.close();
    }
}