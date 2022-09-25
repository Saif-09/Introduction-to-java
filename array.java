import java.util.*;
public class array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n]; //here we are taking input of array size

        //Now we have to input values in every box of array
        for(int i=0;i<n;i++){
            System.out.println("Enter the number to be enter in "+ i +" th array");
            arr[i]= sc.nextInt();
        }

        //Now we have to print the array that we have created 
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
