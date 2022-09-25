import java.util.*;
public class TermsofAp {
    public static void main(String[] args) {
        int x; int n=1, sum , i = 1;
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        while(n<=x && n<=1000){
            sum = (3*i)+2;
            if(sum %4!=0){
                System.out.print(sum+" ");
                n++;
            }
            i++;
        }


    }
}
