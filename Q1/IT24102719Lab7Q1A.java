import java.util.Scanner;

public class IT24102719Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        double sub1 = sc.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double sub2 = sc.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double sub3 = sc.nextDouble();
        System.out.print("Enter marks for subject 4: ");
        double sub4 = sc.nextDouble();

        double average = (sub1 + sub2 + sub3 + sub4) / 4;

        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}