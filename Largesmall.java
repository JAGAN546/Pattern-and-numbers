import java.util.*;
public class Largesmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,n1,min,max=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        n1=n;
        min=n1%10;
        while(n!=0)
        {
            d=n%10;
            if(min>d)
                min=d;
            if(max<d)
                max=d;
            n=n/10;
        }
        System.out.println("The maximun of digits in "+n1+" is: "+max);
        System.out.println("The minimum of digits of "+n1+" is: "+min);    
        sc.close();
    }
}
