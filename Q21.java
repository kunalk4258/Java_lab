public class Q21 {

  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 7;
    int num3 = 9;
    int sum = addNumbers(num1, num2);
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    int sum2 = addNumbers(num1, num2, num3);
    System.out.println(
      "The sum of " + num1 + " " + num2 + " and " + num3 + " is " + sum2
    );
  }

  public static int addNumbers(int x, int y) {
    int result = x + y;
    return result;
  }

  public static int addNumbers(int a, int b, int c) {
    int result = a + b + c;
    return result;
  }
}
