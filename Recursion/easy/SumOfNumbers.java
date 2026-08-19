import java.util.*;

class SumOfNumbers{
    
    //Sum of numbers
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sum(num));
    }
    static int sum(int n){
        if(n==0) return 0;
        return (n%10) + sum(n/10);
    }

    //product of numbers
    // public static void main(String[] args){
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     System.out.println(product(n));
    // }
    // static int product(int n){
    //     if(n==0) return 1;
    //     return (n%10)*product(n/10);
    // }
}