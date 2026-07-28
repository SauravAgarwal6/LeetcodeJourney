class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        
        // Count frequencies using charAt (slightly faster than toCharArray which creates a new array)
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        char[] res = new char[n];
        int left = 0;
        int right = n - 1;
        
        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            
            // If the count is odd, place this character exactly in the middle
            if (count % 2 != 0) {
                res[n / 2] = (char) (i + 'a');
            }
            
            // Fill from both the left and right sides simultaneously
            int pairs = count / 2;
            while (pairs > 0) {
                res[left++] = (char) (i + 'a');
                res[right--] = (char) (i + 'a');
                pairs--;
            }
        }
        
        // Convert the final array directly to a String once
        return new String(res);
    }
}