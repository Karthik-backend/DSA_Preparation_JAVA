import java.util.*;

class ReverseNumber{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(rev2(n));
    }
    static int sum = 0;
    static int rev1(int n){
        if(n==0) return 0;
        int rem = n%10; 
        sum = (sum*10) + rem;
        rev1(n/10);
        return sum;
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (rem * ((int) Math.pow(10, digits))) + helper(n/10, digits-1);
    }
    static int rev2(int n){
         int digits = (int) (Math.log10(n));
         return helper(n, digits);
    }
}