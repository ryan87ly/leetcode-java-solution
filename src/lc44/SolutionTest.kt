package lc44

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun isMatch() {
        assertTrue(Solution().isMatch("abefcdgiescdfimde", "ab*cd?i*de"))
    }
}