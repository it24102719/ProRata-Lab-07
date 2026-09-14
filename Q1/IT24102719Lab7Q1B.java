import java.util.Scanner;

public class IT24102719Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects for Student " + student + " (separated by space): ");

            double sub1 = sc.nextDouble();
            double sub2 = sc.nextDouble();
            double sub3 = sc.nextDouble();
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

            System.out.println("Student " + student + " - Average: " + average + ", Grade: " + grade);
            System.out.println();
        }

        sc.close();
    }
}