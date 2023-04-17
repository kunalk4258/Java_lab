import java.util.Scanner;

public class Q19 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of both matrix :: ");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix1 = new int[n][m];
    System.out.println("Enter the elements in 1nd Matrix :: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }
    System.out.println("The 1st matrix :: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
    int[][] matrix2 = new int[n][m];
    System.out.println("Enter the elements in 2nd Matrix :: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix2[i][j] = sc.nextInt();
      }
    }
    System.out.println("The 2nd matrix :: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Adding both matrix :: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix1[i][j] += matrix2[i][j];
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
  }
}
