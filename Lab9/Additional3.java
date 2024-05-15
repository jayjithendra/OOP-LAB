import java.util.*;

public class Additional3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = "";

        System.out.println("Enter 5 Strings:");
        for (int i = 0; i < 5; i++) {

            ans = ans.concat(sc.nextLine());
        }
        System.out.println("String:" + ans);

    }
}