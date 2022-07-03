package math

import java.security.InvalidParameterException

@Throws(InvalidParameterException::class)
fun factorialRecursive(number: Int): Int {
    if (number < 0) {
        throw InvalidParameterException("The number of which to calculate the factorial must be greater or equal to zero.")
    }

    return when (number) {
        0 -> 1
        1 -> 1
        else -> number * factorialRecursive(number - 1)
    }
}
