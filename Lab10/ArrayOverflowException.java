import java.util.Scanner;
class AOE{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements:");
        int n = sc.nextInt();
        int arr[] = new int[5];
        System.out.println("Enter elements:");
        try{
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        }catch(Exception e){
            System.out.println("Invlaid too many elements");
        }
    }
}