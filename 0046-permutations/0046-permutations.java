class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recur(nums,0, result);
        return result;
    }
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
    public static void recur(int[] nums, int idx, List<List<Integer>> result) {
        if(idx == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0;i<nums.length ; i++){
                ds.add(nums[i]);
                
            }
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx;i<nums.length;i++){
            swap(i,idx,nums);
            recur(nums , idx + 1 , result);
            swap(i ,idx,nums);
        }
    }
}