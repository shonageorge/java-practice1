//7. Write a program which accepts a number as input from user and perform the following:
//        a. sort the number in non-increasing order
//        b. after sorting sum all the even numbers, the sum should be greater than 15 .
//        c. if sum is more than 15,then print output as true or false.

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void sort(){
        int i,j,temp,sum=0;
        Scanner scanner=new Scanner((System.in));
        System.out.println("Enter the number");
        int number=scanner.nextInt();                             // read the input
        int len=String.valueOf(number).length();                  // finding length of input
        int[] arr=new int[len];
        for (i=0;i<len;i++){                                      // entering elements into array
            arr[i]=number%10;
            number=number/10;

        }

        for(i=0;i<len;i++){                                       // sorting
            for(j=i+1;j<len;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(i=0;i<len;i++) {
            System.out.print(arr[i]);

            if(arr[i]%2==0){
                sum=sum+arr[i];                                 // finding sum of even numbers
            }
        }

        System.out.println("sum of even number is:"+sum);
        if(sum>15)                                                 // check sum greter then 15
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        sort();                                                    //function call
    }
}
