import java.util.Scanner;

public class Additional4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a telephone number (in the form (555) 555-5555): ");
        String phoneNumber = scanner.nextLine();

        // Remove non-numeric characters
        String numericPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        if (numericPhoneNumber.length() != 10) {
            System.out.println("Error: Please enter a valid 10-digit phone number.");
            return;
        }

        String areaCode = numericPhoneNumber.substring(0, 3);
        String firstThreeDigits = numericPhoneNumber.substring(3, 6);
        String lastFourDigits = numericPhoneNumber.substring(6);

        System.out.println("Area Code: " + areaCode);
        System.out.println("Seven Digit Phone Number: " + firstThreeDigits + "-" + lastFourDigits);
    }
}
