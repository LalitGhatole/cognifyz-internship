// file encryption
import java.io.*;
import java.util.*;

public class lv2task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFile Encryption/Decryption Program");
        System.out.print("Enter 'E' for encryption or 'D' for decryption: ");
        char operation = scanner.next().charAt(0);

        if (operation == 'E' || operation == 'D') {
            System.out.print("Enter the file name or path: ");
            scanner.nextLine();
            String fileName = scanner.nextLine();

            String outputFileName;
            if (operation == 'E') {
                outputFileName = "encrypted_" + fileName;
            } else {
                outputFileName = "decrypted_" + fileName;
            }

            try {
                File inputFile = new File(fileName);
                File outputFile = new File(outputFileName);

                FileReader fileReader = new FileReader(inputFile);
                FileWriter fileWriter = new FileWriter(outputFile);

                int ch;
                while ((ch = fileReader.read()) != -1) {
                    char encryptedChar;
                    if (operation == 'E') {
                        encryptedChar = (char) (ch + 1);
                    } else {
                        encryptedChar = (char) (ch - 1); 
                    }
                    fileWriter.write(encryptedChar);
                }

                fileReader.close();
                fileWriter.close();

                System.out.println(operation == 'E' ? "Encryption" : "Decryption" + " complete. Output file: " + outputFileName);
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        } else {
            System.err.println("Invalid operation. Please enter 'E' for encryption or 'D' for decryption.");
        }

        scanner.close();
    }
}
