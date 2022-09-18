import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Temperature(C): ");
    double temp = scan.nextDouble();

    System.out.print("Enter Relative Humidity(between 0 and 1): ");
    double rH = scan.nextDouble();

    scan.close();

    Humidity humidity = new Humidity(temp, rH);
    System.out.printf("Humidity: %.3f", humidity.getHumidity());
  }
}
