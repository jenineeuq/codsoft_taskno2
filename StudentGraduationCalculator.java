import java.util.Scanner;

public class StudentGraduationCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your class (9th, 10th, 11th, 12th): ");
        String className = scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your birth date (DD/MM/YYYY): ");
        String birthDate = scanner.nextLine();

        System.out.println("Enter your gender (Male, Female): ");
        String gender = scanner.nextLine();

        System.out.println("Enter your Maths mark: ");
        int mathsMark = scanner.nextInt();

        System.out.println("Enter your English mark: ");
        int englishMark = scanner.nextInt();

        System.out.println("Enter your Tamil mark: ");
        int tamilMark = scanner.nextInt();

        System.out.println("Enter your Science mark: ");
        int scienceMark = scanner.nextInt();

        System.out.println("Enter your Social mark: ");
        int socialMark = scanner.nextInt();

        scanner.close();

        int totalMarks = mathsMark + englishMark + tamilMark + scienceMark + socialMark;
        double avgPercentage = (totalMarks / 500.0) * 100;

        String grade = "A+";

        if (avgPercentage >= 91 && avgPercentage <= 100) {
            grade = "A+";
        } else if (avgPercentage >= 81 && avgPercentage <= 90) {
            grade = "A";
        } else if (avgPercentage >= 71 && avgPercentage <= 80) {
            grade = "B";
        } else if (avgPercentage >= 61 && avgPercentage <= 70) {
            grade = "C";
        } else if (avgPercentage >= 51 && avgPercentage <= 60) {
            grade = "D";
        } else if (avgPercentage >= 0 && avgPercentage <= 50) {
            grade = "E";
        }

        System.out.println("Student's Graduation Calculator");
        System.out.println("---------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
    }
}