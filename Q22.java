import java.util.Scanner;

class Employee {

  Scanner sc = new Scanner(System.in);
  String name;
  int salary;

  String GetName() {
    name = sc.nextLine();
    return name;
  }

  int GetSalary() {
    salary = sc.nextInt();
    return salary;
  }

  void display() {
    System.out.println("Name : " + name);
    System.out.println("Salary : " + salary);
  }
}

public class Q22 {

  public static void main(String[] args) {
    Employee obj = new Employee();
    obj.GetName();
    obj.GetSalary();
    obj.display();
  }
}
