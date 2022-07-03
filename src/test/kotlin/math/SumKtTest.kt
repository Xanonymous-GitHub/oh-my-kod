package math

import org.junit.jupiter.api.Test

internal class SumKtTest {
    @Test
    fun `should give correct summary result`() {
        val input = 10
        val expectedSum = 55
        assert(input.sumUpNumber == expectedSum)
    }
}
