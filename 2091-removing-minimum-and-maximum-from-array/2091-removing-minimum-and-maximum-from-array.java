class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int idx1 = 0;
        int idx2 = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
                idx1 = i+1;
            }
            if(nums[i]<min){
                min = nums[i];
                idx2 =i+1;
            }
        }
        int left = Math.min(idx1 , idx2);
        int right = Math.max(idx1 , idx2);

        int case1 = right;
        int case2 = n - left +1;
        int case3 = left + n- right +1;
        return Math.min(case1,Math.min(case2 , case3));
        
    }
}