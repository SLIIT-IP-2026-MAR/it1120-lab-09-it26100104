import java.util.Scanner;

public class IT26100104Lab9Q2 {

    // Method to calculate and return the area of a circle
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the method and display the result
        double area = circleArea(radius);

        System.out.println("Area of the circle = " + area);

        input.close();
    }
}