import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(101);

        System.out.println("I'm thinking of a number between 1 and 100 (inclusive). Can you guess what it is?");
        System.out.print("Type a number: ");
        
        int guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of was: " + secretNumber);
        System.out.println("You were off by: " + Math.abs(secretNumber - guess));

    }
}
