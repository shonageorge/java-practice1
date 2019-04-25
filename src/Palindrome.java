import java.util.*;
public class Palindrome {

    public static void palindromeCheck(){

        int i, j, flag = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();                              // read the input number
        int num=number;
        int length = String.valueOf(number).length();
        int[] array = new int[number];                         // initialize the array


        for (i = 0; i < length; i++) {                          // enter elements to array
            array[i] = number % 10;
            number = number / 10;
        }

        for (i = 0; i <length; i++) {
            for (j = length; j>=0; j--) {
                if (array[i] == array[j])
                    flag = 0;
                else
                    flag++;
            }
        }

        if (flag == 0) {
            for (i = 0; i <length; i++) {
                if (array[i] % 2 == 0) {
                    sum = sum + array[i];                            //finding sum of even numbers
                }
            }
            if (sum > 25)                                           // checking sum is greater than 25
                System.out.println(num+" is palindrome and sum of even numbers is greater than 25");
            else
                System.out.println(num+" is palindrome and sum of even numbers is less than 25");

        }

        else{
            System.out.println(num + " is not palindrome");
        }
    }

    public static void main(String[] args) {

        palindromeCheck();                                              //function call
    }

    }



