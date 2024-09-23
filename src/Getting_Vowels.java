import java.util.Scanner;

public class Getting_Vowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String  string = scanner.nextLine();

        int i;
        char ch;
        int vowel = 0;

        for (i = 0;i < string.length();i++){
            ch = string.toLowerCase().charAt(i);
           if (ch =='a' || ch == 'e' ||ch == 'i'|| ch == 'o' || ch == 'u')
               vowel++;
        }
        System.out.println("total number of Vowels are " + vowel);
    }
}