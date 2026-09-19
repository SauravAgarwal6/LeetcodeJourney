class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0 ; i < n ;i++){
            reverse(0 , n-1 , matrix[i]);
        }
    }
    public void reverse(int i , int j , int[] nums){
        while(i < j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}