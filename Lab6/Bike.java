class Bike{  
    void run(){System.out.println("running");}  
  }  
  class Splendar extends Bike{  
    void run(){System.out.println("running safely with 60km");}  
 
    public static void main(String args[]){  
      Bike b = new Splendar();//upcasting  
      b.run();  
    }  
  }  