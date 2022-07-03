package math

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.security.InvalidParameterException

internal class FactorialKtTest {
    @Test
    fun `should get a normal factorial result`() {
        val input = 6
        val expectedFactorial = 720
        assert(factorialIterative(input) == expectedFactorial)
        assert(factorialRecursive(input) == expectedFactorial)
    }

    @Test
    fun `should throw exception while input is smaller than zero`() {
        val input = -7
        assertThrows<InvalidParameterException> { factorialIterative(input) }
        assertThrows<InvalidParameterException> { factorialRecursive(input) }
    }

    @Test
    fun `should get 1 while given input is zero`() {
        val input = 0
        val expectedFactorial = 1
        assert(factorialIterative(input) == expectedFactorial)
        assert(factorialRecursive(input) == expectedFactorial)
    }
}