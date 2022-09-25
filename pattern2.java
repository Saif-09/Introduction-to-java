import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int col = 1;
            while(col<=i){
                System.out.print(col);
                col++;
            
            }
            System.out.println();
            i++;
            
        }       
        
    }
    
}
