class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String midchar = "";
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            int count = freq[i];
            int mid  = count / 2;
            if(count%2 !=0){
                midchar = String.valueOf((char)(i+'a'));
            }
            while(mid>0){
                sb.append((char) (i+'a'));
                mid--;
            } 
        }
        return sb.toString() + midchar + sb.reverse().toString();
    }
}