import java.util.*;

public class CountZeros {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(zeros(n, 0));
        in.close();
    }
    
    static int zeros(int n, int count){
        if(n==0) return count;
        if((n%10) == 0) return zeros(n/10, count+1);
        return zeros(n/10, count);
    }
}
