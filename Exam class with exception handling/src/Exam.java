import java.util.Scanner;

class Exam {

    // Method to check number of subjects
    void check() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = scanner.nextInt();

        if (totalSubjects > 5) {
            throw new Exception("Error: Number of subjects cannot exceed 5. You entered: " + totalSubjects);
        } else {
            System.out.println("Valid number of subjects: " + totalSubjects);
        }
    }
    public static void main(String[] args) {
        Exam exam = new Exam();

        // First run: calling check() without try-catch
        System.out.println("--- First run without try-catch ---");
        try {
            exam.check();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Second run: calling check() with try-catch
        System.out.println("\n--- Second run with try-catch ---");
        try {
            exam.check();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}