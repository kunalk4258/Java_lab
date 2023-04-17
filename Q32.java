// Insert
import java.util.Scanner;

public class Q32 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the main string: ");
    String mainStr = scanner.nextLine();
    System.out.print("Enter the string to insert: ");
    String insertStr = scanner.nextLine();
    System.out.print("Enter the index to insert at: ");
    int index = scanner.nextInt();
    String newStr =
      mainStr.substring(0, index) + insertStr + mainStr.substring(index);
    System.out.println("New string: " + newStr);
  }
}
