class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;

        // Prefix sum
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + candiesCount[i];
        }

        boolean[] answer = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int type = queries[i][0];
            int day = queries[i][1];
            int cap = queries[i][2];

            // Minimum and maximum candies eaten by this day
            long minEaten = day + 1L;
            long maxEaten = (day + 1L) * cap;

            // Check if the possible ranges overlap
            answer[i] =
                minEaten <= prefix[type + 1]
                && maxEaten > prefix[type];
        }

        return answer;
    }
}
