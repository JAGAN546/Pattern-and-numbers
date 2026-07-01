import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        int n,n1,d,f,i,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            f=1;
            for(i=1;i<=d;i++)
                f=f*i;
            s=s+f;
            n=n/10;
        }
        if(n1==s)
            System.out.println(n1+" is strong number.");
        else
            System.out.println(n1+" is not strong number.");
        sc.close();
    }
}
