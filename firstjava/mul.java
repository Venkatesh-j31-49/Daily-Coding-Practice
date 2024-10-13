package firstjava;
import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
        for(int i=1;i<=10;i++)
        {
            res=n*i;
            System.out.println(n+" x "+i+" = "+res);

        }
    }
    
}
