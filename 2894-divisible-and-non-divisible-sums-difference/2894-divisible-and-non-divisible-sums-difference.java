class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0,sum2=0;
        int[] num1 = new int[n+1];
        int[] num2 = new int[n+1];
        for(int i=1;i<n+1;i++){
            if(i%m !=0){
                num1[i] = i;
            }}
        for(int j=1;j<n+1;j++){
            if(j%m ==0){
                num2[j] = j;
            }}
        for(int i=1;i<n+1;i++){
            sum1 += num1[i];
            }
        for(int j=1;j<n+1;j++){
            sum2 += num2[j];
            }
            return sum1-sum2;
           }
        public static void main(String[] args)
        {
         Solution s1 = new Solution();
         System.out.println(s1.differenceOfSums(10, 3)); 


        }
    
}