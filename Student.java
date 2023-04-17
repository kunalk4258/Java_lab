package BTech;

public class Student {

  private String name;
  private int rollNo;
  private int marks1;
  private int marks2;
  private int marks3;
  private int marks4;

  public Student(
    String name,
    int rollNo,
    int marks1,
    int marks2,
    int marks3,
    int marks4
  ) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
    this.marks4 = marks4;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("Marks 1: " + marks1);
    System.out.println("Marks 2: " + marks2);
    System.out.println("Marks 3: " + marks3);
    System.out.println("Marks 4: " + marks4);
  }

  public int calculateTotalMarks() {
    return marks1 + marks2 + marks3 + marks4;
  }

  public double calculatePercentage() {
    int totalMarks = calculateTotalMarks();
    return (double) totalMarks / 4;
  }
}
