import java.util.*;

public class NumPalindrome {
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==rev(n)) System.out.println(n+" is a palindrome number");
        else System.out.println(n+" is not a palindrome number");

        System.out.println("rev(n) = " + rev(n));
    }

    static int rev(int n){
        int digits = (int) (Math.log10(n));
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if(n==0) return 0;
        int rem = n%10;
        return (rem * (int)(Math.pow(10, digits))) + helper(n/10, digits-1);
    }
}
