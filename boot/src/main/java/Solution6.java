public class Solution6 {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i<nums.length; i++) {
            if(val != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        int[] nums = new int[] {1,2,3,2,2,4,2,5};
        int i = s.removeElement(nums,2);
        System.out.println(i);
    }
}
