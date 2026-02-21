class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int N = n * n;

        long actualSum = 0;
        long actualSqSum = 0;

        // Calculate actual sum and square sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSqSum += (long) grid[i][j] * grid[i][j];
            }
        }

        // Expected sum and square sum
        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        // Differences
        long diff = expectedSum - actualSum;            // b - a
        long sqDiff = expectedSqSum - actualSqSum;      // b^2 - a^2

        // b^2 - a^2 = (b - a)(b + a)
        long sum = sqDiff / diff;   // b + a

        long missing = (diff + sum) / 2;
        long repeated = missing - diff;

        return new int[]{(int) repeated, (int) missing};
    }
}