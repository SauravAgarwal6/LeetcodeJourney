class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2 ; i>= 0 ;i-- ){
            if(nums[i]< nums[i+1]){
                idx= i;
                break;
            }
        }
        if(idx == -1){
            reverse(0 , nums.length-1 ,nums);
            return;
        }
        for(int i = n-1 ; i > idx ; i--){
            if(nums[i] > nums[idx] ){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;

            }
        }
        reverse(idx+1 , nums.length-1 , nums);

    }
    public void reverse(int i , int j , int[] nums){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}