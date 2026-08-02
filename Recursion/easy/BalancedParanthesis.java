import java.util.*;
class BalancedParanthesis{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        Stack<Character> st = new Stack<Character>();
        if(isValid(s,0,st)) System.out.println("Balanced Parantesis");
        else System.out.println("Not a Balanced Parenthesis");
    }
    static boolean isValid(String s, int index, Stack<Character> st){
        if(index==s.length()) return st.isEmpty();
        char ch = s.charAt(index);
        if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
        else{
            if(st.isEmpty()) return false;
            char top = st.pop();
            if((ch==')' && top!= '(') ||
               (ch==']' && top!= '[') ||
               (ch=='}' && top!= '{'))
               return false;     
        }
        return isValid(s,index+1,st);
    }
}