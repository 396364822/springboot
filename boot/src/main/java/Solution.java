public class Solution {

    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        int preNum = changeNum(chars[0]);
        for (int i = 1;i < chars.length;i ++){
            int num = changeNum(chars[i]);
            if(num>preNum){
                sum-=preNum;
            }else {
                sum+=preNum;
            }
            preNum = num;
        }
        sum+=preNum;
        return sum;
    }

    public int changeNum(char s){
        int num = 0;
        String s1 = String.valueOf(s);
        switch (s1){
            case "I": num = 1;break;
            case "V": num = 5;break;
            case "X": num = 10;break;
            case "L": num = 50;break;
            case "C": num = 100;break;
            case "D": num = 500;break;
            case "M": num = 1000;break;
        }

        return num;
    }
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.romanToInt("XXVII"));
    }
}
