import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int secret = random.nextInt(100);
        int tries = 0;
        int guess = -1;
        
        while (guess != secret) {
            System.out.print("Guess a number between 0 and 99: ");
            guess = scanner.nextInt();
            tries = tries + 1;
            
            if (guess < secret) System.out.println("Too low");
            else if (guess > secret) System.out.println("Too high");
        }
        System.out.println("YOU WIN!");
        if (guess == 1) {
            System.out.println("You used 1 guess.");
        } else {
            System.out.println("You used " + tries + " guesses.");
        }
    }
}