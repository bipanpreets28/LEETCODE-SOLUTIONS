class Solution {
    public int xorOperation(int n, int start) {
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i] = start + 2 * i;
        }
        int result = 0;
        for(int j=0;j<n;j++){
            result = result ^ nums[j];}
    return result;
 }
public static void main(String[] args){
     Solution obj = new Solution();
        System.out.println(obj.xorOperation(3, 0));
    }
}