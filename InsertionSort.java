import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {7,2,0,9,5,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
    	
        for (int i=1;i<arr.length; i++) { // inserted Ith element in sorted position
			int j;
			int temp = arr[i]; 
			for ( j=i-1; j>=0 && arr[j]>temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;   // position will be j+1
		}
    }

}