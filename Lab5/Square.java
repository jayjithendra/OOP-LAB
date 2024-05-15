import java.util.Scanner;
class math
{
    float number;
    float s;
    float square(float n)
    {
        number=n;
        s=number*number;
        return s;
    }
}
class Ex
{
    public static void main(String args[])
    {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextFloat();
        math ob = new math();
        System.out.println(ob.square(n));
    }   
}
    