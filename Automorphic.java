import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        long n,sq,d,c=0,n1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        n1=n;
        sq=n*n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        if(sq%(int)Math.pow(10,c)==n1)
            System.out.println(n1+" is automorphic number.");
        else
            System.out.println(n1+" is not automorphic number");
        sc.close();
    }
}
