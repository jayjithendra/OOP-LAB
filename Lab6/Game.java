class Game
{
    void type()
    {
        System.out.println("indoor & outdoor games");
    }
}
class cricket extends Game
{
    void type()
    {
        System.out.println("cricket is an outdoor game");
    }
}
class chess extends Game
{
    void type()
    {
        System.out.println("chess is an indoor game");
    }
}
class exgame
{
    public static void main(String args[]){
    Game g=new Game();
    cricket cr=new cricket();
    chess ch=new chess();
    Game t;
    t=g;
    t.type();
    t=cr;
    t.type();
    t=ch;
    t.type();
    }
}