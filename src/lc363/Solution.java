package lc363;

import java.util.TreeSet;

class Solution {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int closest = Integer.MIN_VALUE;
        for (int i = 0; i < columns; i++) {
            int[] sums = new int[rows];
            for (int m = 0; m < rows; m++) {
                sums[m] = 0;
            }
            for (int j = i; j < columns; j++) {
                for (int n = 0; n < rows; n++) {
                    sums[n] += matrix[n][j];
                }
                TreeSet<Integer> set = new TreeSet<>();
                int curSum = 0;
                set.add(0);
                for (int sum : sums) {
                    curSum += sum;
                    Integer foundedValue = set.ceiling(curSum - k);
                    if (foundedValue != null && ((curSum - foundedValue) > closest)) {
                        closest = curSum - foundedValue;
                    }
                    set.add(curSum);
                }
            }

        }
        return closest;
    }
}