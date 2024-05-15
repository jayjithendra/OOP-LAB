import java.util.Scanner;
class MatrixException  extends Exception  
{  
    public MatrixException (String str)  
    {  
        super(str);  
    }  
}  
public class ValidateMatrix {
        static void validate (int m,int n) throws MatrixException{    
            if(m!=n){  
       
             // throw an object of user defined exception  
             throw new MatrixException("Matrix is not a square matrix");    
         }  
            else {   
             System.out.println("Square Matrix:Enter values");   
             }   
          }    
         public static void main(String args[])  
         {  
            System.out.println("Enter number of rows and columns:");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
             try  
             {  
                 validate(m,n);  
             }  
             catch (MatrixException ex)  
             {    
                System.out.println("Exception occured: " + ex);
                return;
             }
             for(int i = 0 ; i<m;i++){
                 for(int j = 0;j < n ;j++){
                     arr[i][j]=sc.nextInt();
                 }
             }      
         }  
}
