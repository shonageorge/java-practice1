//9. Write a program to reverse any string without using String Buffer.
//        Input : london
//        Output : nodnol


import java.util.Scanner;

public class ReverseString {
    public static void stringReverse(){
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String s=scanner.next();                             // read the input as string
        int len=s.length();                                 //find the length of the string
        char[] arr=new char[len];
        for (i=0;i<len;i++){
            arr[i]=s.charAt(i);                            // converting string into character array
        }
        for(i=len-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        stringReverse();                                     //function call
    }
}
