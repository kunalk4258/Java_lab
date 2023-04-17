// Interface
interface Motor {
  int capacity = 10; // capacity in liters

  void run(); // method to start the motor
  void consume(int amount); // method to consume fuel
}

class WashingMachine implements Motor {

  int fuelLevel;

  public void run() {
    System.out.println("Washing machine is running.");
  }

  public void consume(int amount) {
    fuelLevel -= amount;
    System.out.println("Fuel level: " + fuelLevel);
  }
}

public class Q29 {

  public static void main(String[] args) {
    WashingMachine wm = new WashingMachine();
    System.out.println("Capacity of motor: " + Motor.capacity);
  }
}
