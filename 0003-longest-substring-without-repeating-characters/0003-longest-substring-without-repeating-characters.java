class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max = 0;
        int count = 0;
        int left = 0;
        for(int  i = 0 ; i< s.length() ;i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                count--;
                left++;
                
            }
            set.add(ch);
            count++;
            max= Math.max(max,count);
        }
        return max;
    }
}