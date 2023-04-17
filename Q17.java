import java.util.Scanner;

public class Q17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :: ");
    int n = sc.nextInt();
    int factorial = 1;
    // for (int i = 1; i <= n; i++) {
    // factorial = factorial * i;
    // }
    // int i = 1;
    // while (i <= n)
    // {
    // factorial = factorial * i;
    // i++;
    //}
    int i = 1;
    do {
      factorial = factorial * i;
      i++;
    } while (i <= n);
    System.out.println("Factorial of the number " + n + " is " + factorial);
  }
}
