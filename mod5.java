import java.util.*;
public class mod5 {
    public static void main(String[] args) {
        boolean sentinel = true;
        Scanner scan = new Scanner(System.in);
        int randomnum = 0, guess = 0;
        do {
            randomnum = (int)(Math.random()* 9) + 1;
            System.out.println("Guess a random number 1-10: ");
            if(scan.hasNextInt()){
                guess = scan.nextInt();
                if( 10 > guess && guess >= 1){
                    if(guess == randomnum){
                        System.out.println("My number was " + randomnum);
                        System.out.println("You guessed correctly!");
                        sentinel = false;
                    }else if(guess > randomnum){
                        System.out.println("My number was " + randomnum);
                        System.out.println("Too high.");
                    }else if(randomnum > guess){
                        System.out.println("My number was " + randomnum);
                        System.out.println("Too Low.");
                    }
                }
            }

        } while (sentinel == true);
        scan.close();
    }
}
