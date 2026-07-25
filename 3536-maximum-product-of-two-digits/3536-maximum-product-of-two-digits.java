class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        int x = n;
        while(x>0){
            int rem = x%10;
            if(max1 < rem){
                max2 = max1;
                max1 = rem;
            }else if(max2 < rem){
                max2 =rem;
            }
            x= x / 10;
        }
        return max1 * max2;
    }
}