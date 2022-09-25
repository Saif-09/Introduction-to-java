import java.util.*;
public class arrayfunc {
    
    public static void printarray(int a[]){
        int n = a.length;
        int sum = 0;
        for(int i= 0; i<n; i++){
            sum = sum+a[i];
            
        }System.out.println(" sum of all array is " +sum);
          
    }
    public static int[] inputarray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println(" Enter the number to be enter in "+ i +" th term");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int arr[] = inputarray();
    
            printarray(arr);
        }
        
    }
}
