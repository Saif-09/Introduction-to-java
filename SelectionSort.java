import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {7,2,0,9,5,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int []arr){
        int n = arr.length;
      
        for(int i = 0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i ; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp; 
        }

    }
    
}
