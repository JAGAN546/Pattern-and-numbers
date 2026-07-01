import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,n1,n2,d,s=0,c=0;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        n1=n;
        n2=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        while(n1!=0)
        {
            d=n1%10;
            s=s+(int)Math.pow(d,c);
            n1=n1/10;
        }
        if(n2==s)
            System.out.println(n2+" is armstong number.");
        else
            System.out.println(n2+" is not armstong number.");
        sc.close();
    }
}