import java.util.*;
public class LinearSearch {
    
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
    public static int linearsearch(int a[], int x){
        for(int i=0; i<a.length;i++){
            if(x==a[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = inputarray();
        int result = linearsearch(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index"+ result);
        
    }
}


