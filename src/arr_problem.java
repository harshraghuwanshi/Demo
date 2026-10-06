import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;

public class arr_problem {
    public static void main (String[]args){
        /* int sum  = 0; // seriansh array question 1
        int mean = 0;
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[ ] = new int [n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            mean = sum / n;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(mean);
    }
}
    */
        //int sum = 0;
        int [] arr = { 32,35,65,76,34,87 };
        int greatest = arr[0];
        for ( int  i = 1; i < arr.length ; i++) {
            if(arr[i] > greatest ){
                greatest = arr[i];
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println(greatest);



    }



}
