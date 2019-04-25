//3. Create a program that accepts a word as input and checks for each single character letter in
//        the word whether it is a consonant or vowel.
//        Condition:
//        a. Print an error message if the input is not a letter
//        b. If the input having more than one letter, print the required output
//        (Vowel or Consonant) for each letter

import java.util.*;

public class Vowels {

    public static void vowelsAndConsonants(){
        int i;
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String s=scanner.next();                                  //read the input
        int len=s.length();
        for(i=0;i<len;i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("error");
            }
            else {
                                                                //check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    System.out.print( ch+"-Vowels, ");


                else                                            // check for consonants
                    System.out.print(ch+ "-Consonant,");
            }

        }
    }

    public static void main(String[] args) {
        vowelsAndConsonants();                                  //function call
    }
}
