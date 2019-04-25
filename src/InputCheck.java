//6. Write a program that takes a character from the user as input and determines whether the
//        character entered is a capital letter, a small case letter, a digit or a special symbol and display
//        appropriately.



import java.util.Scanner;

public class InputCheck {

    public static void characterCheck(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String s=scanner.next();                                    //Read the input
        char ch=s.charAt(0);                                        //convert string input to character
        if(Character.isDigit(ch)){                                  // check if the character is is digit
            System.out.println("Digit");
        }
        else if(Character.isLowerCase(ch)){                         //check if lower case
            System.out.println("Lowecase");
        }
        else if(Character.isUpperCase(ch)){                         // check if upper case
            System.out.println("Uppercase");
        }
        else{                                                        // else special characters
            System.out.println("Special Symbols");
        }
    }

    public static void main(String[] args) {

        characterCheck();                                            //function call
    }
}
