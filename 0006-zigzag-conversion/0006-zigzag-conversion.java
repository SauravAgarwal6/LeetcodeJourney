class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder ans = new StringBuilder();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            int i = row;
            boolean goingDown = true;

            int step1 = cycleLen - 2 * row;
            int step2 = cycleLen - step1;

            while (i < s.length()) {
                ans.append(s.charAt(i));

                if (row == 0 || row == numRows - 1) {
                    i += cycleLen;
                } else {
                    i += goingDown ? step1 : step2;
                    goingDown = !goingDown;
                }
            }
        }
        return ans.toString();
    }
}
