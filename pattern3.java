import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int stars;
        
        while(i<=n){
             stars = 1;
            while(stars<=n-i+1){
                
                System.out.print("*");
                stars++;
            }
            
            System.out.println();
            i++;
            
        }       
        
    }
    
}
