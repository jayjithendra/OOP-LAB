import java.util.Scanner;
class Box 
{
    float length;
    float bredth;
    float height;
    Box()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextFloat();
        System.out.println("Enter bredth:");
        bredth = sc.nextFloat();
        System.out.println("Enter height:");
        height = sc.nextFloat();
        System.out.println("Box created");
    }
    Box(float l, float b,  float h)
    {
        length = l;
        bredth = b;
        height = h;
        System.out.println("Box created");
    }

    float getVolume()
    {
        return length*bredth*height;
    }
}
class Item
{
    public static void main(String[] args) 
    {
        Box b = new Box();
        System.out.println("Volume of the box is: " + b.getVolume());
    }
}