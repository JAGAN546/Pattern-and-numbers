
import java.util.*;
public class Neon {
    public static void main(String[] args) {
        int n,sq,s=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0)
        {
            d=sq%10;
            s=s+d;
            sq=sq/10;
        }
        if(n==s)
            System.out.println(n+" is neon number.");
        else
            System.out.println(n+" is not neon number.");
        sc.close();
    }
}
