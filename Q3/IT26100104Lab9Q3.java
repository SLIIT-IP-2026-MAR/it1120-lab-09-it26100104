public class IT26100104Lab9Q3{

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to calculate the square of an integer
    public static int square(int num) {
        return multiply(num, num);
    }

    public static void main(String[] args) {

        // Expression (i): (3 × 4 + 5 × 7)²
        int expression1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression (ii): (4 + 7)² + (8 + 3)²
        int expression2 = square(add(4, 7)) + square(add(8, 3));

        // Display results
        System.out.println("Result of Expression (i) = " + expression1);
        System.out.println("Result of Expression (ii) = " + expression2);
    }
}