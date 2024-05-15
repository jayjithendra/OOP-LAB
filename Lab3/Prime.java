import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int m,n,flag,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n value:");
        m=sc.nextInt();n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            flag=1;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.println(i);
        }
    }
}