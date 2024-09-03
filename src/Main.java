import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
         String userName = scanner.next();
        System.out.println("your name is: " + userName);
        System.out.println("Enter your age:");
        int Age = scanner.nextInt();
        System.out.println("your are " + Age + " years old");
    }
}