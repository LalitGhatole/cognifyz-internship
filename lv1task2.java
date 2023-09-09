// Task: Palindrome Checker
import java.util.*;

public class lv1task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        sc.close();

        int left = 0;
        int right = input.length()-1;

        while(left<right){
            if (input.charAt(left)!=input.charAt(right)) {
                System.out.println("this is not a palindrome!");
                System.exit(1);
            }
            left++;
            right--;
        }
        System.out.println("this is a palindrome!");
    }
}
