package hello.lcm;

import java.util.*;

public class lcm {
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
        /*
         * Lcm
         * int lcm=(a>b)?a:b;
         * while(true)
         * {
         * if(lcm%a==0 && lcm%b==0)
         * {
         * break;
         * }
         * lcm++
         * }
         */

        /*
         * method 2
         * while(a!=b)
         * {
         * if(a>b)
         * {
         * a=a-b;
         * }
         * else
         * {
         * b=b-a;
         * }
         * }
         * hcf =a;
         */

        int lcm = (a * b) / hcf;
        System.out.println("The Lcm and Hcf of two numbers is :" + lcm + " " + hcf);

    }

}
