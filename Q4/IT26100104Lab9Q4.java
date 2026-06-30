import java.util.Scanner;

public class IT26100104Lab9Q4 {

    // Method to calculate final mark
    public static double calculateFinalMark(double assignment, double midExam, double finalExam) {
        return (assignment * 0.20) + (midExam * 0.30) + (finalExam * 0.50);
    }

    // Method to calculate grade
    public static String calculateGrade(double finalMark) {
        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 65)
            return "B";
        else if (finalMark >= 55)
            return "C";
        else if (finalMark >= 45)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Mid Exam Mark: ");
            double midExam = input.nextDouble();

            System.out.print("Enter Final Exam Mark: ");
            double finalExam = input.nextDouble();

            double finalMark = calculateFinalMark(assignment, midExam, finalExam);
            String grade = calculateGrade(finalMark);

            System.out.printf("Final Mark = %.2f\n", finalMark);
            System.out.println("Grade = " + grade);
        }

        input.close();
    }
}