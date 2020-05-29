
public class Solution5 {

    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
               nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int[] nums = new int[] {1,1,2,2,3,3};
        int i = s.removeDuplicates(nums);
        System.out.println(i);
    }
}
