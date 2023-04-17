import java.util.Scanner;

public class Q13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :: ");
    int n = sc.nextInt();
    if (n > 15) {
      System.out.println("The number is greater!");
    } else {
      System.out.println("The number is less!");
    }
  }
}
