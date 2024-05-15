import java.util.Scanner;
class pd
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int m,i,j,n,sum=0;
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
        System.out.println("The principle diagonal elements are:");
        for(i=0;i<m;i++)
        {
            System.out.println(+a[i][i]);
            sum=sum+a[i][i];
        }
        System.out.println("The sum of principle diagonal elements:"+sum);
    }
}