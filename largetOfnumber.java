import java.util.*;
public class largetOfnumber {
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
    public static int largestOf(int a[]){
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>max)
            max = a[i];
           
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]= inputarray();
        int lar = largestOf(arr);
        System.out.println(lar);
    }
    
}
