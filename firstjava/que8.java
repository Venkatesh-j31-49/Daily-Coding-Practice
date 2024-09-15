package firstjava;
import java.util.Scanner;
public class que8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        if(rev.equals(str))
        {
            System.out.println(str+" : is a Palindrome");
        }
        else
        {
            System.out.println(str+"is not a palindrome");
        }
    }
    
}
