import java.util.*;
public class RemoveDuplicateString {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        System.out.println(ch[0]+cons(ch,1));
    }
    static String cons(char[] ch, int i){
        if(ch.length==i) return "";
        if(ch[i]!=ch[i-1]) return ch[i]+cons(ch, i+1);

        return cons(ch, i+1);
    }
}
