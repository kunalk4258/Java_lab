import java.util.Scanner;

public class Q18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array :: ");
    int n = sc.nextInt();
    System.out.println("Enter the elemets in the array :: ");
    int array[] = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    System.out.println("The elemtens in the array :: ");
    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
    }
    System.out.println("The elements of the array in reverse order :: ");
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }
}
