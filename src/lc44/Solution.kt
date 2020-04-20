package lc44

class Solution {
    fun isMatch(s: String, p: String): Boolean {
        val sm = mutableMapOf<Pair<Int, Char>, Int>()
        var state = 0
        p.forEach { c ->
            val nextState = if (c == '*') state else state + 1
            sm[state to c] = nextState
            state = nextState
        }

        val final = s.fold(setOf(0)) { curr, c ->
           curr.flatMap { state ->
               listOf('*', '?', c).map {it
                   sm[state to it]
               }
           }
           .filterNotNull()
           .toSet()
        }
        return final.contains(state)
    }
}