import java.util.*;

public class Additional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String[] str = s.split(" ");

        Arrays.sort(str);

        System.out.println("Sorted string is:");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

}