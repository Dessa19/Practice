import java.util.Scanner;

public class Getting_Vowels {
    public static void main(String[] args) {
// Print out Vowels using Scanner Class.
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
        System.out.print("total number of Vowels are " + vowel);
        System.out.println("\n");

        System.out.println("the number of Vowels from this sentence  are : " + getVowels(" my friend how are you"));
    }
    //Print out vowels using method
    public static int getVowels(String str){
        int vowels = 0;
        for ( int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels++;

            }
        }
        return vowels;
    }

}