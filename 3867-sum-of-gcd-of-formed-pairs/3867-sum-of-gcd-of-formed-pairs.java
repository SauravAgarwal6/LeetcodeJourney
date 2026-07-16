class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long max = 0;
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            max = Math.max(max, val);
            arr[i] = gcd(nums[i],max);
        }
        int i = 0 ; 
        int j = n-1;
        long sum = 0;
        Arrays.sort(arr);
        while(i<j){
            long v1 = arr[i];
            long v2 = arr[j];
            sum+= gcd(v1,v2);
            i++;
            j--;
        }
        return sum;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}