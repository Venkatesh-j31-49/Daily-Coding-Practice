package Cloops.inter;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char A=sc.next().charAt(0);
        if(A=='a'||A== 'e'||A== 'o'||A== 'i'||A== 'u' )
        {
System.out.println(A+": is vowel");
        }
        else
        {
            System.out.println(A+" : is consonant");
        }


    }
    
}
