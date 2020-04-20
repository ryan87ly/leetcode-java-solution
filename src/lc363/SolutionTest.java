package lc363;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMaxSumSubmatrix() {
        {
            int[][] matrix = new int[][]{
                    new int[]{1, 0, 1},
                    new int[]{0, -2, 3}
            };
            assertEquals(2, new Solution().maxSumSubmatrix(matrix, 2));
        }
        {
            int[][] matrix = new int[][]{
                    new int[]{2, 2, -1}
            };
            assertEquals(-1, new Solution().maxSumSubmatrix(matrix, 0));
        }

    }
}