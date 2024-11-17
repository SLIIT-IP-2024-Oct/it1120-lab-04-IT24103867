import java.util.Scanner;

public class IT24103867Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam and lab marks
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        // Validate exam marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input percentage taken from each component
        System.out.print("Enter percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Enter percentage for the lab submission: ");
        double labPercentage = scanner.nextDouble();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.println("\nThe final mark is: " + finalMark);

        scanner.close();
    }
}
