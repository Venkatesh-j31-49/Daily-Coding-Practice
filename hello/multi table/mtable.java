package hello.mtable;

/**
 * mtable
 */
import java.util.*;

public class mtable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int m = i * n;
            System.out.println(n + "x" + i + "=" + m);
        }

    }
}