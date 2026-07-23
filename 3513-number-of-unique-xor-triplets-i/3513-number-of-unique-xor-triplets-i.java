class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int mas = 0 ;
        for(int num:nums){
            mas |= num;
        }
        return mas+1;
    }
}