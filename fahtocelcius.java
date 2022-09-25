import java.util.Scanner;
public class fahtocelcius {
    public static void function(int start, int end, int step){
        int fah;
        while(start<=end)
        {
            fah=((5*(start-32))/9);
            System.out.println(start+" "+fah);
            start+=step;
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        function(S,E,W);


    }
}

