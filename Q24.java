import java.util.Scanner;

class Person {

  Scanner sc = new Scanner(System.in);
  private String name;
  int age;
  char gender;

  void SetName() {
    System.out.print("Enter your name: ");
    name = sc.nextLine();
  }

  void SetAge() {
    System.out.print("Enter your age: ");
    age = sc.nextInt();
  }

  void SetGender() {
    System.out.print("Enter your gender: ");
    gender = sc.next().charAt(0);
  }

  void GetName() {
    System.out.println(name);
  }

  void GetAge() {
    System.out.println(age);
  }

  void GetGender() {
    System.out.println(gender);
  }
}

public class Q24 {

  public static void main(String[] args) {
    Person p = new Person();
    p.SetName();
    p.SetAge();
    p.SetGender();
    p.GetName();
    p.GetAge();
    p.GetGender();
  }
}
