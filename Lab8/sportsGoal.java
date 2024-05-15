interface sports{
    void getNumberOfGoals();
    void dispTeam();
}

class Hockey implements sports{
    int gt1;
    int gt2;
    Hockey(int gt1,int gt2){
        this.gt1=gt1;
        this.gt2=gt2;
    }
    public void getNumberOfGoals()
    {
        System.out.println("Team 1 goals:"+gt1);
        System.out.println("Team 2 goals:"+gt2);
    }
    public void dispTeam()
    {
        if(gt1>gt2)
        {
            System.out.println("Team 1 wins!!");
        }
        else if(gt1<gt2)
        {
            System.out.println("Team 2 wins!!");
        }
        else 
        {
            System.out.println("Its a draw!!!!");
        }
    }
}
class Football implements sports{
    int gt1;
    int gt2;
    Football(int gt1,int gt2){
        this.gt1=gt1;
        this.gt2=gt2;
    }
    public void getNumberOfGoals()
    {
        System.out.println("Team 1 goals:"+gt1);
        System.out.println("Team 2 goals:"+gt2);
    }
    public void dispTeam()
    {
        if(gt1>gt2)
        {
            System.out.println("Team 1 wins!!");
        }
        else if(gt1<gt2)
        {
            System.out.println("Team 2 wins!!");
        }
        else 
        {
            System.out.println("Its a draw!!!!");
        }
    }
}

class goals{
    public static void main(String args[])
    {
        Hockey Hmatch = new Hockey(5, 4);
        Football Fmatch = new Football(3, 0);
        System.out.println("Hockey match");
        Hmatch.getNumberOfGoals();
        Hmatch.dispTeam();
        System.out.println("Football match");
        Fmatch.getNumberOfGoals();
        Fmatch.dispTeam();

    }
}