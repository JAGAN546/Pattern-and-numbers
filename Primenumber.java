import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>0)
            System.out.println(n+" is not a prime number.");
        else
            System.out.println(n+" is a prime number.");
        sc.close();
    }
}