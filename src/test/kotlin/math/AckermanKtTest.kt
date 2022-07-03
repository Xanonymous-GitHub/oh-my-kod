package math

import org.junit.jupiter.api.Test

internal class AckermanKtTest {
    @Test
    fun `should get correct ackerman result`() {
        val givenM = 2
        val givenN = 2

        val expectedResult = 7
        val expectedCallTimes = 27

        val ans = ackerman(givenM, givenN)
        assert(ans.result == expectedResult)
        assert(ans.callTimes == expectedCallTimes)
    }
}
