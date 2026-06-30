public class Pyramid {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                for(k=5-i;k>=1;k--)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
