
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cgpa of 3 subjects");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        double cgpa;
        cgpa = (s1 + s2 + s3) / 3;
        System.out.println("cgpa = " + cgpa);
    }
}
