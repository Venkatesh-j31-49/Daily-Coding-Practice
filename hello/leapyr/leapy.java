package hello.leapyr;
import java.util.Scanner;

public class leapy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {

            System.out.println(n + " is a Leap year");
        } else {
            System.out.println(n + " is Not a Leap year");
        }

    }
}