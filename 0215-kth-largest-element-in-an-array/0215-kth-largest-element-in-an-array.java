class Solution {
    public int findKthLargest(int[] nums, int k) {
     
        int min = -10000;
        int max = 10000;
        int[] count = new int[max - min + 1]; 
        

        for (int num : nums) {
       
            count[num - min]++;
        }
        
       
        for (int i = count.length - 1; i >= 0; i--) {
            k -= count[i]; 
            
        
            if (k <= 0) {
                return i + min; 
            }
        }
        
        return -1;
    }
}
