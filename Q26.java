import java.util.Scanner;

class Rectangle {

  Scanner sc = new Scanner(System.in);
  public double length, width;

  void Get() {
    System.out.println("Enter the length :: ");
    length = sc.nextDouble();
    System.out.println("Enter the width :: ");
    width = sc.nextDouble();
  }

  void Area() {
    System.out.println("Area of the rectangle :: ");
    System.out.println(length * width);
  }

  void Perimeter() {
    System.out.println("Perimeter of the rectangle :: ");
    System.out.println(2 * (length + width));
  }
}

class Square extends Rectangle {

  private double sidelength;

  void Get() {
    super.Get();
    System.out.println("Enter the sidelength :: ");
    sidelength = sc.nextDouble();
  }

  void Area() {
    super.Area();
    System.out.println("Area of the square :: ");
    System.out.println(sidelength * sidelength);
  }

  void Perimeter() {
    super.Perimeter();
    System.out.println("Perimeter of the square :: ");
    System.out.println(sidelength * 4);
  }
}

public class Q26 {

  public static void main(String[] args) {
    Square obj = new Square();
    obj.Get();
    obj.Area();
    obj.Perimeter();
    System.out.println();
    // Rectangle obj1 = new Rectangle();
    // obj1.Get();
    // obj1.Area();
    // obj1.Perimeter();
    // System.out.println();
    Rectangle obj2 = new Square();
    obj2.Get();
    obj2.Area();
    obj2.Perimeter();
    System.out.println();
  }
}
