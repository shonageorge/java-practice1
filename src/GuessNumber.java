//8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//        100) User should guess until the the target number is guessed correctly.
//        Print separate messages for the following:
//        a. Number guessed is more than original number
//        b. Number guessed is less than original number
//        c. Number guessed matches the original number


import java.util.Scanner;
public class GuessNumber {

public static void numberGuess(){
    Scanner scanner=new Scanner(System.in);                          //Enter the target input
    System.out.println("Enter the target number");
    int targetNumber=scanner.nextInt();                             //read the input to a variable
    int guessedNumber=0;

    do{                                                             // loop to check original number equal to guessed number
        System.out.println("Guess the number");
        guessedNumber=scanner.nextInt();                             // read the guessed number
        if(targetNumber>=1&&targetNumber<=100);
        {
            if (guessedNumber > targetNumber)
                System.out.println("Number guessed is more than original number");
            else if (guessedNumber < targetNumber)
                System.out.println("Number guessed is less than original number");
            else
                System.out.println("Number guessed matches the original number");
        }
    }while(guessedNumber<targetNumber||guessedNumber>targetNumber);    // loop ends if guessed number is same as target number
    }


    public static void main(String[] args) {
      numberGuess();                                                  //function call
    }
}

