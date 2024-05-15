import java.util.Scanner;
class Table
{
    public static void main(String args[])
{
    int a,b,i,j,p;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers:");
    a=sc.nextInt();b=sc.nextInt();
    for(i=1;i<=a;i++)
    {
        for (j=1;j<=b;j++)
        {
            p=i*j;
            System.out.println(i+"*"+j+"="+p);
        }
    System.out.println("\n");
    }
}
}