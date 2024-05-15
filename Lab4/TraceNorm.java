import java.util.Scanner;
import java.lang.Math;
class tracenorm
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int i,j,trace=0,m,n;
        double norm,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows=columns");
        m=sc.nextInt();
        n=m;
        System.out.println("Enter values:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            trace=trace+a[i][i];
        }
        norm=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum=Math.pow(a[i][j],2);
                norm += Math.sqrt(sum);
            }
        }
        System.out.println("The trace="+trace+" the norm="+norm);
    }
}