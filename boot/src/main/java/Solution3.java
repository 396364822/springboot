import java.util.HashMap;
import java.util.Stack;

public class Solution3 {

    HashMap<Character,Character> map;

    public Solution3(){
        this.map = new HashMap<>();
        this.map.put(')','(');
        this.map.put(']','[');  
        this.map.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> other = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char m = s.charAt(i);
            if(map.containsKey(m)){
                if(other.empty()){
                    other.push('#');
                }
                if(other.peek().equals(map.get(m))){
                    other.pop();
                }else {
                    return false;
                }
            }else {
                other.push(m);
            }
        }
        if(other.empty())return true;
        return false;
    }

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        String p = "{[]}";
        System.out.println(s3.isValid(p));

    }
}
