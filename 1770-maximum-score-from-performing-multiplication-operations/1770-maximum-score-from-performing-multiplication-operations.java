class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {

        int N = nums.length;
        int M = multipliers.length;

        // Pointer for traversing the multipliers array.
        int current = M;

        // Memoization involves saving the optimum solution from the previous operation for easy retrieval.
        // This is so that we can avoid repeating the operation, thus lowering time complexity.
        int[] maximumScore = new int[M];
        int[] memo = new int[M+1];

        // As we traverse from back to front of the multipliers array, 
        // we are also multiplying from the ends (left and right) to the center of the nums array.
        // Each iteration, we get the higher value sums of the multiplication and highest value from previous round (memo).
        // Note:
        // Imagine the first multiple (0) in the multipliers can only choose first left or right in the nums.
        // While the last multiple (M-1) in the multipliers can possibly choose 0 to M-th number from left or right nums.
		// Since choosing the first left or right number can affect the choice in the following iteration, we need to
        // record the highest scores possible starting from the last multiple (M-1), for the optimum number picking.
		
		// As both multipliers and nums is 1-indexed, we perform the --current and ++i, to exit the loop once reach 0.
        while (--current >= 0) {
            for (int i = 0; i <= current; ++i) {
                int left = memo[i+1] + multipliers[current] * nums[i];
                int right = memo[i] + multipliers[current] * nums[N - current + i - 1];
                maximumScore[i] = Math.max(left, right);
            }
            // Store the current round of maximumScores in the memo, for reference in the next round.
            memo = maximumScore;
        }
        return maximumScore[0];
    }
}