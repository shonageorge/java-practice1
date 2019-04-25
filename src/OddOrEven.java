//2. Write a program which accepts an integer number as input from the user and perform the
//        following conditional checks:
//        a. Print Tom if number is odd and exists between 20 to 30
//        b. Print Jerry, if number is even and exists between 20 and 30

import java.io.*;
import java.util.*;
public class OddOrEven {

    public static void oddEven(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();                               //Read the input

        if(number>=20 && number<=30){

            if(number%2==0)                                         //check  the  number is even
                System.out.println("Jerry");

            else                                                    //check the number is odd
                System.out.println("Tom");


        }
        else
            System.out.println("invalid");
    }

    public static void main(String[] args) {

        oddEven();                                                   //function call
        }
}
