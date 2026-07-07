class Solution {
    public String reverseVowels(String s) {
        if(s.length()<=1){
            return s;
        }
        int i = 0 ;
        int j = s.length()-1;
        StringBuilder sb= new StringBuilder(s);
        
       while(i<j){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }else if(isVowel(s.charAt(i))){
                j--;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }

}