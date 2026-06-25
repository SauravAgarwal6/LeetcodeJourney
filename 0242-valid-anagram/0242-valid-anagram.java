class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0 ; i< s.length(); i++){
            freq[s.charAt(i) - 'a' ]++;
            freq[t.charAt(i) - 'a' ]--;
        }
        for(int count : freq){
            if(count != 0) return false;
        }
        return true;
    }
}