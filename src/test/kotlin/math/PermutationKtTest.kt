package math

import org.junit.jupiter.api.Test

internal class PermutationKtTest {
    @Test
    fun `should list all orders of the char array`() {
        val givenCharArray = arrayOf('a', 'b', 'c', 'd')
        permutation(givenCharArray, length = givenCharArray.size)
    }
}
