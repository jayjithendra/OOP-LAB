class trial2
{
    public static void main(String args[])
    {
        boolean x=true;
        int y=x;
        int z=(int)x;
        System.out.println("Output:"+y+"\n"+z);//Error boolean cannot be converted to int//
    }
}