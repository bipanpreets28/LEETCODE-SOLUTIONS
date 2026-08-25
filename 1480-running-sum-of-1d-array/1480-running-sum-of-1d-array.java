class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i= 0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
        }
    public static void main(String[] args)
    {
            Solution s1 = new Solution();
            int[] result = s1.runningSum(new int[]{1,1,1,1,1});
            System.out.println(result);
    }
}