

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
    	
        try (Scanner sc = new Scanner(System.in)) {
			//here we call the functions for binary search
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n;i++){
			    arr[i] = sc.nextInt();
			    
			}
			int ans = binarysearch(arr, 6);
			System.out.println(ans);
					
			
		}
    }
    public static int binarysearch(int arr[],int x){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(x>arr[mid]){
                start = mid+1;
            }
            else if(x<arr[mid]){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }

}  
