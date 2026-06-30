import java.util.*;
public class Harshadnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s=0,d,n1;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        if(n1%s==0)
            System.out.println(n1+" is harshad number.");
        else
            System.out.println(n1+" is not harshad number.");
        sc.close();
    }
}
