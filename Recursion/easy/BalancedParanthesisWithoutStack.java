import java.util.*;
public class BalancedParanthesisWithoutStack {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(isValid(s)) System.out.println("Balanced");
        else System.out.println("Not Balanced");
        in.close();
    }
    static boolean isValid(String s){
        if(s.length()==0) return true;
        String newString = s.replace("()","")
                            .replace("[]","")
                            .replace("{}","");
             
        if(newString.length()==s.length()) return false;
        return isValid(newString);
    }
}
