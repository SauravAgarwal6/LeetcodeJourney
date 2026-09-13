class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> possi = new ArrayList<>();
        ArrayList<Integer> nega = new ArrayList<>();
        for(int  i = 0 ; i<nums.length ; i++){
            if(nums[i] >= 0){
                possi.add(nums[i]);
            }else{
                nega.add(nums[i]);
            }
        }
        int res[] = new int[nums.length];
        boolean check = true;
        int i = 0 , j= 0 , k=0;
        while(k < nums.length){
            if(check){
                res[k] = possi.get(i);
                check = false;
                i++;
            }else{
                res[k] = nega.get(j);
                check = true;
                j++;
            }
            k++;
        }
        return res;
    }
}