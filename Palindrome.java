import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,n1,r=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(n1==r)
            System.out.println(n1+" is a palindrome number.");
        else
            System.out.println(n1+"is not a palindrome number.");
    }
}
