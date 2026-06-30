import java.util.*;
public class Spy {
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
        if(s==p)
            System.out.println(n1+" is a spy number.");
        else
            System.out.println(n1+" is not a spy number.");    
        sc.close();
    }
}
