import java.util.Scanner;
public class sqaureRoot {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc = new Scanner(System.in);
        int N,i,sqrt=1;
        N=sc.nextInt();
        
        
        for(i=0;i<N/2;i++)
        {
            
            if((i*i)>N)
            {sqrt=i-1;
             break;
            }
        }
        
        System.out.println(sqrt);
	}
}