import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Perimeter of the circle: %.2f%n", perimeter);

        System.out.printf("Area of the circle: %.3f%n", area);

        scanner.close();
    }
}
