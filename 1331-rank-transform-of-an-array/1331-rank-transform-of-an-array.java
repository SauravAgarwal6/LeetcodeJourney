class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr2[] = arr.clone();
        Arrays.sort(arr2);
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0 ;i < arr.length;i++){
            if(!(map.containsKey(arr2[i]))){
                map.put(arr2[i] , count);
                count++;
            }
        }
        int ans[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                ans[i]= map.get(arr[i]);
            }
        }
        return ans;
    }
}