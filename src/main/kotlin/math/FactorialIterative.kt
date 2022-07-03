package math

import java.security.InvalidParameterException

@Throws(InvalidParameterException::class)
fun factorialIterative(number: Int): Int {
    if (number < 0) {
        throw InvalidParameterException("The number of which to calculate the factorial must be greater or equal to zero.")
    }

    // The initial value of the factorial.
    var value = 1

    for (multiplier in 1..number) {
        value *= multiplier
    }

    return value
}
