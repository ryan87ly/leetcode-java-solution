package lc312;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMaxCoins() {
        assertEquals(50, new Solution().maxCoins(new int[]{5, 2, 3}));
    }
}