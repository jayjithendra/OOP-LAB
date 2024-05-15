import java.util.Scanner;
class largesmall
{
    public static void main(String args[])
    {
        int a,b,c,large,small;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        large=((a>b)?((a>c)?a:c):((b>c)?b:c));
        small=((a<b)?((a<c)?a:c):((b<c)?b:c));
        System.out.println("Largest="+large+"\nSmallest:"+small);
    }
}