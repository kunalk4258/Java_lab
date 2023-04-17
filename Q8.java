import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        System.out.print("Subject 1: ");
        double subject1 = sc.nextDouble();
        System.out.print("Subject 2: ");
        double subject2 = sc.nextDouble();
        System.out.print("Subject 3: ");
        double subject3 = sc.nextDouble();
        System.out.print("Subject 4: ");
        double subject4 = sc.nextDouble();
        System.out.print("Subject 5: ");
        double subject5 = sc.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
