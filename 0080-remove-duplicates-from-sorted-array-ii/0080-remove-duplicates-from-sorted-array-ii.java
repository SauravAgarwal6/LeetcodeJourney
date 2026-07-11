class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[k] && count==2){
                continue;
            }else if(nums[i] == nums[k] && count < 2){
                count++;
                k++;
                nums[k] = nums[i];
            }else{
                nums[k+1] = nums[i];
                count = 1;
                k++;
            }
        }
        return k+1;
    }
}