package Data_Structures;
import java.util.Scanner;

public class Array {
    public static void main(String args[]){               // Main Method
        Scanner sc = new Scanner(System.in);             // Scanner class to getting input from the user
        System.out.println("Enter the size of an array :");

        int n = sc.nextInt();                            // Getting Size of the array from User
        System.out.println("Enter elements in an array :");

        int arr [] = new int [n];                        // Make an empty Array of size n

        for(int i=0;i<n;i++){
            arr [i] = sc.nextInt();                     // Store the value in array one by one
        }

        System.out.println("Elements of an Array is: ");
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);                     // Print Elements in the Array
       }
    }
}
