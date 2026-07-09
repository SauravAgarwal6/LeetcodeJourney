class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0 ; 
        int  j = nums.length-1;
        while(i<=j){
            if(nums[i] == val ){
                if(nums[j] != val){
                    nums[i]= nums[j];
                    j--;
                    i++;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return i;
    }
}