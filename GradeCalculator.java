import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validation: marks should be within 0–100
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // repeat this subject input
                continue;
            }
            total += marks[i];
        }

        // Calculate average percentage
        double average = (double) total / n;

        // Grade calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n--- Result --- ");
        System.out.println("Total Marks: " + total + " / " + (n * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
