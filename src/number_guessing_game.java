import java.util.Scanner;
import java.util.Random;


public class number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("enter the lower limit of the number: ");
        int low = sc.nextInt();
        System.out.print("enter the upper limit of the number: ");
        int upper = sc.nextInt();
        int number = rand.nextInt(low,upper);
        System.out.print("enter your guess: ");
        int guess = sc.nextInt();
        int tries = 1;

        while(guess!=number){
            if(guess>number){
                System.out.println("guess lower");
            }
            else{
                System.out.println("guess upper");
            }
            tries++;
            System.out.print("enter your guess: ");
            guess = sc.nextInt();
        }
        System.out.println("found the number in "+tries+" tries");
    }
}
