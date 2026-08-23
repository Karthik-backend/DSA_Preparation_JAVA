import java.util.*;

public class DecrementDiff {
    
    public static void main(String [] args){
        funPre(5);
    }

    //pre increment
    static int funPre(int n){
        if(n==0) return 1;
        System.out.println(n);
        return funPre(--n);
    }

    //post increment throws error because the base condition will never be attained
    static int funPost(int n){
        if(n==0) return 1;
        System.out.println(n);
        return funPost(n--);
    }
    
}
