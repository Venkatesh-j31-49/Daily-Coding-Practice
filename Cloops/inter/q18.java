package Cloops.inter;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = "";
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            S = S + r;
        }
        System.out.println(S);
        char c;
        for (int i = S.length() - 1; i >= 0; i--) {
            c = S.charAt(i);
            switch (c) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("Nine");
                    break;

            }
        }

    }

}
