import java.util.*;
public class assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        if(c==1){
            int sum = 0;
            for(int i=1; i<=n; i++){ 
                sum = sum+i;
                if(i==n){
                    System.out.println(sum);
                }    
            }   
        }
        else if(c==2){
            int product = 1;
            for(int j = 1; j<=n; j++){
                product = product * j;
                if(j==n){
                    System.out.println(product);
                }
            }
        }
        else{
            System.out.println(-1);
        }
    }
    
}
