import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int arr[] = {3,-1,5,1,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void bubble(int []arr){
        //we run step n-1 times where n is array lenghth
        for(int i = 0;i<arr.length;i++){
            //now the loop will put the max value at the end of array
            for(int j=1; j<arr.length-i;j++){
                //we swap value if the previous value is lesser than value at arr[j]
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

    }
}