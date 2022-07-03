package math

import org.junit.jupiter.api.Test

internal class FibonacciKtTest {
    @Test
    fun `should get correct fib result`() {
        val input = 16
        val expectedFibResult = 987
        assert(fibRecursive(input) == expectedFibResult)
        assert(fibIterative(input) == expectedFibResult)
    }
}
