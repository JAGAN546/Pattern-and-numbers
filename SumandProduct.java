import java.util.*;
public class SumandProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,n1,s=0,p=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        System.out.println("The sum of digits of "+n1+" is: "+s);
        System.out.println("The product of digits of "+n1+" is: "+p);    
        sc.close();
    }
}
