//4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//        6 6 . . . nth iteration.


import java.util.Scanner;

public class Iteration {

    public static void iteration(){
        int i,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=scanner.nextInt();                           // Read the limit
        for(i=1;i<=limit;i++){
            for (j=0;j<i;j++)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
       iteration();                                 //function call
    }
}
