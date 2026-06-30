import java.util.*;
public class Perferctsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sqr;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        sqr=(int)Math.sqrt(n);
        if(sqr*sqr==n)
            System.out.println(n+" is a perfect square.");
        else
            System.out.println(n+" is not a perfect square.");
        sc.close();
    }
}
