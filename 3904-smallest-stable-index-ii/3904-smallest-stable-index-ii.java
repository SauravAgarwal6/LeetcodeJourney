class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int min = nums[n-1];
        int sufMin[] = new int[n];
        sufMin[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0; i--){
            min = Math.min(min , nums[i]);
            sufMin[i] = min;
        }
        int max = 0 ;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max , nums[i]);
            if((max - sufMin[i])<= k){
                return i;
            }
        }
        return -1;
    }
}