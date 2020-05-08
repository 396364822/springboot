import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length < 1)return "";
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length() - 1);
            if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] a = {"flower","flow","flight"};
        Solution2 s = new Solution2();
        System.out.println(s.longestCommonPrefix(a));
    }
}
