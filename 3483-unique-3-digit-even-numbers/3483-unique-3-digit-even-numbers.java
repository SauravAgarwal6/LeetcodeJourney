class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0)
                continue;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;
                    int num = digits[k] + 10 * digits[j] + 100 * digits[i];
                    if(num % 2 == 0){
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}