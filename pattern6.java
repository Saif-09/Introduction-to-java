import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp,inc,dec;
        int i = 1;
        int p = 1;
        while(i<=n){
            p = i;
            //for spaces
            sp = 1;
            while(sp<=n-i){
            System.out.print(" ");
            sp++;
            }
            //for increasing numbers
            inc = 1;
            while(inc<=i){
                System.out.print(p);
                inc++;
            }
            //for dec num 
            dec = 1;
            while(dec<= i-1){
                System.out.print((2*i)-2);
            }
        }
    
    }
    
}
