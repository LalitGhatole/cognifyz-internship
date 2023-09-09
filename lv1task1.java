// Task: Temperature Converter

import java.util.*;

public class lv1task1 {
    public static void main(String args[]) {
        System.out.println("please select the temperature measure to convert:");
        System.out.println("1: celsius\n2: fahrenheit\n3: kelvin");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your choice:");
        int choice = sc.nextInt();
        if (choice > 3) {
            System.out.println("wrong input: please enter valid choice");
            System.exit(1);
        }
        System.out.println("enter the temperature:");
        float num = sc.nextFloat();
        System.out.println("enter where to convert:");
        int output = sc.nextInt();
        if (output > 3) {
            System.out.println("wrong input: please enter valid choice");
            System.exit(1);
        }
        sc.close();

        float result = 0.0f;
        if (choice == 1) {
            if (output == 1) {
                System.out.println("please select the different measure");
            } else if (output == 2) {
                result = ((num * 9) / 5) + 32;
            } else if (output == 3) {
                result = num + 273.15f;
            } else {
                System.out.println("please enter valid choice");
            }
        } else if (choice == 2) {
            if (output == 1) {
                result = (num - 32) * 5 / 9;
            } else if (output == 2) {
                System.out.println("please select the different measure");

            } else if (output == 3) {
                result = (num - 32) * 5 / 9 + 273.15f;
            } else {
                System.out.println("please enter valid choice");
            }
        } else if (choice == 3) {
            if (output == 1) {
                result = num - 273.15f;
            } else if (output == 2) {
                result = (num - 273.15f) * 9 / 5 + 32;
            } else if (output == 3) {
                System.out.println("please select the different measure");

            } else {
                System.out.println("please enter valid choice");
            }
        }

        System.out.println("the converted temperature is: " + result);

    }
}