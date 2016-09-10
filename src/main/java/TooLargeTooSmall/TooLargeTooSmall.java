package TooLargeTooSmall;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class TooLargeTooSmall {

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
    public static void guessTheNumber(){
        System.out.print("Player 1, Gimme A Number: ");
        int i = getANumber();
        int tries = 0, enteredNumber, lastNumber=Integer.MIN_VALUE;

        do {
            System.out.print("Guess Player 1's Number: ");
            enteredNumber = getANumber();

            if(enteredNumber>i){
                System.out.println("Too Large");
                if(lastNumber!=enteredNumber)tries++;
            }else if (enteredNumber<i){
                System.out.println("Too Small");
                if(lastNumber!=enteredNumber)tries++;
            }else {
                System.out.println("You tried " + tries + " times!");
                return;
            }

            lastNumber=enteredNumber;
        }while (enteredNumber != i);
        System.out.println("Fail?");
        return;
    }

    public static void main(String[] args) {


        guessTheNumber();


    }
}
