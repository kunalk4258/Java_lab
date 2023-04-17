import java.util.*;

class Area {

  Scanner sc = new Scanner(System.in);
  private int length, width, height;

  Area() {
    System.out.println("Enter the length width and height :: ");
    length = sc.nextInt();
    width = sc.nextInt();
    height = sc.nextInt();
  }

  int Area1() {
    System.out.println("Area of cube = "); //+ (length * length));
    return (this.length * this.length);
  }

  int Area2() {
    System.out.println("Area of rectangle = "); //+ (length * width));
    return (this.length * this.width);
  }

  int Area3() {
    System.out.println("Area of triangle = "); //+ (length * height));
    return (this.length * this.height);
  }
}

public class Q23 {

  public static void main(String[] args) {
    Area obj = new Area();
    obj.Area1();
    obj.Area2();
    obj.Area3();
  }
}
