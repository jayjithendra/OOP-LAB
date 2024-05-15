import java.util.Scanner;
class AgeException  extends Exception  
{  
    public AgeException (String str)  
    {  
        super(str);  
    }  
}  
public class CustomException {  
        static void validate (int age) throws AgeException{    
            if(age < 18){  
             throw new AgeException("Age is not valid to enter");    
         }  
            else {   
             System.out.println("Welcome");   
             }   
          }    
         public static void main(String args[])  
         {  
             try  
             {  
                 System.out.println("Enter Age:");
                 Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 validate(n);  
             }  
             catch (AgeException ex)  
             {    
                System.out.println("Exception occured: " + ex);
             }      
         }  
}
