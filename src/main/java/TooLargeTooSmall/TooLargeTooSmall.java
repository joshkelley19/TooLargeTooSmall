package TooLargeTooSmall;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class TooLargeTooSmall {

    static int tries = 0;
    private int player1Number,enteredNumber, lastNumber;


    public TooLargeTooSmall(){
        System.out.print("Player 1, Gimme A Number: ");
        this.player1Number=getANumber();
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
    public void guessTheNumber(){
            System.out.print("Guess Player 1's Number: ");
            enteredNumber = getANumber();

            if(enteredNumber>player1Number){
                System.out.println("Too Large");
                if(lastNumber!=enteredNumber)tries++;
            }else if (enteredNumber<player1Number){
                System.out.println("Too Small");
                if(lastNumber!=enteredNumber)tries++;
            }else {
                System.out.println("You tried " + tries + " times!");
            }

            this.lastNumber=this.enteredNumber;
            return;
    }

    public static void main(String[] args) {
    TooLargeTooSmall game = new TooLargeTooSmall();

    do {
        game.guessTheNumber();
    }while (game.enteredNumber != game.player1Number);

    }
}
