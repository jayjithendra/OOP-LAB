interface Shape{
    double calculate_area();
}
class RecArea implements Shape{
    double length;
    double width;
    public RecArea(double len, double wid){
        this.length = len;
        this.width = wid;
    }
    public double calculate_area(){
        return length*width;
    }
}
class CircArea implements Shape{
    private double radius;
    public CircArea(double rad){
        this.radius = rad;
    }
    public double calculate_area(){
        return Math.PI*Math.pow(radius, 2);
    }
}
class areaTest2 {
    public static void main(String[] args){
        RecArea rect = new RecArea(20, 30);
        CircArea circle = new CircArea(20);
        System.out.println("Area of Rectangle: "+rect.calculate_area());
        System.out.println("Area of Circle: "+circle.calculate_area());
    }
}