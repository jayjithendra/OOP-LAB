interface Shape{
    double calcArea();
}

class squArea implements Shape
{
    double a;
    squArea(double a){
        this.a=a;
    }
    public double calcArea(){
        return Math.pow(a,2);
    }
}

class triArea implements Shape{
    double b;
    double h;
    triArea(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    public double calcArea()
    {
        return 0.5*b*h;
    }
}
class areaTest4
{
    public static void main(String args[]) 
    {
        squArea s1 = new squArea(4);
        triArea t1 = new triArea(12,4);
        System.out.println("Area of square:"+s1.calcArea());
        System.out.println("Area of triangle:"+t1.calcArea());    
    }
}