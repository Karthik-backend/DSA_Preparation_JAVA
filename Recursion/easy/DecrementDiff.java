import java.util.*;

public class DecrementDiff {
    
    public static void main(String [] args){
        fun(5);
    }
    static int fun(int n){
        if(n==0) return 1;
        System.out.println(n);
        return fun(--n);
    }
    
}
