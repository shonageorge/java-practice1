//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//        and adds them together. The program should display total of the given input number and should
//        only consider integer value.The program should display an error message if there are any non
//        integer values


import java.util.*;

public class Sum {

    public static void add(){
        int i,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=scanner.nextInt();                              // read the limit
        System.out.println("Enter the numbers");
        int[] arr=new int[limit];                                 //initialize the array
        for(i=0;i<limit;i++){
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum is:"+sum);
    }

    public static void main(String[] args) {
        add();                                                    //function call
    }
}
