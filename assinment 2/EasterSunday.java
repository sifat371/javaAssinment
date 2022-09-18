import java.util.Scanner;

public class EasterSunday {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        int y = year.nextInt();
        int a = y % 19;
        int b = y/100 , c = y % 100;
        int d = b/4 , e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c/4, k = c % 4;
        int m =  (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n =  (h - m + r + 90) / 25;
        int p = ( h - m + r + n + 19) % 32;
//        System.out.println(p);
//        System.out.println(n);
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Therefor, in "+ y + ", Easter Sunday fell on "+ months[n-1]+" "+ p);

    }
}
