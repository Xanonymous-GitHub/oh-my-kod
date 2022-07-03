package math

data class AckermanResult(val result: Int, val callTimes: Int)

fun ackerman(m: Int, n: Int, callTimes: Int = 1): AckermanResult = when {
    m == 0 -> AckermanResult(n + 1, callTimes)
    m > 0 && n == 0 -> ackerman(m - 1, 1, callTimes + 1)
    else -> {
        val sub = ackerman(m, n - 1, callTimes + 1)
        ackerman(m - 1, sub.result, sub.callTimes + 1)
    }
}
