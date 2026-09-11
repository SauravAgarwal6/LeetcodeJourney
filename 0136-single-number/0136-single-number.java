class Solution {
    public int singleNumber(int[] nums) {
        int miss = 0;
        for(int num: nums){
            miss ^= num;
        }
        return miss;
    }
}