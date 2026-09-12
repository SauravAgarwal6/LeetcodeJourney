class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int right = n - 1;
        int left = 0;
        int mid = 0;
        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(mid, right, nums);
                right--;
            } else if (nums[mid] == 0) {
                swap(left, mid, nums);
                mid++;
                left++;
            } else {
                mid++;
            }
        }

    }

    public void swap(int x, int y, int[] nums) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}