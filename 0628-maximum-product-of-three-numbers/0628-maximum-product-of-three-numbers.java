class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MAX_VALUE; 
        int m3 = Integer.MAX_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            } else if (nums[i] > m2) {
                m3 = m2;
                m2 = nums[i];
            } else if (nums[i] > m3) {
                m3 = nums[i];
            }
            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }else if(min2 > nums[i]){
                min2 = nums[i];
            }
        }
        return Math.max(m1*m2*m3 , m1*min1*min2);
    }
}