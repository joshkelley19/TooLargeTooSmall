package TooLargeTooSmall;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class TooLargeTooSmall {

    static int tries = 1;
    private int player1Number,enteredNumber, lastNumber;


    public TooLargeTooSmall(int player1Number){
        this.player1Number=player1Number;
    }
    public static int getANumber(){
        Scanner scanner = new Scanner(System.in);
        int ans;
        try {
            return scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.print("That wasn't a number. Don't be a dickhead. Try Again: ");
            ans = getANumber();
        }
        return ans;
    }
    public boolean guessTheNumber(int guess){
            enteredNumber = guess;

            if(enteredNumber>player1Number){
                System.out.println("Too Large");
                if(lastNumber!=enteredNumber)tries++;
            }else if (enteredNumber<player1Number){
                System.out.println("Too Small");
                if(lastNumber!=enteredNumber)tries++;
            }else {
                System.out.println("You tried " + tries + " times!");
                return true;
            }

            this.lastNumber=this.enteredNumber;
            return false;
    }

    public static void main(String[] args) {
        System.out.print("Player 1, Gimme a Number: ");
    TooLargeTooSmall game = new TooLargeTooSmall(getANumber());

    do {
        System.out.print("Guess Player 1's Number: ");
    }while (!game.guessTheNumber(getANumber()));

    }
}
