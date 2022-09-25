import java.util.*;
public class assignment4 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int i = 1;
    int r = 1;
    while(r<=p){
        i = i*n;
        r++;
    }
    System.out.println(i);
    
}
}
