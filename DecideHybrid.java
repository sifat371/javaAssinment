import java.util.Scanner;

public class DecideHybrid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of car one: ");
        double carOneCost = in.nextDouble();
        System.out.println("Enter the price of car two: ");
        double carTwoCost = in.nextDouble();

        System.out.println ("What is the average mpg of car one? ");
        int carOneMpg = in.nextInt();

        System.out.println ("What is the avarage mpg of car two? ");
        int carTwoMpg = in.nextInt();

        System.out.println("Give amount of mile driven in this car: ");
        int milesDriven = in.nextInt();

        System.out.println("gas cost per gallon: ");
        double gasPrice = in.nextDouble();

        double gasCostCarOne = (milesDriven / carOneMpg) * gasPrice;
        double gasCostCarTwo = (milesDriven / carTwoMpg) * gasPrice;

        if (gasCostCarOne < gasCostCarTwo){
            System.out.println("Car one is suggested by me");
        }
        else {
            System.out.println("Car two is suggested by me");
        }

    }
}
