import java.util.Scanner;

public class Q15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the units consumed :: ");
    int unit = sc.nextInt();
    double bill = 0.0;
    if (unit <= 100) {
      bill = unit * 1.50;
    } else if (unit > 100 && unit <= 300) {
      bill = 150 + (unit - 100) * 2.75;
    } else if (unit > 300 && unit <= 500) {
      bill = 425 + (unit - 300) * 4.5;
    } else {
      bill = 1325 + (unit - 500) * 7;
    }
    System.out.println("Bill = " + bill);
  }
}
