// Compare
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string to compare: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string to compare: ");
        String str2 = scanner.nextLine();
        int cmp = str1.compareTo(str2);
        if (cmp == 0) {
            System.out.println("Strings are equal");
        }
     else   
        {
            System.out.println("Strings are not equal");
        }
    }
}
