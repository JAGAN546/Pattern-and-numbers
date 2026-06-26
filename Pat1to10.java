public class Pat1to10 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                for(int k=i;k<=10;k++)
                {
                    System.out.print(k);
                }
                System.out.println("");
            }
        }
    }
}
