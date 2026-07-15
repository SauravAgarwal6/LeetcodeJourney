class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even  = 0;
        int odd = 0;
        for(int i = 0 ; i < n*2 ; i++){
            if(i %2 ==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        return gcd(odd , even);
        
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b ;
            b = a % b;
            a = temp;
        }
        return a;
    }
}