import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Resistance: ");
    double r = scan.nextDouble();

    scan.close();

    Thermistor thermistor = new Thermistor(r);
    System.out.printf("Liquid Temperature: %.2f", thermistor.getTemperature());
  }
}
