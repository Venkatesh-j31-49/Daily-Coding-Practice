package Patterns;

public class p4 {
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                c++;
                System.out.format("%02d ",c);
            }
            System.out.println();
        }
    }
    
}
