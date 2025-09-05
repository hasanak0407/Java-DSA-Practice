package Day1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 80;
        while (true) {
        System.out.println("Guess a Number");
        int guess = sc.nextInt();

            if (guess == key) {
                System.out.println("Hooray You have guessed the word\n");
                break;
            }
            else if(guess>key){
                System.out.println("It is greater\nTry Smaller2");

            }
            else if(guess<key){
                System.out.println("It is smaller\nTry Larger");
            }
        }
    }
}

