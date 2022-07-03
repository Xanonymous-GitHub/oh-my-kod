package math

import org.junit.jupiter.api.Test
import java.security.InvalidParameterException

internal class FactorialRecursiveKtTest {
    @Test
    fun `should get a normal factorial result`() {
        val input = 6
        val expectedFactorial = 720
        assert(factorialRecursive(input) == expectedFactorial)
    }

    @Test
    fun `should throw exception while input is smaller than zero`() {
        val input = -7
        org.junit.jupiter.api.assertThrows<InvalidParameterException> { factorialRecursive(input) }
    }

    @Test
    fun `should get 1 while given input is zero`() {
        val input = 0
        val expectedFactorial = 1
        assert(factorialRecursive(input) == expectedFactorial)
    }
}
