import java.util.*;

public class lv1task4 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");
        scanner.close();

        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder charPool = new StringBuilder();

        if (includeLowercase) {
            charPool.append(lowercaseChars);
        }
        if (includeUppercase) {
            charPool.append(uppercaseChars);
        }
        if (includeNumbers) {
            charPool.append(numberChars);
        }
        if (includeSpecialChars) {
            charPool.append(specialChars);
        }

        if (charPool.length() == 0) {
            System.out.println("You must include at least one character type.");
            return;
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charPool.length());
            char randomChar = charPool.charAt(randomIndex);
            password.append(randomChar);
        }

        System.out.println("Your generated password is: " + password.toString());

    }
}
