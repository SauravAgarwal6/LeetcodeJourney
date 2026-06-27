class Solution {
    public int maximumLength(int[] nums) {
        HashMap < Integer , Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
            max = Math.max(max ,num);
        }
        int ans = 1 ; 
        if(map.containsKey(1)){
            int count  = map.get(1);
            ans = (count %2 == 0) ? count -1 :count;
        }

        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] ==1) continue;
            int x = nums[i];
            int len = 0;
            while(x <= max && map.getOrDefault(x,0)>=2){
                len+=2;
                x = x*x;
            }
            if (map.containsKey(x)) {
                ans = Math.max(ans, len + 1);
            } else {
                ans = Math.max(ans, len - 1);
            }
        }
        return ans;
    }
}