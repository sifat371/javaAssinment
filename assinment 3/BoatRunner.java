import java.util.Scanner;

public class BoatRunner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter position x: ");
    double x = scan.nextDouble();

    System.out.print("Enter position y: ");
    double y = scan.nextDouble();

    System.out.print("Enter direction: ");
    double direction = scan.nextDouble();

    scan.close();

    Boat boat = new Boat(x, y, direction);
    boat.move(10);
    boat.turn(Math.PI / 2);
    boat.move(10);
    System.out.println(boat.getX());
    System.out.println(boat.getY());
    System.out.println(boat.getDirection());
  }
}
