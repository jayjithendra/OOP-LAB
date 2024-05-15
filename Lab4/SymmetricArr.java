import java.util.Scanner;
class symmarr
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
        int flag=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("symmetric");
        }
        else
        {
            System.out.println("Not symmetric");
        }
    }
}