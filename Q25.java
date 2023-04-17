class Animal {

  private String name;

  void MakeSound() {
    System.out.println("Animal is making sound");
  }
}

class Dog extends Animal {

  void MakeSound() {
    super.MakeSound();
    System.out.println("Dog is making sound");
  }
}

class Cat extends Animal {

  void MakeSound() {
    System.out.println("Cat is making sound");
  }
}

public class Q25 {

  public static void main(String[] args) {
    // Animal a = new Dog();
    // a.MakeSound();
    // Animal b = new Cat();
    // b.MakeSound();
    // Animal c = new Animal();
    // c.MakeSound();
    Dog d = new Dog();
    d.MakeSound();
  }
}
