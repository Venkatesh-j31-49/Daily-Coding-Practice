package hello.LCM_HCF;

import java.util.*;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        int min = (a < b) ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        int lcm = (a * b) / hcf;
        System.out.println("The Lcm and Hcf of two numbers is :" + lcm + " " + hcf);
    }

}
