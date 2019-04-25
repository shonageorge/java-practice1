//10. Write a program for the following condition:
//        Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//        repeat n number of times in the output String.


import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class RepeatNtimes {
    public static void repeat(){
        int i,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string");
        String string=scanner.next();
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        char[] ch=string.toCharArray();
        int length=string.length();
        int index=length-number;

        System.out.print(ch);
        for(i=index;i<length;i++){
            for(j=index;j<length;j++){
                System.out.print(ch[j]);
            }
        }
    }
    public static void main(String[] args) {
        repeat();

    }
}
