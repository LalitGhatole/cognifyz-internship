// student grade calculator

import java.util.*;

public class lv1task3 {
    public static void main(String args[]) {
        System.out.println("\nplease enter the marks for each subject out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("English: ");
        int eng = sc.nextInt();
        System.out.println("Maths: ");
        int maths = sc.nextInt();
        System.out.println("Science: ");
        int sci = sc.nextInt();
        System.out.println("History: ");
        int his = sc.nextInt();
        System.out.println("Drawing: ");    
        int draw = sc.nextInt();
        sc.close();

        int total = eng + maths + sci + his + draw;
        float score = ((float) total / 500) * 100;

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("\n\nTotal marks obtained : " + total + "/500");
        System.out.println("Percentage obtained: " + score);
        System.out.println("Grade obtained: " + grade);

    }

}
