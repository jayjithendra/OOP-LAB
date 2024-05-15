import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
        int x,y,z;
        char a;
        double w;
        byte p,q;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int,char and double:");
        x=sc.nextInt(); a=sc.next().charAt(0); w=sc.nextDouble();
        p=(byte) x;
        y=(int) a;
        q=(byte) w;
        z=(int) w;
        System.out.println("int to byte:"+p+"\nChar to int:"+y+"\nDouble to byte:"+q+"\nDouble to int:"+z);
    }
}