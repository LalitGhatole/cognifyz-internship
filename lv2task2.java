// password strength checker
import java.util.*;
public class lv2task2 {
    public static void main(String args[]) {
        System.out.println("\nwelcome to password strength checker!");
        System.out.println("please enter the passoword to check its strength: ");
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        sc.close();

        int length = pass.length();
        int strength=0;

        boolean uppercase=false;
        boolean lowercase=false;
        boolean num=false;
        boolean specialchar=false;

        

        for(char ch: pass.toCharArray()){
            if(Character.isUpperCase(ch)){
                uppercase=true;
            }
            else if(Character.isLowerCase(ch)){
                lowercase=true;
            }
            else if(Character.isDigit(ch)){
                num= true;
            }
            else if(specialCharacter(ch)){
                specialchar=true;
            }
        }

        if(length>8){
            strength++;
        }
        if(uppercase){
            strength++;
        }
        if(lowercase){
            strength++;
        }
        if(num){
            strength++;
        }
        if(specialchar){
            strength++;
        }

        if(strength>=4){
            System.out.println("the abover password is Strong");
        }
        else if(strength>=2){
            System.out.println("the abover password is Moderately strong");
        }
        else{
            System.out.println("the abover password is weak");
        }

    }
    public static boolean specialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()_+{}[]:;<>,.?/~";
        return specialCharacters.contains(String.valueOf(ch));
    }
}
