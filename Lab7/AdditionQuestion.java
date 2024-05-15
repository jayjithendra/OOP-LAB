class Example1{
    static class X{
        static String str="Inside Class X";
    }
    public static void
    main(String args[])
    {
        X.str="Inside Class Example1";
        System.out.println("String stored in str is-"+ X.str);
    }
}

class Example2{
    int num;//Must be static to work
    static class X{
        static String str="Inside Class X";
        num=99;
    }
    public static void
        main(String args[])
        {
            Example2.X obj = new Example2.X();
            System.out.println("Value of num="+obj.str);
        }
}
class Example3{
    static int num;
    static String mystr;
    static{
    num = 97;
    mystr = "Static keyword in Java";
    }
    public static void
    main(String args[])
    {
    System.out.println("Value of num="+num);
    System.out.println("Value of mystr="+mystr);
    }
}

class Example4{
    static int num;
    static String mystr;
    //First Static block
    static{
    System.out.println("Static Block 1");
    num = 68;
    mystr = "Block1";
    }
    //Second static block
    static{
    System.out.println("Static Block 2");
    num = 98;
    mystr = "Block2";
    }
    public static void main(String args[])
    {
        System.out.println("Value of num="+num);
        System.out.println("Value of mystr="+mystr);
    }
}

class Example5{
    static int i;
    static String s;
    public static void main(String args[]) //Its aStatic Method
    {
        Example5 obj=new
        Example5();
        //Non Static variables accessed using object obj
        System.out.println("i:"+obj.i);
        System.out.println("s:"+obj.s);
    }
}

class Example6{
    static int i;
    static String s;
    //Static method
    static void display()
    {
    //Its a Static method
    Example6 obj1=new
    Example6();
    System.out.println("i:"+obj1.i);
    System.out.println("i:"+obj1.i);
    }
    void funcn()
    {//Static method calledin non-static method
        display();
    }
    public static void main(String args[]) //Its aStatic Method
    {
        //Static method called in another static method
        display();
    }
}