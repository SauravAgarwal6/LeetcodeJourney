class Solution {
    public long countCommas(long n) {
        long result = 0;
        long start = 1_000;
        long commas = 1;

        while (start <= n) {
            long end = Math.min(n, start * 1_000 - 1);

            result += (end - start + 1) * commas;

            start *= 1_000;
            commas++;
        }

        return result;
    }
}

