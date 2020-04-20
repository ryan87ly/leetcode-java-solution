package lc312;

public class Solution {
   public int maxCoins(int[] nums) {
        int[] array = new int[nums.length + 2];
        int index = 1;
        for(int num : nums) {
            if (num > 0) array[index ++] = num;
        }
        array[0] = array[index++] = 1;
        int[][] dp = new int[index][index];
        for (int gap = 2; gap < index; ++ gap) {
            for (int left = 0; left < index - gap; ++ left) {
                int right = left + gap;
                for (int currentIndex = left + 1; currentIndex < right; ++ currentIndex) {
                    dp[left][right] = Math.max(dp[left][right], dp[left][currentIndex] + dp[currentIndex][right] +
                        array[left] * array[currentIndex] * array[right]);
                }
            }
        }

        return dp[0][index - 1];
    }

}