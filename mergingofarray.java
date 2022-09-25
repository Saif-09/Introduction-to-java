import java.util.Arrays;
public class mergingofarray {
    public static void main(String[] args) { 
        int[] arr1 = {2,5,9,25,63,77};
        int[] arr2 = {0,6,12,96,110};
        int [] arr3 = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] merge(int []arr1, int[]arr2 ){
        int i=0, j=0,k=0;
        int []arr3 = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]= arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            while(i<arr1.length){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            while(j<arr2.length){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }
    
}
