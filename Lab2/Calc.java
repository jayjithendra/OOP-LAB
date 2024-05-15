import java.util.Scanner;
class calc
{
    public static void main(String args[])
    {
        float x,y,add,sub,div,prod;
        char op,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter number,operator,number:");
            x=sc.nextFloat();op=sc.next().charAt(0);y=sc.nextFloat();
            switch(op)
            {
                case ('+'):
                add=x+y;
                System.out.println("Answer:"+add);
                break;
                case('-'):
                sub=x-y;
                System.out.println("Answer:"+sub);
                break;
                case('*'):
                prod=x*y;
                System.out.println("Answer:"+prod);
                break;
                case('/'):
                div=x/y;
                System.out.println("Answer:"+div);
                break;
                default:
                System.out.println("invalid");
            }
            System.out.println("Do you want to continue(y/n):");
            n=sc.next().charAt(0);
        }
        while(n!='n');

    }
}