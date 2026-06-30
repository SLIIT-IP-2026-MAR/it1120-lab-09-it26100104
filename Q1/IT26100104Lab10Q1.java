import java.util.Scanner;

public class IT26100104Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1, x2, discriminant;

        // Input values
        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        // Calculate discriminant
        discriminant = Math.pow(b, 2) - (4 * a * c);

        // Check the nature of roots
        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        } 
        else if (discriminant == 0) {
            x1 = -b / (2 * a);

            System.out.println("Both roots are equal.");
            System.out.println("Root = " + x1);
        } 
        else {
            System.out.println("The equation has no real roots.");
        }

        input.close();
    }
}