package Logic_B.NumberTheory;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=(a>b)?a:b;
        while (true) {
            if(lcm%a==0 && lcm%b==0)
            {
                break;
            } 
            lcm++;
            
        }
        System.out.println(lcm);
    }
    
}
